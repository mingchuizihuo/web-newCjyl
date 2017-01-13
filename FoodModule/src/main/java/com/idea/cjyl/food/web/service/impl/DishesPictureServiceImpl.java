package com.idea.cjyl.food.web.service.impl;



import com.idea.cjyl.core.generic.GenericDao;
import com.idea.cjyl.core.generic.GenericServiceImpl;
import com.idea.cjyl.food.web.dao.DishesPictureMapper;
import com.idea.cjyl.food.web.domain.pojo.DishesPicture;
import com.idea.cjyl.food.web.domain.pojo.DishesPictureExample;
import com.idea.cjyl.food.web.service.DishesPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DishesPictureServiceImpl extends GenericServiceImpl<DishesPicture, Long,DishesPictureExample> implements DishesPictureService {
    @Autowired
    private DishesPictureMapper dishespictureDao;

    @Override
    public GenericDao<DishesPicture, Long,DishesPictureExample> getDao() {
        return dishespictureDao;
    }

    /**
     * 批量添加图片
     * @param dishesId
     * @param pictureIds
     * @return
     */
    @Override
    public boolean inserts(Long dishesId, Long[] pictureIds) {
        for (long pitcureId:pictureIds
                ) {
            DishesPicture dishesPicture = new DishesPicture();
            dishesPicture.setPictureId(pitcureId);
            dishesPicture.setDishesId(dishesId);

            dishespictureDao.insert(dishesPicture);
            if(dishesPicture.getId()==null){
                return false;
            }
        }

        return true;
    }
}
