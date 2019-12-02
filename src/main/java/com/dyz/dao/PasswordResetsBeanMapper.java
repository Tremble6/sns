package com.dyz.dao;

import com.dyz.entity.PasswordResetsBean;

public interface PasswordResetsBeanMapper {
    int insert(PasswordResetsBean record);

    int insertSelective(PasswordResetsBean record);
}