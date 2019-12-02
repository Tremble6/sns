package com.dyz.service.serviceIml;

import com.dyz.dao.MNgwordBeanMapper;
import com.dyz.entity.MNgwordBean;
import com.dyz.entity.TmessageBean;
import com.dyz.service.MNgwordBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class MNgwordBeanServiceImpl implements MNgwordBeanService{

    @Autowired
    MNgwordBeanMapper mNgwordBeanMapper;

    @Override
    public List<MNgwordBean> selectByNgAllS(String ngType ,String companyNm, String sectionNm) {
        return mNgwordBeanMapper.selectByNgAllS(ngType,companyNm,sectionNm);
    }

    @Override
    public List<MNgwordBean> selectByNgAllSs(String ngType) {
        return mNgwordBeanMapper.selectByNgAllSs(ngType);
    }

    @Override
    public int insertByNg(String ngWord, String ngType,String sectionId,String createdBy) {
        return mNgwordBeanMapper.insertByNg(ngWord,ngType,sectionId,createdBy);
    }

    @Override
    public MNgwordBean selectNgWordCount(String sectionNm, String companyNm, String ngType) {
        return mNgwordBeanMapper.selectNgWordCount(sectionNm,companyNm,ngType);
    }

    @Override
    public int insertByNgController(String ngWord, String ngType, String createdBy) {
        return mNgwordBeanMapper.insertByNgController(ngWord,ngType,createdBy);
    }

    @Override
    public MNgwordBean insertByNgPresence(String ngWord, String sectionId) {
        return mNgwordBeanMapper.insertByNgPresence(ngWord,sectionId);
    }

    @Override
    public MNgwordBean insertByNgPresence(String ngWord) {
        return mNgwordBeanMapper.insertByNgPresence(ngWord);
    }

    @Override
    public int insertByNgPresences(String ngWord, String sectionNm, String companyNm) {
        return mNgwordBeanMapper.insertByNgPresences(ngWord,sectionNm,companyNm);
    }

    @Override
    public int insertByNgPresencesAll(String ngWord, String ngType) {
        return mNgwordBeanMapper.insertByNgPresencesAll(ngWord,ngType);
    }

    @Override
    public int updateByNg(String ngWord,String updatedBy, Timestamp updatedAt, Integer pk) {
        return mNgwordBeanMapper.updateByNg(ngWord,updatedBy,updatedAt,pk);
    }

}
