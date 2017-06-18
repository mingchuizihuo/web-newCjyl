package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.ConsumptionRecordMapper;
import com.idea.cjyl.totalmodule.web.dao.ProductMapper;
import com.idea.cjyl.totalmodule.web.dao.SaivianRememberMapper;
import com.idea.cjyl.totalmodule.web.dao.ShopMapper;
import com.idea.cjyl.totalmodule.web.domain.Note;
import com.idea.cjyl.totalmodule.web.domain.ProductR;
import com.idea.cjyl.totalmodule.web.domain.pojo.*;
import com.idea.cjyl.totalmodule.web.service.SaivianRememberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Service
public class SaivianRememberServiceImpl extends GenericServiceImpl<SaivianRemember, Long, SaivianRememberExample> implements SaivianRememberService {

    @Autowired
    private SaivianRememberMapper saivianrememberDao;
    @Autowired
    private ShopMapper shopMapper;
    @Autowired
    private ConsumptionRecordMapper consumptionRecordMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ShopMapper shopMapper;

    @Override
    public GenericDao<SaivianRemember, Long, SaivianRememberExample> getDao() {
        return saivianrememberDao;
    }


    @Override
    public List<SaivianRemember> findAllByUser(Long userId) {
        SaivianRememberExample saivianRememberExample = new SaivianRememberExample();
        saivianRememberExample.createCriteria().andUserIdEqualTo(userId);
        List<SaivianRemember> saivianRemembers = saivianrememberDao.selectByExample(saivianRememberExample);
        return saivianRemembers;
    }

    //获取商店
    @Override
    public List<Shop> getShop() {
        List<Shop> shops = shopMapper.selectByExample(new ShopExample());

        return shops;
    }

    /**
     * 获取小票信息
     * @param saivianIds
     * @return
     */
    @Override
    public List<Note> getRecord(List<Long> saivianIds) {
        ConsumptionRecordExample example = new ConsumptionRecordExample();
        example.createCriteria().andUserSaivianIdIn(saivianIds);
        List<ConsumptionRecord> consumptionRecords =
                consumptionRecordMapper.selectByExample(example);

        //获取所有商品
        List<Product> products = productMapper.
                selectByExample(new ProductExample());
        //获取所有商铺
        List<Shop> shops = shopMapper.selectByExample(new ShopExample());

        List<Note> notes = new ArrayList<>();
        for (ConsumptionRecord consumptionRecord : consumptionRecords) {
            notes.add(consumption2Note(consumptionRecord,products,shops));
        }

        return notes;
    }


    public Note consumption2Note(ConsumptionRecord consumptionRecord,List<Product> products,List<Shop> shops){

        Note note = new Note();
        note.setConsumeNum(consumeNum(18));
        note.setSwipeNum(consumeNum(18));
        note.setConsumeDate(new Date());
        note.setConsumeMoney(1234.5);
        note.setBankName("招商银行");
        note.setBankNum("6666666666666666666");
        note.setEffectDate("00/00");
        note.setSwipeDate(new Date());
        List<ProductR> products1 = new ArrayList<>();


        ProductR product = new ProductR("测试商品1",2,(double)123.5,(double)123.5*2,(double)0.0);
        ProductR product2 = new ProductR("测试商品2",3,(double)115.5,(double)115.5*3,(double)0.0);
        products1.add(product);
        products1.add(product2);
        note.setProducts(products1);
        return note;


    }


    public String consumeNum(int n){
        Random random = new Random();
        StringBuffer s = new StringBuffer();

        for (int j = 0; j <n ; j++) {
            int i = random.nextInt(9) + 1;
            s.append(i+"");
        }
        return s.toString();

    }

}
