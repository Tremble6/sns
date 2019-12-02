package com.dyz.service;

import com.dyz.entity.TmemberBean;

public interface TmemberBeanService {
    /**
     * 获取sessionId
     * @param account
     * @return
     */
    TmemberBean selectBysection(String account);
    /**
     * 获取当前用户的部门称号和公司称号
     * @param account
     * @return
     */
    TmemberBean selectBysectionNm(String account);
}
