package com.dyz.dao;

import com.dyz.entity.MCompanyBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MCompanyBeanMapper {
    int deleteByPrimaryKey(String companyId);

    int insert(MCompanyBean record);

    int insertSelective(MCompanyBean record);

    MCompanyBean selectByPrimaryKey(String companyId);

    int updateByPrimaryKeySelective(MCompanyBean record);

    int updateByPrimaryKey(MCompanyBean record);

    /*@Select("select company_id from m_company")*/
    List<MCompanyBean> selectAll(String x);
}