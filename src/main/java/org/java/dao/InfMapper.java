package org.java.dao;

import java.util.List;
import java.util.Map;


/**
 * Created by liangzhepeng on 2018-07-08.
 */
public interface InfMapper {
    public void add(Map<String,Object> m );

    public List<Map<String,Object>> getList();
}
