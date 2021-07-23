package com.example.demogit.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(urlPatterns = {"/login"}, initParams = {@WebInitParam(name = "name", value = "a")})
public class AuthenticationFilter implements Filter {

    private boolean flag = false;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String name = filterConfig.getInitParameter("name");
        if ("a".equals(name)) {
            flag = true;
        }
        System.out.println("初始化");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("2");
        if (!flag) {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
        Filter.super.destroy();

    }
}
