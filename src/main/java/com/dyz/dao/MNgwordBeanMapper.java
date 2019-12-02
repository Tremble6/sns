package com.dyz.dao;

import com.dyz.entity.MNgwordBean;
import com.dyz.entity.TmessageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface MNgwordBeanMapper {

    /**屈富豪
     * NgWord显示 部门
     * @param ngType
     * @param companyNm
     * @param sectionNm
     * @return
     */
    List<MNgwordBean> selectByNgAllS(@Param("ngType")String ngType,@Param("companyNm")String companyNm,@Param("sectionNm")String sectionNm);

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
    int insertByNg(@Param("ngWord")String ngWord,@Param("ngType")String ngType,@Param("sectionId")String sectionId,@Param("createdBy")String createdBy);

    /**
     * 每个部门的ngWord的数量
     * @param sectionNm
     * @param companyNm
     * @param ngType
     * @return
     */
    MNgwordBean selectNgWordCount(@Param("sectionNm")String sectionNm,@Param("companyNm")String companyNm,@Param("ngType")String ngType);

    /**屈富豪
     * NG添加(全社)
     * @param ngWord
     * @param ngType
     * @param createdBy
     * @return
     */
    int insertByNgController(@Param("ngWord")String ngWord,@Param("ngType")String ngType,@Param("createdBy")String createdBy);

    /**屈富豪
     * 判断ngWord是否存在
     * @param ngWord
     * @param sectionId
     * @return
     */
    MNgwordBean insertByNgPresence(@Param("ngWord")String ngWord,@Param("sectionId")String sectionId);
    MNgwordBean insertByNgPresence(String ngWord);
    /**屈富豪
     * 插入带有ngWord的消息部门
     * @param ngWord
     * @param sectionNm
     * @param companyNm
     * @return
     */
    int insertByNgPresences(@Param("ngWord")String ngWord,@Param("sectionNm")String sectionNm,@Param("companyNm")String companyNm);
    /**
     * 插入带有ngWord的消息 全社
     * @param ngWord
     * @param ngType
     * @return
     */
    int insertByNgPresencesAll(@Param("ngWord")String ngWord,@Param("ngType")String ngType);
    /**屈富豪
     * NG修改
     * @param ngWord
     * @param pk
     * @return
     */
    int updateByNg(@Param("ngWord")String ngWord,@Param("updatedBy")String updatedBy, @Param("updatedAt")Timestamp updatedAt,@Param("pk") Integer pk);


}