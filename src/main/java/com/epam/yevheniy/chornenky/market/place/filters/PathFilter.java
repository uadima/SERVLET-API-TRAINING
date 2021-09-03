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
        if (requestURI.equals("/")) {
            request.getRequestDispatcher("action/home-page").forward(request, response);
        }
        else if (!requestURI.startsWith("/static/")) {
            request.getRequestDispatcher("/action" + requestURI).forward(request, response);
        } else {
            super.doFilter(request, response, chain);
        }
    }
}
