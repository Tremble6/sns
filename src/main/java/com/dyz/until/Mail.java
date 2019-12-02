package com.dyz.until;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.UnsupportedEncodingException;

@Service
public class Mail {
     @Autowired
     JavaMailSenderImpl javaMailSender;

     /**
      * 邮件发送  有附件
      * @param text
      * @param to
      * @param url
      * @throws UnsupportedEncodingException
      */
     public void sendMail(String text , String to,String url)throws Exception{
          //使用JavaMail的MimeMessage，支付更加复杂的邮件格式和内容
         MimeMessage mimeMessage = javaMailSender.createMimeMessage();
          //创建MimeMessageHelper对象，处理MimeMessage的辅助类
          MimeMessageHelper e = new MimeMessageHelper(mimeMessage,true);
          //加入附件
          e.addAttachment("ss.jpg",new File(url));
          //使用辅助类MimeMessage设定参数
          e.setSubject("验证码");
          e.setText("<b style='color:red'>你的验证码是:</b>"+text+ "请在三分钟内填写，过期作废",true);
          e.setTo(to);
          e.setFrom(String.valueOf(new InternetAddress("2810211903@qq.com", "社会你豪哥", "UTF-8")));
          // 发送邮件
          javaMailSender.send(mimeMessage);
     }

    /**
     *发送简单文本邮件
     * @param text
     * @param to
     * @throws Exception
     */
     public void sendMail2(String text , String to) throws Exception{
         SimpleMailMessage smm = new SimpleMailMessage();
         smm.setSubject("验证码");
         smm.setText("<b style='color:red'>你的验证码是:</b>"+text+ "请在三分钟内填写，过期作废");
         smm.setTo(to);
         smm.setFrom(String.valueOf(new InternetAddress("2810211903@qq.com", "社会你豪哥", "UTF-8")));
         javaMailSender.send(smm);
     }
}
