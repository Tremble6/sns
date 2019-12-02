package com.dyz.service.serviceIml;

import com.dyz.dao.MCompanyBeanMapper;
import com.dyz.entity.MCompanyBean;
import com.dyz.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestiImp implements Test {

   @Autowired
   MCompanyBeanMapper mCompanyBeanMapper;


    @Override
    public List<MCompanyBean> selectAll(String x) {
        return mCompanyBeanMapper.selectAll(x);
    }
}
