package com.idea.cjyl.totalmodule.web.service.impl;

import com.idea.cjyl.totalmodule.web.domain.pojo.*;
import com.idea.cjyl.totalmodule.web.domain.vo.*;
import com.idea.cjyl.totalmodule.web.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiao on 2016/12/13.
 */
@Service
public class ArrearageNoteServiceImpl implements ArrearageNoteService {
    @Autowired
    private OlderCostService olderCostService;
    @Autowired
    private OlderMonthChargeService olderMonthChargeService;
    @Autowired
    private OlderInitialFeeService olderInitialFeeService;

    @Autowired
    private OlderService olderService;

    @Autowired
    private BedService bedService;
    @Autowired
    private RoomService roomService;



    @Override
    public List<ArrearageNoteVO> findAllVO(Long state,Integer currentPage, Integer limit) {
        List<Long> olderIds = new ArrayList<>();
        Map<Long,Integer> Oldermoney = new HashMap<>();

        /**
         * 获取入住初始费欠费老人
         */
        OlderInitialFee olderInitialFee = new OlderInitialFee();
        olderInitialFee.setCheckInInitCostState(state);
        List<OlderInitialFeeVO> olderInitialFeeVOS = olderInitialFeeService.findVOByExapmle(olderInitialFee,1,1000);
        for (OlderInitialFeeVO olderInitialFeeVO:olderInitialFeeVOS){
            int money=0;
            olderIds.add( olderInitialFeeVO.getOlderId());
          for (CheckInInitCost checkInInitCost :olderInitialFeeVO.getCheckInInitCostList()){
              money+=checkInInitCost.getMoney();
          }
            int count = 0;
            if(Oldermoney.size()==0){
                Oldermoney.put(olderInitialFeeVO.getOlderId(),money);
            }else{
                for (Map.Entry<Long,Integer> entry:Oldermoney.entrySet()){
                    if(entry.getKey()==olderInitialFeeVO.getOlderId()){
                        entry.setValue(entry.getValue()+money);
                    }else{
                        if(count==Oldermoney.size()-1){
                            Oldermoney.put(olderInitialFeeVO.getOlderId(),money);
                        }
                    }
                    count++;
                }
            }


        }
        /**
         * 获取月收费欠费老人
         */
        OlderMonthCharge olderMonthCharge = new OlderMonthCharge();
        olderMonthCharge.setOlderMonthChargeState(102l);
        List<OlderMonthChargeVO> olderMonthChargeVOS = olderMonthChargeService.findVOByExapmle(olderMonthCharge,1,1000);

        for(OlderMonthChargeVO olderMonthChargeVO : olderMonthChargeVOS){
           olderIds.add( olderMonthChargeVO.getOlderId());
            int count = 0;
            int money=0;
            if(olderMonthChargeVO.getMonthCharge()==null){
                money = 0;
            }else{
                money=olderMonthChargeVO.getMonthCharge().getTotal();

            }
            if(Oldermoney.size()==0){
                Oldermoney.put(olderMonthChargeVO.getOlderId(),money);
            }else{
                for (Map.Entry<Long,Integer> entry:Oldermoney.entrySet()){
                    if(entry.getKey()==olderMonthChargeVO.getOlderId()){
                        entry.setValue(entry.getValue()+money);
                    }else{
                        if(count==Oldermoney.size()-1){
                            Oldermoney.put(olderMonthChargeVO.getOlderId(),money);
                        }
                    }
                    count++;
                }
            }


        }

        /**
         * 获取老人特殊服务费欠费
         */
        OlderCost olderCost = new OlderCost();
        olderCost.setServiceChargeState(state);
        List<OlderCostVO> olderVOS = olderCostService.findVOByExapmle(olderCost,1,1000);

        for (OlderCostVO olderCostVO:olderVOS){
            olderIds.add(olderCostVO.getOlderId());
            int count = 0;
            int money=olderCostVO.getServiceCharge().getMoney();
            if(Oldermoney.size()==0){
                Oldermoney.put(olderCostVO.getOlderId(),money);
            }else{
                for (Map.Entry<Long,Integer> entry:Oldermoney.entrySet()){
                    if(entry.getKey()==olderCostVO.getOlderId()){
                        entry.setValue(entry.getValue()+money);
                    }else{
                        if(count==Oldermoney.size()-1){
                            Oldermoney.put(olderCostVO.getOlderId(),money);
                        }
                    }
                    count++;
                }
            }

        }

        /**
         * 获取老人
         */
        OlderExample olderExample = new OlderExample();
        olderExample.createCriteria().andIdIn(olderIds);
        List<Older> olders = olderService.selectList(olderExample);
        List<ArrearageNoteVO> arrearageNoteVOS = new ArrayList<>();
        for(Older older:olders){
            ArrearageNoteVO arrearageNoteVO = new ArrearageNoteVO();
            arrearageNoteVO.setOlderName(older.getName());
            //获取床信息
            BedExample bedExample = new BedExample();
            List<Bed> beds = bedService.selectList(bedExample);
            if(beds.size()==0){
                arrearageNoteVO.setBedNum(0+"");
            }else{
                arrearageNoteVO.setBedNum(beds.get(0).getBedNum()+"");
                //获房信息
                arrearageNoteVO.setFloorNum(roomService.selectById(beds.get(0).getRoomId()).getRoomNum());
            }
            if(older.getSex()==14){
                arrearageNoteVO.setSex("男");
            }else if(older.getSex()==15){
                arrearageNoteVO.setSex("女");
            }
            for (Map.Entry<Long,Integer> entry:Oldermoney.entrySet()){
                if(entry.getKey()==older.getId()){
                    arrearageNoteVO.setMoney(entry.getValue());
                }
            }
            arrearageNoteVOS.add(arrearageNoteVO);
        }


        return arrearageNoteVOS;
    }
}
