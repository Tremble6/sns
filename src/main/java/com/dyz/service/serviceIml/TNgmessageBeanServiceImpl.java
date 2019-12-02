package com.dyz.service.serviceIml;

import com.dyz.dao.TNgmessageBeanMapper;
import com.dyz.entity.TNgmessageBean;
import com.dyz.service.TNgmessageBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TNgmessageBeanServiceImpl implements TNgmessageBeanService {

    @Autowired
    TNgmessageBeanMapper tNgmessageBeanMapper;

    @Override
    public int deleteNgWord(int ngPk) {
        return tNgmessageBeanMapper.deleteNgWord(ngPk);
    }
}
