package com.dyz.service;

import com.dyz.entity.TmessageBean;

import java.util.List;

public interface TmessageBeanService {

    /**屈富豪
     * Ng检索 部门
     * @param companyNm
     * @param sectionNm
     * @param ngPk
     * @return
     */
    List<TmessageBean> retrievalNgWord(String companyNm, String sectionNm, int ngPk);

    /**屈富豪
     * Ng检索 全社
     * @param ngPk
     * @return
     */
    List<TmessageBean> retrievalNgWords(int ngPk);
 }
