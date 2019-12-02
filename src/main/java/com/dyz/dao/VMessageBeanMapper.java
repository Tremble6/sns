package com.dyz.dao;

import com.dyz.entity.VMessageBean;

public interface VMessageBeanMapper {
    int insert(VMessageBean record);

    int insertSelective(VMessageBean record);
}