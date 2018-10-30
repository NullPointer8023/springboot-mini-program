package com.mini.program.service;

import com.mini.program.dao.AreaDao;
import com.mini.program.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by NullPointer on 2018/10/29.
 */
@Component
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao ;

    @Override
    public List<Area> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public Area queryAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public Boolean addArea(Area area) {
        if(area.getAreaName() != null && !"".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int num = areaDao.insertArea(area) ;
                if(num > 0){
                    return true ;
                }else{
                    throw new RuntimeException("insert fail");
                }
            }catch (Exception e){
               throw new RuntimeException("insert fail " + e.getMessage()) ;
            }
        }else{
            throw new RuntimeException("insert fail ,because areaName is null");
        }
    }

    @Override
    public Boolean modifyArea(Area area) {
        if(area.getAreaId() != null && !"".equals(area.getAreaId())){
            area.setLastEditTime(new Date());
            try {
                int num = areaDao.updateArea(area);
                if(num > 0){
                    return true ;
                }else{
                    throw new RuntimeException("update fail");
                }
            }catch (Exception e){
                throw new RuntimeException("update fail" + e.getMessage()) ;
            }

        }else{
            throw new RuntimeException("update fail , because areaId is null ") ;
        }
    }

    @Override
    public Boolean deleteArea(Integer areaId) {
        if(areaId != null && !"".equals(areaId)){
            try {
                int num = areaDao.deleteArea(areaId);
                if(num > 0){
                    return true ;
                }else{
                    throw new RuntimeException("delete fail");
                }
            }catch (Exception e){
                throw new RuntimeException("delete fail" + e.getMessage()) ;
            }
        }else{
            throw new RuntimeException("delete fail , because areaId is null ") ;
        }
    }
}
