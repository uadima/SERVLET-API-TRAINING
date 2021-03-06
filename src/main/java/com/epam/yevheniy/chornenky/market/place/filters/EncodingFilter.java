package com.epam.yevheniy.chornenky.market.place.filters;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        }
        finally {
            servletResponse.setContentType("text/html; charset=UTF-8");
        }
    }
}
