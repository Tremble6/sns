package com.dyz.service.serviceIml;

import com.dyz.dao.TmessageBeanMapper;
import com.dyz.entity.TmessageBean;
import com.dyz.service.TmessageBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TmessageBeanServiceImpl implements TmessageBeanService {

    @Autowired
    TmessageBeanMapper tmessageBeanMapper;

    @Override
    public List<TmessageBean> retrievalNgWord(String companyNm, String sectionNm, int ngPk) {
        return tmessageBeanMapper.retrievalNgWord(companyNm,sectionNm,ngPk);
    }

    @Override
    public List<TmessageBean> retrievalNgWords(int ngPk) {
        return tmessageBeanMapper.retrievalNgWords(ngPk);
    }
}
