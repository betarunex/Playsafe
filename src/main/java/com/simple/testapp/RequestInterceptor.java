package com.simple.testapp;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RequestInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(final HttpServletRequest req, final HttpServletResponse res, final Object handler) {
        // start timer
        return true;
    }

    @Override
    public void afterCompletion(final HttpServletRequest req, final HttpServletResponse res, final Object handler, final Exception exception) {
        // get time diff
    }
}
