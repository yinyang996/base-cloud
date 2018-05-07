# base-cloud

#### 项目介绍
使用spring cloud 搭建微服务应用架构
服务暂时以SOA方式拆分　【考虑现在主流还是SOA服务拆分】


api-gateway  服务网关 
config-server 服务配置中心
eureka-server 服务注册中心
message-queue rocketmq
service-monitor 服务监控中心
service-track 服务跟踪中心
user-center SOA用户中心
project-center SOA项目中心



#### 代码分支 


##### master
    项目架构图

##### 1.5.X-boot【maven】
    spring-boot-starter 1.5版本

##### 2.0.X-boot【gradle】
    spring-boot-starter 2.0.版本
    
    1.5版本和2.0版本还是有相当差别的 
    springboot 1.5 为 spring-context 4.0
    springboot 2.0 为 spring-context 5.0
    
    另 1.5与2.0的 starter autoconfig 也对cloud-data组件有很大的不兼容性


##### develop【gradle】
    SOA服务 拆分到了各个微服务模块【api、service、repository】【暂时不知道合不合理 欢迎提issus】



#### 软件架构
软件架构说明
![cloud架构图](http://upload-images.jianshu.io/upload_images/6434888-aa10c11f1f366701.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240 "cloud架构图-截止到编辑日志")

#### 功能介绍
```
已完成功能列表

1、集成mybatis 打通数据流流转
2、服务监控模块 、turbine、hystrix-dashboard
3、服务日志收集系统、ELK服务模块部署【简书:https://www.jianshu.com/p/542e1d1fb49d】
4、网关过滤模块
5、服务跟踪模块
6、服务服务注册模块 eureka
7、服务调用feign、服务熔断hystrixCommand
8、远程配置刷新
9、集成消息队列
10、message-queue改为 java config方式 
11、集成redis 使用spring-data-redis
12、统一引入外部配置


未完成功能列表

1、
2、
3、集中权限管理【单点登陆】
4、集成email sms中心
5、监控模块添加预警功能【调用 email sms服务】
6、抽离mybatis框架 作为starter 引入【jpa、mybatis解耦和】
7、docker一键执行部署脚本
8、..
```



#### 安装教程

1. xxxx
2. xxxx
3. xxxx

#### 使用说明

1. xxxx
2. xxxx
3. xxxx

