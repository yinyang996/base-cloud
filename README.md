# base-cloud

#### 项目介绍
使用spring cloud 搭建微服务应用架构

```
    基于spring理论搭建构建真正的微服务架构
    
```

#### 软件架构
软件架构说明

######cloud架构图-截止到编辑日志
![cloud架构图](http://upload-images.jianshu.io/upload_images/6434888-aa10c11f1f366701.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240 "cloud架构图-截止到编辑日志")

######官方的设计图纸
![官方的设计图纸](https://upload-images.jianshu.io/upload_images/6434888-33821ee404f1f004.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


######本分支设计图纸
![本分支设计图纸](https://upload-images.jianshu.io/upload_images/6434888-58f53a739b08b583.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/700)
#### 功能介绍
```
服务网关
api-gateway  

配置中心
config-server


注册中心
eureka-server

消息中心 Rocket MQ
message-queue

服务监控中心
service-monitor

服务跟踪中心
service-track

项目依赖公共包
wuxinvip-common

项目核心包
wuxinvip-core-starter

SOA 项目服务拆分
wuxinvip-project-api
wuxinvip-project-service
wuxinvip-project-repository

SOA用户服务拆分
wuxinvip-uc-api
wuxinvip-uc-service
wuxinvip-uc-repository








```

#### 安装教程

1. xxxx
2. xxxx
3. xxxx

#### 使用说明

1. xxxx
2. xxxx
3. xxxx



#### 端口约定
```$xslt

dev

eureka-server 39.107.82.228:80【暂定】
8000-8010

api-gateway
8010-8020

config-server
8020-8030

service-track
8030-8040

service-monitor
8040-8050

user-center
8050-8080

project-center
8080-8110
```
