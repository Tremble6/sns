package com.dyz.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Manage {

    @Autowired



    @RequestMapping(value = "/Manage/ngWordDeleteW")
    public String NgWordDeleteW(){

       return "";

    }
}
