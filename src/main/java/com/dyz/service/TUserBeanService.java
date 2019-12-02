package com.dyz.service;

import com.dyz.entity.TUserBean;

public interface TUserBeanService {

    /**
     * 用户权限
     * @param account
     * @return
     */
    TUserBean selectPermission(String account);
}
