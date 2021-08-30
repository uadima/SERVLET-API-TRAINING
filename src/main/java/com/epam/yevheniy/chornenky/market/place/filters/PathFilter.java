package com.epam.yevheniy.chornenky.market.place.filters;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PathFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String requestURI = request.getRequestURI();
        if (!requestURI.startsWith("/static/") && !requestURI.startsWith("/action/")) {
            request.getRequestDispatcher("/action/not-found").forward(request, response);
        } else {
            super.doFilter(request, response, chain);
        }
    }
}
