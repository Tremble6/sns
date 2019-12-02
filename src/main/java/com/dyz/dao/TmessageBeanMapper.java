package com.dyz.dao;

import com.dyz.entity.TmessageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TmessageBeanMapper {


    /**屈富豪
     * Ng检索 部门
     * @param companyNm
     * @param sectionNm
     * @param ngPk
     * @return
     */
    List<TmessageBean> retrievalNgWord(@Param("companyNm")String companyNm, @Param("sectionNm")String sectionNm, @Param("ngPk")int ngPk);

    /**屈富豪
     * Ng检索 全社
     * @param ngPk
     * @return
     */
    List<TmessageBean> retrievalNgWords(int ngPk);
}