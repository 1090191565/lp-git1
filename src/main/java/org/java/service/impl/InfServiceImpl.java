package org.java.service.impl;

import org.java.dao.InfMapper;
import org.java.service.InfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by 马果 on 2018/7/8.
 */
@Service("infService")
public class InfServiceImpl implements InfService {

    @Autowired
    private InfMapper mapper;

    @Transactional
    @Override
    public void add(Map<String, Object> m) {

    }

    @Transactional(readOnly = true)
    @Override
    public List<Map<String, Object>> getList() {
        return mapper.getList();
    }
}
