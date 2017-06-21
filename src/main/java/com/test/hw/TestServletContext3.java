package com.test.hw;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huangwei on 2017/6/21.
 */
public class TestServletContext3 extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ServletContext servletContext  = this.getServletContext();

        String data = servletContext.getInitParameter("url");

        response.getWriter().print(data);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        doGet(request,response);

    }



}
