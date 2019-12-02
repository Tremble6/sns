package com.dyz.service.serviceIml;

import com.dyz.dao.VSectionOfCompanyBeanMapper;
import com.dyz.entity.VSectionOfCompanyBean;
import com.dyz.service.VSectionOfCompanyBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VSectionOfCompanyBeanServiceImpl implements VSectionOfCompanyBeanService {

    @Autowired
    VSectionOfCompanyBeanMapper vSectionOfCompanyBeanMapper;

    @Override
    public VSectionOfCompanyBean selectSectionNm(String sectionNm, String companyNm) {
        return vSectionOfCompanyBeanMapper.selectSectionNm(sectionNm,companyNm);
    }
}
