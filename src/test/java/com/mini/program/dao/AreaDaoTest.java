package com.mini.program.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mini.program.entity.Area;

/**
 * Created by NullPointer on 2018/10/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // 按方法名大小升序执行
public class AreaDaoTest {
    //通过spring容器注入Dao的实现类
    @Autowired
    private AreaDao areaDao;

    @Test
    @Ignore
    public void queryArea() throws Exception {
        List<Area> areaList = areaDao.queryArea();
        // 验证预期值和实际值是否相符
        assertEquals(4, areaList.size());
    }

    @Test
    @Ignore
    public void queryAreaById() throws Exception {
        Area area = areaDao.queryAreaById(1);
        assertEquals("东苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() throws Exception {
        Area area = new Area() ;
        area.setAreaName("中苑");
        area.setPriority(5);
        int num = areaDao.insertArea(area);
        assertEquals(1,num);
    }

    @Test
    @Ignore
    public void updateArea() throws Exception {
        Area area = new Area() ;
        area.setAreaId(5);
        area.setAreaName("中1苑");
        area.setPriority(5);
        int num = areaDao.updateArea(area);
        assertEquals(1,num);
    }

    @Test
    @Ignore
    public void deleteArea() throws Exception {
       assertEquals(1,areaDao.deleteArea(5));
    }

}