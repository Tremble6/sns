package com.dyz.dao;

import com.dyz.entity.TmemberBean;
import org.springframework.stereotype.Repository;

@Repository
public interface TmemberBeanMapper {
    int deleteByPrimaryKey(Integer pk);

    int insert(TmemberBean record);

    int insertSelective(TmemberBean record);

    TmemberBean selectByPrimaryKey(Integer pk);

    int updateByPrimaryKeySelective(TmemberBean record);

    int updateByPrimaryKey(TmemberBean record);

    /**
     * 获取sessionId
     * @param account
     * @return
     */
    TmemberBean selectBysection(String account);

    TmemberBean selectBysectionNm(String account);
}