package com.wuxinvip.apigateway.route;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import javax.servlet.http.HttpServletRequest;

/**
 * @title:
 * @description:
 * @author: wuxin
 * @date:2019/4/17 13:03
 * @location com.wuxinvip.apigateway.route.DemoFilter.class
 */
public class DemoFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(DemoFilter.class);
    //前置过滤器
    @Override
    public String filterType() {
        return null;
    }
    //优先级，数字越大，优先级越低
    @Override
    public int filterOrder() {
        return 0;
    }
    //是否执行该过滤器，true代表需要过滤
    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        logger.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());

        //获取传来的参数accessToken
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            logger.warn("access token is empty");
            //过滤该请求，不往下级服务去转发请求，到此结束
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("{\"result\":\"token is empty!\"}");
            return null;
        }
        //如果有token，则进行路由转发
        logger.info("access token ok");
        //这里return的值没有意义，zuul框架没有使用该返回值
        return null;
    }
}
