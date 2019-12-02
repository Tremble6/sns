package com.dyz.dao;

import com.dyz.entity.VSectionOfCompanyBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VSectionOfCompanyBeanMapper {
    int insert(VSectionOfCompanyBean record);

    int insertSelective(VSectionOfCompanyBean record);


    VSectionOfCompanyBean selectSectionNm (@Param("sectionNm")String sectionNm,@Param("companyNm")String companyNm);
}