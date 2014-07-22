package com.cango.monitor.web.filter;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by caoyanfei079 on 7/22/14.
 */
public class EventFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        try {
            chain.doFilter(request,response);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
