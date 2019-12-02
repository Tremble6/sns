package com.dyz.service;

import com.dyz.entity.MNgwordBean;
import com.dyz.entity.TmessageBean;

import java.sql.Timestamp;
import java.util.List;

public interface MNgwordBeanService {


    /**屈富豪
     * NgWord显示 部门
     * @param ngType
     * @param companyNm
     * @param sectionNm
     * @return
     */
    List<MNgwordBean> selectByNgAllS(String ngType,String companyNm,String sectionNm);

    /**屈富豪
     * NgWord显示 全社
     * @param ngType
     * @return
     */
    List<MNgwordBean> selectByNgAllSs(String ngType);

    /**屈富豪
     * NG添加(员工)
     * @param ngWord
     * @param ngType
     * @return
     */
    int insertByNg(String ngWord,String ngType,String sectionId,String createdBy);

    /**
     * 每个部门的ngWord的数量
     * @param sectionNm
     * @param companyNm
     * @param ngType
     * @return
     */
    MNgwordBean selectNgWordCount(String sectionNm,String companyNm,String ngType);

    /**屈富豪
     * NG添加(全社)
     * @param ngWord
     * @param ngType
     * @param createdBy
     * @return
     */
    int insertByNgController(String ngWord,String ngType,String createdBy);

    /**屈富豪
     * 判断ngWord是否存在
     * @param ngWord
     * @param sectionId
     * @return
     */
    MNgwordBean insertByNgPresence(String ngWord,String sectionId);
    MNgwordBean insertByNgPresence(String ngWord);

    /**屈富豪
     * 插入带有ngWord的消息 部门
     * @param ngWord
     * @param sectionNm
     * @param companyNm
     * @return
     */
    int insertByNgPresences(String ngWord,String sectionNm,String companyNm);

    /**
     * 插入带有ngWord的消息 全社
     * @param ngWord
     * @param ngType
     * @return
     */
    int insertByNgPresencesAll(String ngWord,String ngType);
    /**屈富豪
     * NG修改
     * @param ngWord
     * @param pk
     * @return
     */
    int updateByNg(String ngWord,String updatedBy,Timestamp updatedAt,Integer pk);

}
