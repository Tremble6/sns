package com.dyz.dao;

import com.dyz.entity.TUserBean;
import org.springframework.stereotype.Repository;

@Repository
public interface TUserBeanMapper {
    int deleteByPrimaryKey(Integer pk);

    int insert(TUserBean record);

    int insertSelective(TUserBean record);

    TUserBean selectByPrimaryKey(Integer pk);

    int updateByPrimaryKeySelective(TUserBean record);

    int updateByPrimaryKey(TUserBean record);

    /**
     * 用户权限
     * @param account
     * @return
     */
    TUserBean selectPermission(String account);
}