package com.locanet.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @Description
 * @Author Loca
 * @Date 2019/8/21 0021 11:02
 **/
@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //前置过滤器
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //PRE_DECORATION_FILTER_ORDER = 5
        return 4;
    }

    @Override
    public boolean shouldFilter() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        //拦截order
        if("/apigateway/order/order/save".equals(request.getRequestURI())){
            return true;
        }
        return false;
    }

    @Override
    //业务逻辑
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("URI:"+requestURI);
        System.out.println("URL:"+requestURL);
        return null;
    }
}
