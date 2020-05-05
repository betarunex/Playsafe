package com.simple.testapp;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Instant;

@Component
public class RequestLoggingInterceptor extends HandlerInterceptorAdapter {

    private static final String START_TIMER_ATTRIB = "startTimer";

    @Override
    public boolean preHandle(final HttpServletRequest req, final HttpServletResponse res, final Object handler) {
        // start timer
        req.setAttribute(START_TIMER_ATTRIB, Instant.now().toEpochMilli());
        return true;
    }

    @Override
    public void afterCompletion(final HttpServletRequest req, final HttpServletResponse res, final Object handler, final Exception exception) {
        // get time diff
        System.out.println("Timer testing " + req.getAttribute(START_TIMER_ATTRIB));
    }
}
