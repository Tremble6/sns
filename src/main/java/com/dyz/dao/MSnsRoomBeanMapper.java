package com.dyz.dao;

import com.dyz.entity.MSnsRoomBean;

public interface MSnsRoomBeanMapper {
    int deleteByPrimaryKey(Integer pk);

    int insert(MSnsRoomBean record);

    int insertSelective(MSnsRoomBean record);

    MSnsRoomBean selectByPrimaryKey(Integer pk);

    int updateByPrimaryKeySelective(MSnsRoomBean record);

    int updateByPrimaryKey(MSnsRoomBean record);
}