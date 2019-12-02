package com.dyz.dao;

import com.dyz.entity.MPositionBean;

public interface MPositionBeanMapper {
    int deleteByPrimaryKey(String positionId);

    int insert(MPositionBean record);

    int insertSelective(MPositionBean record);

    MPositionBean selectByPrimaryKey(String positionId);

    int updateByPrimaryKeySelective(MPositionBean record);

    int updateByPrimaryKey(MPositionBean record);
}