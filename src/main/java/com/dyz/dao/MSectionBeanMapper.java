package com.dyz.dao;

import com.dyz.entity.MSectionBean;
import org.springframework.stereotype.Repository;

@Repository
public interface MSectionBeanMapper {
    int deleteByPrimaryKey(String sectionId);

    int insert(MSectionBean record);

    int insertSelective(MSectionBean record);

    MSectionBean selectByPrimaryKey(String sectionId);

    int updateByPrimaryKeySelective(MSectionBean record);

    int updateByPrimaryKey(MSectionBean record);

    MSectionBean selectSectionNm(String sectionNm);
}