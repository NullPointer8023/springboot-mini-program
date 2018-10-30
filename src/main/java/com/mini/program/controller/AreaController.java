package com.mini.program.controller;

import com.mini.program.entity.Area;
import com.mini.program.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by NullPointer on 2018/10/29.
 */
@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService ;

    @RequestMapping(value = "/listArea" ,method = RequestMethod.GET)
    public Map<String,Object> listArea(){
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("listArea",areaService.queryArea());
        return returnMap;
    }

    @RequestMapping(value = "/getAreaById" , method = RequestMethod.GET)
    public Map<String,Object> getAreaById(Integer areaId){
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("success",areaService.queryAreaById(areaId)) ;
        return returnMap ;
    }

    @RequestMapping(value = "/addArea",method = RequestMethod.POST)
    public Map<String,Object> addArea(@RequestBody Area area ){
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("success", areaService.addArea(area));
        return returnMap ;
    }

    @RequestMapping(value = "/modifyArea" , method = RequestMethod.POST)
    public Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("success", areaService.modifyArea(area));
        return returnMap ;
    }

    @RequestMapping(value = "/removeAreaById",method = RequestMethod.GET)
    public Map<String,Object> removeAreaById(Integer areaId){
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("success", areaService.deleteArea(areaId));
        return returnMap ;
    }

}
