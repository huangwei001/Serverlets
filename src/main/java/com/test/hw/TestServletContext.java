package com.test.hw;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by huangwei on 2017/6/21.
 */
public class TestServletContext extends HttpServlet{


    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request,response);
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String data = "TestServletContext";

        ServletContext servletContext = this.getServletConfig().getServletContext();

        servletContext.setAttribute("data", data);

    }



}
