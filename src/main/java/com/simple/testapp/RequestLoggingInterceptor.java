package com.simple.testapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Instant;

@Component
public class RequestLoggingInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(RequestLoggingInterceptor.class);
    private static final String START_TIMER_ATTRIB = "startTimer";

    @Override
    public boolean preHandle(final HttpServletRequest req, final HttpServletResponse res, final Object handler) {
        req.setAttribute(START_TIMER_ATTRIB, Instant.now().toEpochMilli());
        return true;
    }

    @Override
    public void afterCompletion(final HttpServletRequest req, final HttpServletResponse res, final Object handler, final Exception exception) {
        long timeDiff = Instant.now().toEpochMilli() - (Long) req.getAttribute(START_TIMER_ATTRIB);
        logger.info("Total runtime: " + timeDiff + " miliseconds");
    }
}
