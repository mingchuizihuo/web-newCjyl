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

import java.util.*;


@Service
public class SaivianRememberServiceImpl extends GenericServiceImpl<SaivianRemember, Long, SaivianRememberExample> implements SaivianRememberService {

    @Autowired
    private SaivianRememberMapper saivianrememberDao;
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
        for (ConsumptionRecord consumptionRecord:consumptionRecords) {
            notes.add(consumption2Note(consumptionRecord,products,shops));
        }

        return notes;
    }

    //查看消费记录
    @Override
    public List<ConsumptionRecord> showRecord(Long saivianTableId) {
        ConsumptionRecordExample example = new ConsumptionRecordExample();
        example.createCriteria().andUserSaivianIdEqualTo(saivianTableId);
        List<ConsumptionRecord> consumptionRecords = consumptionRecordMapper.selectByExample(example);


        return consumptionRecords;
    }

    @Override
    public List<SaivianRemember> findByName(String saivianName) {
        SaivianRememberExample example = new SaivianRememberExample();
        example.createCriteria().andUserNameLike(saivianName);
        List<SaivianRemember> saivianRemembers = saivianrememberDao.selectByExample(example);
        return saivianRemembers;
    }


    public Note consumption2Note(ConsumptionRecord consumptionRecord,List<Product> products,List<Shop> shops){
        Random random = new Random();
        Date consumeDate = new Date(consumptionRecord.getConsumeDate().getTime()+(1000*60*60*(random.nextInt(20)+1))+1000*60*random.nextInt(59));
        Note note = new Note();
        note.setConsumeNum(consumeNum(20));
        note.setSwipeNum(consumeNum(20));
        note.setConsumeDate(consumeDate);

        note.setBankName(consumptionRecord.getBankName());
        note.setBankNum(consumptionRecord.getBankCardNum());
        note.setEffectDate(consumptionRecord.getBankEffectiveDate());
        note.setSwipeDate(new Date(consumeDate.getTime()+1000*60));
        note.setShopCode(consumptionRecord.getShopCode());


        //获取本商铺的产品
        List<Product> product = getProduct(products, getShopCode(shops, consumptionRecord.getShopCode()));
        if(product.size()!=0){
            List<ProductR> products1 =getProducts(consumptionRecord,product);
            note.setProducts(products1);

        }





        note.setConsumeMoney(Double.parseDouble(consumptionRecord.getConsumeMoney()));
        return note;


    }

    //动态选取商品
    public List<ProductR> getProducts(ConsumptionRecord consumptionRecord,List<Product> products){



        String consumeMoney = consumptionRecord.getConsumeMoney();
        Double resultTotal = 0.0;
        Double d = Double.parseDouble(consumeMoney);
        List<ProductR> productRS = new ArrayList<>();

        //随机数准备
        Map<Integer,Double[]> map1 = new HashMap<>();
        Double[] d1 = {3.0/5,1.0/5,3.0/10};
        Double[] d2 ={2.0/5,1.0/5,3.0/10,5.7/10};
        map1.put(1,d1);
        map1.put(2,d2);

        Random random = new Random();
        int randomNum = random.nextInt(2) + 1;
        Double balance = 0.0;

        for(int i = 0; i<map1.get(randomNum).length;i++){

            Double money = map1.get(randomNum)[i]*d;
            if(i==map1.get(randomNum).length-1){
                money = money+balance;
                while(true){
                    int i1 = random.nextInt(products.size());
                    Product product = products.get(i1);
                    if(Double.parseDouble(product.getProductPrice())<money){

                        double floor = Math.ceil(money / Double.parseDouble(product.getProductPrice()));
                        balance =balance+ money - Double.parseDouble(product.getProductPrice())*floor;

                        ProductR productR = new ProductR(product.getProductName(),floor,Double.parseDouble(product.getProductPrice()), Double.parseDouble(product.getProductPrice())*floor,0.0);

                        productRS.add(productR);
                        resultTotal+= Double.parseDouble(product.getProductPrice())*floor;

                        break;
                    }
                }


            }else{

                while(true){
                    if(products.size()==0){
                        System.out.println(products.size());
                    }
                    int i1 = random.nextInt(products.size());
                    Product product = products.get(i1);
                    if(Double.parseDouble(product.getProductPrice())<money){

                        double floor = Math.floor(money / Double.parseDouble(product.getProductPrice()));
                        balance =balance+ money - Double.parseDouble(product.getProductPrice())*floor;

                        ProductR productR = new ProductR(product.getProductName(),floor,Double.parseDouble(product.getProductPrice()), Double.parseDouble(product.getProductPrice())*floor,0.0);
                        productRS.add(productR);
                        resultTotal+= Double.parseDouble(product.getProductPrice())*floor;
                        break;
                    }
                }
            }

        }


        consumptionRecord.setConsumeMoney(resultTotal+"");

        return productRS;



    }



    //获取本商店应有产品
    public List<Product> getProduct(List<Product> products,int shopType){
        List<Product> products1 = new ArrayList<>();
        for (Product product : products) {
            if(shopType==3){
                if(product.getProductType()==4 || product.getProductType()==5){
                    products1.add(product);
                }
            }
            if(product.getProductType()==shopType){
                products1.add(product);
            }
        }
        return  products1;
    }
    //获取商店编码
    public int getShopCode(List<Shop> shops,String shopCode){
        for (Shop shop : shops) {
         if(shop.getShopCode().equals(shopCode)){
             return shop.getShopType();
         }
        }
        return 0;
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
