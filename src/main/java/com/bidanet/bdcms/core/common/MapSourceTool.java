package com.bidanet.bdcms.core.common;

import org.apache.poi.ss.formula.functions.T;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/28.
 */
public class MapSourceTool {

    public Map map = new HashMap<String,T>();

    public Map getMapData(){
        return map;
    }
    public MapSourceTool addMapData(String key, Object value){
        map.put(key,value);
        return this;
    }
}
