package com.dyz.control;

import com.dyz.entity.TUserBean;
import com.dyz.entity.TmemberBean;
import com.dyz.model.ApiResult;
import com.dyz.service.MNgwordBeanService;
import com.dyz.service.TUserBeanService;
import com.dyz.service.TmemberBeanService;
import com.dyz.until.Mail;
import com.dyz.until.Make;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.UUID;


@Controller
public class MailController {

    @Autowired
    Mail mail;

    @Autowired
    TmemberBeanService tmemberBeanService;
    @Autowired
    TUserBeanService tUserBeanService;
    @Autowired
    MNgwordBeanService mNgwordBeanService;

    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    /**
     * 邮件发送
     * @return
     * @throws UnsupportedEncodingException
     */
    @PostMapping("/uploads")
    @ResponseBody
    public String email(@RequestParam("fileUpload") MultipartFile fileUpload) throws Exception {
        //获取文件名
        String fileName = fileUpload.getOriginalFilename();
        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //重新生成文件名
        fileName = UUID.randomUUID()+suffixName;
        //指定本地文件夹存储图片
        String filePath = "C:\\main\\src\\";
        //将图片保存到static文件夹里
        fileUpload.transferTo(new File(filePath+fileName));

        String fileNameUrl = filePath+fileName;

        String code = Make.makeCode();
        mail.sendMail(code,"2251480425@qq.com",fileNameUrl);
        return "发送成功";
    }

}
