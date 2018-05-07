

```
已完成功能列表

1、集成mybatis 打通数据流流转
2、服务监控模块 、turbine、hystrix-dashboard
3、服务日志收集系统、ELK服务模块部署【简书:https://www.jianshu.com/p/542e1d1fb49d】
4、网关过滤模块
5、服务跟踪模块
6、服务服务注册模块 eureka
7、服务调用feign、服务熔断hystrixCommand
8、url远程配置刷新
9、集成消息队列
10、message-queue改为 java config方式



未完成功能列表

1、
2、集成redis
3、集中权限管理【单点登陆】
4、集成email sms中心
5、监控模块添加预警功能【调用 email sms服务】
6、抽离mybatis框架 作为starter 引入【jpa、mybatis解耦和】
7、..
```


```
端口约定
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
8050-8060

project-center
8060-8070


```