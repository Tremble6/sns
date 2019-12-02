package com.dyz.control;

import com.dyz.entity.*;
import com.dyz.model.ApiResult;
import com.dyz.model.ResultCode;
import com.dyz.service.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.jasper.tagplugins.jstl.core.If;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class MNgwordBeanController {

    @Autowired
    MNgwordBeanService mNgwordBeanService;

    @Autowired
    TmemberBeanService tmemberBeanService;

    @Autowired
    TUserBeanService tUserBeanService;

    @Autowired
    VSectionOfCompanyBeanService vSectionOfCompanyBeanService;

    @Autowired
    TmessageBeanService tmessageBeanService;

    @Autowired
    TNgmessageBeanService tNgmessageBeanService;


    /**屈富豪
     * NG全部显示(管理员)
     * @return
     */
    @RequestMapping("/Manage/ngWord")
    public ApiResult mNgwordAll(){
        //全社
        List<MNgwordBean> list = mNgwordBeanService.selectByNgAllSs("1");
        return ApiResult.build().setData(list);
    }

    /**屈富豪
     * NG全部显示(部长)
     * @param data
     * @param req
     * @return
     * @throws JSONException
     */
    @RequestMapping("/Manage/ngWordW")
    public ApiResult mNgwordAll(@RequestBody String data,HttpServletRequest req)throws JSONException{
        JSONObject jsonObject = new JSONObject(data);
        String companyNm = jsonObject.getString("companyNm");
        String sectionNm = jsonObject.getString("sectionNm");
        //部门
        List<MNgwordBean> list = mNgwordBeanService.selectByNgAllS("2", companyNm, sectionNm);
        //全社
        List<MNgwordBean> list1 = mNgwordBeanService.selectByNgAllSs("1");
        Map<String,List> map = new HashMap<>(16);
        map.put("value",list);
        map.put("value1",list1);
        System.out.print(map);
        return ApiResult.build().setData(map);
    }
    /**屈富豪
     * NG添加(部长)
     * @param data
     * @return
     */
    @RequestMapping("/Manage/ngWordAdd")
    public ApiResult mNgwordAdd(@RequestBody String data,HttpServletRequest req)throws JSONException{
        JSONObject jsonObject = new JSONObject(data);
        String ngWord = jsonObject.getString("ngWord");
        String sectionNm =jsonObject.getString("sectionNm");
        String companyNm = jsonObject.getString("companyNm");
        /**
         * personnel_id
         */
        String createdBy = "1234";
        //sessionID
        VSectionOfCompanyBean vSectionOfCompanyBean = vSectionOfCompanyBeanService.selectSectionNm(sectionNm, companyNm);
        String sectionId = vSectionOfCompanyBean.getSectionId();
        if(ngWord.equals("")){
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP00034.getError_code(),ResultCode.HTTP00034.getReason());
        }
        if (ngWord.length() > 16){
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP0003456.getError_code(),ResultCode.HTTP0003456.getReason());
        }
        //判断插入的ngWord是否存在
        MNgwordBean mNgwordBean = mNgwordBeanService.insertByNgPresence(ngWord,sectionId);
        if (mNgwordBean == null){
            MNgwordBean selectNgWordCount = mNgwordBeanService.selectNgWordCount(sectionNm, companyNm, "2");
            String count = selectNgWordCount.getCount();
            if (Integer.valueOf(count) >= 20){
                return ApiResult.build().setCodeAndMessage(ResultCode.HTTP000345.getError_code(),ResultCode.HTTP000345.getReason());
            }
            mNgwordBeanService.insertByNg(ngWord,"2", sectionId, createdBy);
            int i = mNgwordBeanService.insertByNgPresences(ngWord, sectionNm, companyNm);
            return ApiResult.build().setData(i);
        }else {
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP12345.getError_code(),ResultCode.HTTP12345.getReason());
        }
    }

    /**屈富豪
     * NG添加(管理员)
     * @param data
     * @return
     */
    @RequestMapping("/Manage/ngWordAddAll")
    public ApiResult mNgwordAdd(@RequestBody String data)throws JSONException{
        JSONObject jsonObject = new JSONObject(data);
        String ngWord = jsonObject.getString("ngWord");
        /**
         * personnel_id
         */
        String createdBy = "1234";
        if(ngWord.equals("")){
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP00034.getError_code(),ResultCode.HTTP00034.getReason());
        }
        if (ngWord.length() > 16){
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP0003456.getError_code(),ResultCode.HTTP0003456.getReason());
        }
        //判断插入的ngWord是否存在
        MNgwordBean mNgwordBean = mNgwordBeanService.insertByNgPresence(ngWord);
        if (mNgwordBean == null){
            mNgwordBeanService.insertByNgController(ngWord,"1", createdBy);
            int i = mNgwordBeanService.insertByNgPresencesAll(ngWord,"1");
            return ApiResult.build().setData(i);
        }else {
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP12345.getError_code(),ResultCode.HTTP12345.getReason());
        }
    }

    /**屈富豪
     * NG修改(部长)
     * @param data
     * @return
     */
    @RequestMapping("/Manage/ngWordUpdate")
    public ApiResult mNgwordUpdate(@RequestBody String data,HttpServletRequest req)throws JSONException{
        JSONObject jsonObject = new JSONObject(data);
        String ngWord =jsonObject.getString( "ngWord");
        String sectionNm =jsonObject.getString("sectionNm");
        String companyNm = jsonObject.getString("companyNm");
        String ngPk = jsonObject.getString("ngPk");
        //修改时间
        Timestamp updatedAt = new Timestamp(System.currentTimeMillis());
        //sessionID
        VSectionOfCompanyBean vSectionOfCompanyBean = vSectionOfCompanyBeanService.selectSectionNm(sectionNm, companyNm);
        String sectionId = vSectionOfCompanyBean.getSectionId();

        String updatedBy = "1212";
        if(ngWord.equals("")){
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP00034.getError_code(),ResultCode.HTTP00034.getReason());
        }
        if (ngWord.length() > 16){
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP0003456.getError_code(),ResultCode.HTTP0003456.getReason());
        }
        //判断修改的ngWord是否存在
        MNgwordBean mNgwordBean = mNgwordBeanService.insertByNgPresence(ngWord,sectionId);
        if (mNgwordBean == null){
            MNgwordBean selectNgWordCount = mNgwordBeanService.selectNgWordCount(sectionNm, companyNm, "2");
            String count = selectNgWordCount.getCount();
            if (Integer.valueOf(count) >= 20){
                return ApiResult.build().setCodeAndMessage(ResultCode.HTTP000345.getError_code(),ResultCode.HTTP000345.getReason());
            }
            mNgwordBeanService.updateByNg(ngWord,updatedBy,updatedAt,Integer.valueOf(ngPk));
            tNgmessageBeanService.deleteNgWord(Integer.valueOf(ngPk));
            int i = mNgwordBeanService.insertByNgPresences(ngWord, sectionNm, companyNm);
            return ApiResult.build().setData(i);
        }else {
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP12345.getError_code(),ResultCode.HTTP12345.getReason());
        }
    }

    /**屈富豪
     * NG修改(管理员)
     * @param data
     * @return
     */
    @RequestMapping("/Manage/ngWordUpdateAll")
    public ApiResult mNgwordUpdate(@RequestBody String data)throws JSONException{
        JSONObject jsonObject = new JSONObject(data);
        String ngWord =jsonObject.getString( "ngWord");
        String ngPk = jsonObject.getString("ngPk");
        //修改时间
        Timestamp updatedAt = new Timestamp(System.currentTimeMillis());
        String updatedBy = "1212";
        if(ngWord.equals("")){
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP00034.getError_code(),ResultCode.HTTP00034.getReason());
        }
        if (ngWord.length() > 16){
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP0003456.getError_code(),ResultCode.HTTP0003456.getReason());
        }
        //判断修改的ngWord是否存在
        MNgwordBean mNgwordBean = mNgwordBeanService.insertByNgPresence(ngWord);
        if (mNgwordBean == null){
            mNgwordBeanService.updateByNg(ngWord,updatedBy,updatedAt,Integer.valueOf(ngPk));
            tNgmessageBeanService.deleteNgWord(Integer.valueOf(ngPk));
            int i = mNgwordBeanService.insertByNgPresencesAll(ngWord,"1");
            return ApiResult.build().setData(i);
        }else {
            return ApiResult.build().setCodeAndMessage(ResultCode.HTTP12345.getError_code(),ResultCode.HTTP12345.getReason());
        }
    }

    /**
     *
     * ngWord检索 部门
     * @param data
     * @return
     * @throws JSONException
     */
    @RequestMapping("/Manage/retrievalNgWord")
    public ApiResult retrievalNgWord(@RequestBody String data)throws JSONException{
        JSONObject jsonObject = new JSONObject(data);
        String companyNm = jsonObject.getString("companyNm");
        String sectionNm = jsonObject.getString("sectionNm");
        String ngPk = jsonObject.getString("ngPk");
            List<TmessageBean> list = tmessageBeanService.retrievalNgWord(companyNm, sectionNm,Integer.valueOf(ngPk));
            if (CollectionUtils.isEmpty(list)){
                return ApiResult.build().setCodeAndMessage(ResultCode.HTTP213456.getError_code(),ResultCode.HTTP213456.getReason());
            }
            return ApiResult.build().setData(list);
        }

}
