package com.dyz.dao;

import com.dyz.entity.MSnsUserBean;

public interface MSnsUserBeanMapper {
    int deleteByPrimaryKey(Integer pk);

    int insert(MSnsUserBean record);

    int insertSelective(MSnsUserBean record);

    MSnsUserBean selectByPrimaryKey(Integer pk);

    int updateByPrimaryKeySelective(MSnsUserBean record);

    int updateByPrimaryKey(MSnsUserBean record);
}