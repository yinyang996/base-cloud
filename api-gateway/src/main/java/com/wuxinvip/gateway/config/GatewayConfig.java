package com.wuxinvip.gateway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.support.ipresolver.RemoteAddressResolver;
import org.springframework.cloud.gateway.support.ipresolver.XForwardedRemoteAddressResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * @title:
 * @description:
 * @author: lianyanjin
 * @date:2019/5/30 14:09
 * @location com.wuxinvip.gateway.config.GatewayConfig.class
 */

@Component
public class GatewayConfig {


    RemoteAddressResolver resolver = XForwardedRemoteAddressResolver.maxTrustedIndex(1);

    public void test(){
//        resolver.
    }
    public static final Logger logger = LoggerFactory.getLogger(GatewayConfig.class);


    /**
     * @title: 全局filter
     * @description: 
     * @author: lianyanjin
     * @date: 2019/5/30 14:21
     * @param 
     * @return 
     */
    @Bean
    @Order(-1)
    public GlobalFilter a() {
        return (exchange, chain) -> {
            logger.info("first pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("third post filter");
            }));
        };
    }

    @Bean
    @Order(0)
    public GlobalFilter b() {
        return (exchange, chain) -> {
            logger.info("second pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("second post filter");
            }));
        };
    }

    @Bean
    @Order(1)
    public GlobalFilter c() {
        return (exchange, chain) -> {
            logger.info("third pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("first post filter");
            }));
        };
    }
}
