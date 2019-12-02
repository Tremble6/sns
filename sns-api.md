# sns_接口文档

##

**更新时间** 2019-10-11

**作者** 王飞

##1.目录
##1.1 接口概述


## 1.2 接口路径设计 


     1.2.1 接口路径设计

     1.2.1 设计原则

**restful设计原则**

* 对网络上所有的资源都有一个资源标志符。
* 对资源的操作不会改变标识符。
* 同一资源有多种表现形式（xml、json）
* 所有操作都是无状态的（Stateless)

      1.2.2url组成

**http://localhost:8080/sns?userid=1**

 *	网络协议（http,https）
 * 	服务器地址：localhost
 *	版本：
 *	接口名称
 *	参数
 *	接口地址：http://localhost:8080/

     1.2.4 url定义限制

* 不能使用大写字母
* 参数不乱码，指定字符集

##1.3 接口请求方式
     1.3.1 get方式

请求方式|资源操作|幂等|安全
-----|-----|-----|-----
GET|SELECT| 是| 是|
POST |INSERT| 否| 否|
PUT |UPDATE| 是|否|
DELETE|DELETE|是|否|

* 幂等性：对同一REST接口的多次访问，得到的资源状态是相同的。

* 安全性：对该REST接口访问，不会使服务器端资源的状态发生改变。

#code定义

###张连伟
## 1.登录
**接口地址**：http://localhost:8080/sns/User/login

**接口协议**：post

**请求参数**：

字段名称|字段名称|类型|可空|备注
---|---|---|---|---
account|用户ID|varchar|必填|用户ID
password|用户密码|varchar|必填|用户密码

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
---|---|---|---|---
|permission|権限|char|必填|管理者：１、部室長：２|
|familyName|姓（漢字）|varchar|必填|姓|
|personalName|名（漢字）|varchar|必填|名|
|sectionNm|部署名|varchar|必填|部门名|
|readedCount|既読件数|varchar|必填|已读件数|
|unreadCount|未読件数|varchar|必填|未读件数|
|finalMonitorAt|最終監査時間|timestamptz|必填|最终监察时间|
|personalName|检查者|varchar|必填|部门管理者|
|token|登录信息|json|必填|登录信息|
|item_value|FIDUCIAL_VALUE|varchar|必填|基準値|

**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

## 2.谈话日志(管理者)

**接口地址**：http://localhost:8080/sns/Manage/torkLog

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
---|---|---|---|---
|token|登录信息|json|必填|登录信息|


**返回参数**：

|字段名称|字段名称|类型|可空|备注|
---|---|---|---|---
|state|状态|char|必填|已读：1、未读：0|
|message|送信内容|varchar|必填|送信内容|
|sendAt|送信时间|timestamptz|必填|时间|
|ngState|信息ng|char|必填|未対応：1、対応中：２、対応済み：３、削除済み：４|
|familyName|姓|varchar|必填|姓|
|personalName|名字|varchar|必填|名字|
|roomName|部门|varchar|必填|部门|
|fileName|添附名|varchar|必填|添附名|
|fileUrl|添附文件|varchar|必填|添附文件|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}


## 3.谈话日志（员工）
**接口地址**：http://localhost:8080/sns/Manage/torkLogStaff
**接口协议**：GET
**请求参数**：

|字段名称|字段名称|类型|可空|备注|
---|---|---|---|---
|token|登录信息|json|必填|登录信息|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|


**返回参数**：

|字段名称|字段名称|类型|可空|备注|
---|---|---|---|---
|state|状态|char|必填|已读：1、未读：0|
|message|送信内容|varchar|必填|送信内容|
|sendAt|送信时间|timestamptz|必填|时间|
|ngState|信息ng|char|必填|未対応：1、対応中：２、対応済み：３、削除済み：４|
|familyName|姓|varchar|必填|姓|
|personalName|名字|varchar|必填|名字|
|roomName|部门|varchar|必填|部门|
|fileName|添附名|varchar|必填|添附名|
|fileUrl|添附文件|varchar|必填|添附文件|

**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}


###王世超
## 4.谈话检索（员工—未读）
**接口地址**：http://localhost:8080/sns/Manage/torkLogStaffReade

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|state|状态|char|必填|未读：0|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|


**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|ngState|信息ng|char|必填|未対応：1、対応中：２、対応済み：３、削除済み：４|
|state|状态|char|必填|已读：1、未读：0|
|familyName|姓|varchar|必填|姓|
|personalName|名字|varchar|必填|名字|
|roomName|部门|varchar|必填|部门|
|fileName|添附名|varchar|必填|添附名|
|fileUrl|添附文件|varchar|必填|添附文件|
|message|送信内容|varchar|必填|送信内容|
|sendAt|送信时间|timestamptz|必填|时间|

**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}


