package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericDaoMyself;
import com.idea.cjyl.core.generic.GenericServiceVOImpl;
import com.idea.cjyl.totalmodule.web.dao.BedMapper;
import com.idea.cjyl.totalmodule.web.dao.DataDictionaryMapper;
import com.idea.cjyl.totalmodule.web.dao.OlderMapper;
import com.idea.cjyl.totalmodule.web.dao.myself.OlderMapperMyself;
import com.idea.cjyl.totalmodule.web.domain.pojo.BedExample;
import com.idea.cjyl.totalmodule.web.domain.pojo.Older;
import com.idea.cjyl.totalmodule.web.domain.pojo.OlderExample;
import com.idea.cjyl.totalmodule.web.domain.vo.*;
import com.idea.cjyl.totalmodule.web.service.OlderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class OlderServiceImpl extends GenericServiceVOImpl<OlderVO, Older, Long, OlderExample> implements OlderService {

    @Autowired
    private OlderMapper olderDao;

    @Autowired
    private OlderMapperMyself olderMapperMyself;

    @Autowired
    private BedMapper bedMapper;

    @Autowired
    private DataDictionaryMapper dataDictionaryMapper;

    @Override
    public GenericDao<Older, Long, OlderExample> getDao() {
        return olderDao;
    }


    @Override
    public GenericDaoMyself<OlderVO, Older, Long, OlderExample> getVODao() {
        return olderMapperMyself;
    }

    @Override
    public OlderExample getModelExample(Older older) {
        OlderExample olderExample = new OlderExample();
        OlderExample.Criteria criteria = olderExample.createCriteria();
        if (older.getName() != null) {
            criteria.andNameLike(older.getName());
        }
        if (older.getTel() != null) {
            criteria.andTelLike(older.getTel());
        }
        if (older.getCardId() != null) {
            criteria.andCardIdLike(older.getCardId());
        }
        if (older.getCheckInDate() != null) {
            criteria.andCheckInDateEqualTo(older.getCheckInDate());
        }
        return olderExample;
    }


    @Override
    public OlderIntoInfoVO getIntoInfo() {
        OlderIntoInfoVO olderIntoInfoVO = new OlderIntoInfoVO();
        int beds = bedMapper.countByExample(new BedExample());
        olderIntoInfoVO.setBeds(beds);
        OlderExample olderExample = new OlderExample();
        olderExample.createCriteria().andOlderStateEqualTo((byte) 1);
        List<Older> olders = olderDao.selectByExample(olderExample);
        List<OlderWeekIntoVO> olderWeekIntoVOS = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            OlderWeekIntoVO olderWeekIntoVO = new OlderWeekIntoVO();
            olderWeekIntoVO.setMonth((i + 1));
            olderWeekIntoVOS.add(olderWeekIntoVO);
        }


        int girlNum = 0;
        int manNum = 0;
        Calendar cal_1 = Calendar.getInstance();
        Calendar cal_2 = Calendar.getInstance();
        cal_2.setTime(new Date());

        for (Older older : olders) {
            if (older.getSex() == 14) {
                manNum++;
            }
            if (older.getSex() == 15) {
                girlNum++;
            }
            cal_1.setTime(older.getCheckInDate());
            if (cal_1.getWeekYear() == cal_2.getWeekYear()) {
                for (int i = 0; i < 12; i++) {


                    OlderWeekIntoVO olderWeekIntoVO = olderWeekIntoVOS.get(i);
                    if (cal_1.get(Calendar.MONTH) == i ) {
                        if (older.getSex() == 15) {
                            olderWeekIntoVO.setGirlNum(olderWeekIntoVO.getGirlNum() + 1);
                        }
                        if (older.getSex() == 14) {
                            olderWeekIntoVO.setManNum(olderWeekIntoVO.getManNum() + 1);
                        }
                    }

                }


            }


        }

        olderIntoInfoVO.setManNum(manNum);
        olderIntoInfoVO.setGirlNum(girlNum);
        olderIntoInfoVO.setOlderWeekIntoVOS(olderWeekIntoVOS);
        return olderIntoInfoVO;
    }

    /**
     * 获取老人护理级别图
     * @return
     */
    @Override
    public List<MonthChargeCharVO> getMonthChargeCharVO() {
        List<OlderVO> olders = olderMapperMyself.findAllVO();
        Set<Long> monthChargeIds = new HashSet<>();
        List<MonthChargeCharVO> monthChargeCharVOS = new ArrayList<>();

        for (OlderVO olderVO:olders){
            monthChargeIds.add(olderVO.getMonthChargeId());
        }
        for (Long monthChargeId:monthChargeIds){
            MonthChargeCharVO monthChargeCharVO = new MonthChargeCharVO();
            monthChargeCharVO.setName(null);
            monthChargeCharVO.setValue(0);
            for(int i=0;i<olders.size();i++){

                if(monthChargeId==olders.get(i).getMonthChargeId()){
                    if(monthChargeCharVO.getName()==null){
                        if(olders.get(i).getMonthCharge()==null){
                            continue;
                        }
                        monthChargeCharVO.setName(olders.get(i).getMonthCharge().getNursingGrades());
                    }
                    monthChargeCharVO.setValue(monthChargeCharVO.getValue()+1);
                }
            }
            String[] color = new String[]{"0","1","2","3","4","5","6","7","8","9","A","B","C","D","F"};
            Random random = new Random();
            monthChargeCharVO.setColor("#"+color[random.nextInt(15)]+color[random.nextInt(15)]+color[random.nextInt(15)]+color[random.nextInt(15)]+color[random.nextInt(15)]+color[random.nextInt(15)]);
            monthChargeCharVOS.add(monthChargeCharVO);
        }






        return monthChargeCharVOS;
    }


    /**
     * 获取老人年龄
     * @return
     */
    @Override
    public Map<String, OlderAgeVO> getOlderAgeVO() {
        Map<String, OlderAgeVO> olderAgeMap = new HashMap<String, OlderAgeVO>();
        for(int i=50;i<=100;i++){
            OlderAgeVO olderAgeVO = new OlderAgeVO();
            olderAgeVO.setCreator(0);
            olderAgeVO.setRecipient(0);
            olderAgeMap.put(i+"",olderAgeVO);
        }

        List<Older> olders = olderDao.selectByExample(new OlderExample());

        Date nowDate = new Date();
        Long nowDateLong = nowDate.getTime();
        for (Older older:olders){


            long age =(nowDateLong-older.getBirthday().getTime())/3600/24/365/1000;
            if(olderAgeMap.get(age)!=null){
                OlderAgeVO olderAgeVO = (OlderAgeVO) olderAgeMap.get(age);
                if(older.getSex()==14){
                    olderAgeVO.setCreator(olderAgeVO.getCreator()+1);
                }else if(older.getSex()==15){
                    olderAgeVO.setRecipient(olderAgeVO.getRecipient()+1);
                }
            }
        }

        return olderAgeMap;
    }


    private static int getQuarterInMonth(int month, boolean isQuarterStart) {
        int months[] = {1, 4, 7, 10};
        if (!isQuarterStart) {
            months = new int[]{3, 6, 9, 12};
        }
        if (month >= 2 && month <= 4)
            return months[0];
        else if (month >= 5 && month <= 7)
            return months[1];
        else if (month >= 8 && month <= 10)
            return months[2];
        else
            return months[3];
    }
}
