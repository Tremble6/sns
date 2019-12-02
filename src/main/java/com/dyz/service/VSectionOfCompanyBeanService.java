package com.dyz.service;

import com.dyz.entity.VSectionOfCompanyBean;

public interface VSectionOfCompanyBeanService {
    //SessionID
    VSectionOfCompanyBean selectSectionNm (String sectionNm,String companyNm);
}