## 5.谈话检索（员工—已读）
**接口地址**：http://localhost:8080/sns/Manage/torkLogStaffReade

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|state|状态|char|必填|已读：1|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|


**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|ngState|信息ng|char|必填|対応中：２、対応済み：３|
|state|状态|char|必填|已读：1、未读：0|
|familyName|姓|varchar|必填|姓|
|personalName|名字|varchar|必填|名字|
|roomName|部门|varchar|必填|部门|
|fileName|添附名|varchar|必填|添附名|
|fileUrl|添附文件|varchar|必填|添附文件|
|message|送信内容|varchar|必填|送信内容|
|sendAt|送信时间|timestamptz|必填|时间|

**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}


## 6.谈话检索（员工—未对应）
**接口地址**：http://localhost:8080/sns/Manage/torkLogStaffMatched

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|ngState|状态|char|必填|対応中：２|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|ngState|信息ng|char|必填|対応中：２、対応済み：３|
|state|状态|char|必填|已读：1、未读：0|
|familyName|姓|varchar|必填|姓|
|personalName|名字|varchar|必填|名字|
|roomName|部门|varchar|必填|部门|
|fileName|添附名|varchar|必填|添附名|
|fileUrl|添附文件|varchar|必填|添附文件|
|message|送信内容|varchar|必填|送信内容|
|sendAt|送信时间|timestamptz|必填|时间|

**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

###魏靖瑄
## 7.谈话检索（员工—对应）
**接口地址**：http://localhost:8080/sns/Manage/torkLogStaffMatched

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|ngState|状态|char|必填|対応済み：３|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|ngState|信息ng|char|必填|対応中：２、対応済み：３|
|state|状态|char|必填|已读：1、未读：0|
|familyName|姓|varchar|必填|姓|
|personalName|名字|varchar|必填|名字|
|roomName|部门|varchar|必填|部门|
|fileName|添附名|varchar|必填|添附名|
|fileUrl|添附文件|varchar|必填|添附文件|
|message|送信内容|varchar|必填|送信内容|
|sendAt|送信时间|timestamptz|必填|时间|

**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

## 8.监察
**接口地址**：http://localhost:8080/sns/Manage/audit

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|companyNm|公司名称|varchar|不可空|公司名称|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|sectionNm|部署名|varchar|必填|部门名|
|readedCount|既読件数|varchar|必填|已读件数|
|unreadCount|未読件数|varchar|必填|未读件数|
|finalMonitorAt|最終監査時間|timestamptz|必填|最终监察时间|
|personalName|检查者|varchar|必填|部门管理者|

**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}


## 9.统计
**接口地址**：http://localhost:8080/sns/Manage/statistics

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|companyNm|公司名称|varchar|不可空|公司名称|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|sectionNm|部署名|varchar|必填|部门名|
|contenders|用户数|int|必填|用户数|
|comments|累计评论数|int|必填|累计评论数|
|calls|累计通话数|int|必填|累计评论数|

**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

##经广增
## 10.用户管理
**接口地址**：http://localhost:8080/sns/Manage/userManage

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|
|positionNm|职务|varchar|必填|职务|
|familyName|姓|varchar|必填|姓|
|personalName|名字|varchar|必填|名字|
|personnelId|社员id|varchar|必填|社员id|
|permission|権限|char|必填|管理者：１、部室長：２|
|companyAbb|监察会社(简写)|varchar|必填|监察会社(简写)|
|manageSectionId|监察部门|varchar|必填|监察部门|
|deletedAt|消除时间|varchar|必填|消除时间|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

## 11.用户管理（添加）
**接口地址**：http://localhost:8080/sns/Manage/userManageAdd

**接口协议**：POST

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|ManageAdd|添加用户管理|json|必填|添加用户管理|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|
|positionNm|职务|varchar|必填|职务|
|familyName|姓|varchar|必填|姓|
|personalName|名字|varchar|必填|名字|
|personnelId|社员id|varchar|必填|社员id|
|permission|権限|char|必填|管理者：１、部室長：２|
|companyAbb|监察会社(简写)|varchar|必填|监察会社(简写)|
|manageSectionId|监察部门|varchar|必填|监察部门|
|deletedAt|消除时间|varchar|必填|消除时间|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

## 12.用户管理（删除）
**接口地址**：http://localhost:8080/sns/Manage/userManageDelete

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|pk|监察部门对象id|int|不可空|监察部门对象id|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|
|positionNm|职务|varchar|必填|职务|
|familyName|姓|varchar|必填|姓|
|personalName|名字|varchar|必填|名字|
|personnelId|社员id|varchar|必填|社员id|
|permission|権限|char|必填|管理者：１、部室長：２|
|companyAbb|监察会社(简写)|varchar|必填|监察会社(简写)|
|manageSectionId|监察部门|varchar|必填|监察部门|
|deletedAt|消除时间|varchar|必填|消除时间|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}


