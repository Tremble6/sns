package com.dyz.service.serviceIml;

import com.dyz.dao.TUserBeanMapper;
import com.dyz.entity.TUserBean;
import com.dyz.service.TUserBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TUserBeanServiceImpl implements TUserBeanService {

   @Autowired
    TUserBeanMapper tUserBeanMapper;

    @Override
    public TUserBean selectPermission(String account) {
        return tUserBeanMapper.selectPermission(account);
    }
}
