package com.dyz.dao;

import com.dyz.entity.MSystemBean;

public interface MSystemBeanMapper {
    int insert(MSystemBean record);

    int insertSelective(MSystemBean record);
}