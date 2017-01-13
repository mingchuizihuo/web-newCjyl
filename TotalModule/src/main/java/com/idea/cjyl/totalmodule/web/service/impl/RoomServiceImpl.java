package com.idea.cjyl.totalmodule.web.service.impl;


import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;

import com.idea.cjyl.totalmodule.web.dao.RoomMapper;
import com.idea.cjyl.totalmodule.web.domain.pojo.Room;
import com.idea.cjyl.totalmodule.web.domain.pojo.RoomExample;
import com.idea.cjyl.totalmodule.web.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class RoomServiceImpl extends GenericServiceImpl<Room, Long,RoomExample> implements RoomService {

       @Autowired
       private RoomMapper roomDao;
       @Override
       public GenericDao<Room, Long,RoomExample> getDao() {
       return roomDao;
       }


}