##屈富豪
## 13.NG 
**接口地址**：http://localhost:8080/sns/Manage/ngWord

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|ngWord|ng名称|varchar|不可空|ng名称|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

## 14.NG添加
**接口地址**：http://localhost:8080/sns/Manage/ngWordAdd

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|ngWord|ng名称|varchar|不可空|ng名称|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|ngWord|ng名称|varchar|不可空|ng名称|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

## 15.NG修改
**接口地址**：http://localhost:8080/sns/Manage/ngWordUpdate

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|ngWord|ng名称|varchar|不可空|ng名称|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|ngWord|ng名称|varchar|不可空|ng名称|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}


##化振云
## 16.NG删除
**接口地址**：http://localhost:8080/sns/Manage/ngWordDelete

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|pk|监察部门对象id|int|不可空|监察部门对象id|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|ngWord|ng名称|varchar|不可空|ng名称|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

## 17.系统设定
**接口地址**：http://localhost:8080/sns/Manage/configuration

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|email|电子邮件地址|varchar|不可空|电子邮件地址|
|ngWord|ng名称|varchar|不可空|ng名称|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}



## 18.系统设定
**接口地址**：http://localhost:8080/sns/Manage/submit

**接口协议**：post


**请求参数**：

|字段名称|字段值|可空|备注|
|---|---|---|---|
|token|登录信息|必填|登录信息|
|itemKey|itemValue|可以|--|
|NGWORD_NOTICE|off|可以|off:关,on:开|
|RECIPIENTS_EMAIL|itemValue|可以|送信先メールリスト|
|RECIPIENTS_ADDRESS|itemValue|可以|SMTPメールアドレス|
|SMTP_EMAIL_PORT|itemValue|可以|SMTPメールポート|
|SMTP_EMAIL_DOMAIN|itemValue|可以|SMTPメールドメイン|
|SMTP_EMAIL_USER_NAME|itemValue|可以|SMTPメールユーザ|
|SMTP_EMAIL_PASSWORD|itemValue|可以|SMTPメールパスワード|
|FIDUCIAL_VALUE|itemValue|可以|基準値|
											

**返回参数**：

##李加伟
## 19.退出
**接口地址**：http://localhost:8080/sns/User/signOut

**接口协议**：GET

**请求参数**：

|字段名称|字段名称|字段值|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|

**返回参数**：


## 20.NG（员工）
**接口地址**：http://localhost:8080/sns/Manage/ngWordW

**接口协议**：POST

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|ngType|ng类别|varchar|不可空|ng类别|
|ngWord|ng名称|varchar|不可空|ng名称|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

## 21.NG添加（员工）
**接口地址**：http://localhost:8080/sns/Manage/ngWordAddW

**接口协议**：POST

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|ngWord|ng名称|varchar|不可空|ng名称|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|ngType|ng类别|varchar|不可空|ng类别|
|ngWord|ng名称|varchar|不可空|ng名称|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

##陈建福
## 22.NG修改（员工）
**接口地址**：http://localhost:8080/sns/Manage/ngWordUpdateW

**接口协议**：POST

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|ngWord|ng名称|varchar|不可空|ng名称|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|ngType|ng类别|varchar|不可空|ng类别|
|ngWord|ng名称|varchar|不可空|ng名称|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}


##王飞
## 23.NG删除（员工）
**接口地址**：http://localhost:8080/sns/Manage/ngWordDeleteW

**接口协议**：POST

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|pk|监察部门对象id|int|不可空|监察部门对象id|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|ngType|ng类别|varchar|不可空|ng类别|
|ngWord|ng名称|varchar|不可空|ng名称|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|


**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}


## 24.统计情报（员工）
**接口地址**：http://localhost:8080/sns/Manage/statistics

**接口协议**：POST

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|familyName|姓（漢字）|varchar|必填|姓|
|personalName|名（漢字）|varchar|必填|名|
|readedCount|既読件数|varchar|必填|已读件数|
|unreadCount|未読件数|varchar|必填|未读件数|
|item_value|FIDUCIAL_VALUE|varchar|必填|基準値|

**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}

## 26.ng关键词
**接口地址**：http://localhost:8080/sns/Manage/ngKeyWord

**接口协议**：POST

**请求参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|token|登录信息|json|必填|登录信息|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|

**返回参数**：

|字段名称|字段名称|类型|可空|备注|
|---|---|---|---|---|
|pk|监察部门对象id|int|不可空|监察部门对象id|
|ngType|ng类别|varchar|不可空|ng类别|
|ngWord|ng名称|varchar|不可空|ng名称|
|companyNm|公司名称|varchar|不可空|公司名称|
|sectionNm|部署名|varchar|必填|部门名|

**数据返回格式**
{
     "error_code": "200",
    "reason": "success",
     {
          数据内容
     }
}