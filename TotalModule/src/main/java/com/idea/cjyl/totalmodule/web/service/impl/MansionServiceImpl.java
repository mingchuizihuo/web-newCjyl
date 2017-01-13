package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.BedMapper;
import com.idea.cjyl.totalmodule.web.dao.FloorTierMapper;
import com.idea.cjyl.totalmodule.web.dao.MansionMapper;
import com.idea.cjyl.totalmodule.web.dao.RoomMapper;
import com.idea.cjyl.totalmodule.web.dao.myself.MansionMapperMyself;
import com.idea.cjyl.totalmodule.web.domain.pojo.*;
import com.idea.cjyl.totalmodule.web.domain.vo.MansionVO;
import com.idea.cjyl.totalmodule.web.service.MansionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public class MansionServiceImpl extends GenericServiceImpl<Mansion, Long,MansionExample> implements MansionService {

       @Autowired
       private MansionMapper mansionDao;
       @Autowired
       private MansionMapperMyself mansionMapperMyself;
       @Autowired
       private FloorTierMapper floorTierMapper;
       @Autowired
       private RoomMapper roomMapper;
       @Autowired
       private BedMapper bedMapper;
       @Override
       public GenericDao<Mansion, Long,MansionExample> getDao() {
       return mansionDao;
       }

       public void insert(Mansion mansion,int floorNum,int roomNum,int bedNum,Long loginId){
          mansion.setOrganizationLoginId(loginId);
          mansionDao.insert(mansion);
          for(int i=0;i<floorNum;i++){
             FloorTier floorTier = new FloorTier();
             floorTier.setOrganizationLoginId(loginId);
             floorTier.setFloorTier("第"+(i+1)+"层");
             floorTier.setMansionId(mansion.getId());
             floorTierMapper.insert(floorTier);
             for(int j = 0;j<roomNum;j++){
                Room room = new Room();
                room.setOrganizationLoginId(loginId);
                room.setFloorTierId(floorTier.getId());
                room.setRoomType((byte)1);
                room.setRoomNum(""+mansion.getId()+i+"0"+(j+1));
                roomMapper.insert(room);
                for(int k=0;k<bedNum;k++){
                   Bed bed = new Bed();
                   bed.setOrganizationLoginId(loginId);
                   bed.setBedNum((byte)(k+1));
                   bed.setOlderId(0l);
                   bed.setRoomId(room.getId());
                   bed.setBedState((byte)1);
                   bedMapper.insert(bed);
                }
             }

          }
       }

   @Override
   public List<MansionVO> findAllVO() {
      return mansionMapperMyself.findAllVO();
   }
}
