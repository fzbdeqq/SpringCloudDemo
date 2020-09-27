package com.snail.filteringgateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/27 21:20
 */
@Slf4j
@Component
public class SimpleFilter extends ZuulFilter {

    @Override
    public String filterType() {
        //pre filters run before the request is routed.
        //route filters can handle the actual routing of the request.
        //post filters run after the request has been routed.
        //error filters run if an error occurs in the course of handling the request.
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest request=ctx.getRequest();
        log.info("{} request to {}",request.getMethod(),
                request.getRequestURL().toString());
        return null;
    }
}
