package com.mini.program.service;

import com.mini.program.entity.Area;

import java.util.List;

/**
 * Created by NullPointer on 2018/10/29.
 */
public interface AreaService {
    /**
     * 列出区域列表
     *
     * @return areaList
     */
    List<Area> queryArea();

    /**
     * 根据Id列出具体区域
     *
     * @return area
     */
    Area queryAreaById(int areaId);

    /**
     * 插入区域信息
     *
     * @param area
     * @return
     */
    Boolean addArea(Area area);

    /**
     * 更新区域信息
     *
     * @param area
     * @return
     */
    Boolean modifyArea(Area area);

    /**
     * 删除区域信息
     *
     * @param areaId
     * @return
     */
    Boolean deleteArea(Integer areaId);
}
