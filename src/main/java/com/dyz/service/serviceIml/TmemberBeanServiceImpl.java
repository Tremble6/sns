package com.dyz.service.serviceIml;

import com.dyz.dao.TmemberBeanMapper;
import com.dyz.entity.TmemberBean;
import com.dyz.service.TmemberBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TmemberBeanServiceImpl implements TmemberBeanService {
    @Autowired
    private TmemberBeanMapper tmemberBeanMapper;

    @Override
    public TmemberBean selectBysection(String account) {
        return tmemberBeanMapper.selectBysection(account);
    }

    @Override
    public TmemberBean selectBysectionNm(String account) {
        return tmemberBeanMapper.selectBysectionNm(account);
    }
}
