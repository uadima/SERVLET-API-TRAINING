package com.epam.yevheniy.chornenky.market.place.servlet.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface PageController {

    void handle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
