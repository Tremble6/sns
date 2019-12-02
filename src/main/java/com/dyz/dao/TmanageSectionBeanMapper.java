package com.dyz.dao;

import com.dyz.entity.TmanageSectionBean;

public interface TmanageSectionBeanMapper {
    int deleteByPrimaryKey(Integer pk);

    int insert(TmanageSectionBean record);

    int insertSelective(TmanageSectionBean record);

    TmanageSectionBean selectByPrimaryKey(Integer pk);

    int updateByPrimaryKeySelective(TmanageSectionBean record);

    int updateByPrimaryKey(TmanageSectionBean record);
}