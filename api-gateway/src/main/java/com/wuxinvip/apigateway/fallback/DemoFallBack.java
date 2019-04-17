package com.wuxinvip.apigateway.fallback;

import com.wuxinvip.apigateway.common.FallBack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;

/**
 * @title:
 * @description:
 * @author: wuxin
 * @date:2019/4/17 13:27
 * @location com.wuxinvip.apigateway.fallback.DemoFallBack.class
 */
public class DemoFallBack extends FallBack implements FallbackProvider {

    private static Logger logger = LoggerFactory.getLogger(DemoFallBack.class);

    //指定要处理的 service。
    @Override
    public String getRoute() {
        return "project-center";
    }

    //返回响应
    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        if (cause != null && cause.getCause() != null) {
            String reason = cause.getCause().getMessage();
            logger.info("Excption {}",reason);
        }
        return fallbackResponse();
    }
}
