package com.wuxinvip.uc.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huoyan403 on 2017/11/9.
 */
@RefreshScope
@RestController
public class ConfigTestController {
//
//    /**
//     * 第一种获取配置属性方式
//     */
//    @Value("${from}")
//    private String from;
//
//    @RequestMapping("/config")
//    public String config(){
//        return this.from;
//    }
//
//
//    /**
//     * 第二种获取配置属性方式
//     */
//    @Autowired
//    private Environment environment;
//
//
//    @RequestMapping("/getConfig")
//    public String getConfig(){
//        return environment.getProperty("from");
//    }
//

}
