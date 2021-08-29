package com.epam.yevheniy.chornenky.marketPlace.serlets;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        ServletOutputStream outputStream = resp.getOutputStream();
        String formattedTime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String responseBody = "<html> <head> <meta> </head> <body>" + formattedTime + "</body> </html>";
        outputStream.write(formattedTime.getBytes(StandardCharsets.UTF_8));
        outputStream.close();
    }
}
