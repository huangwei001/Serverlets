package com.test.hw;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huangwei on 2017/6/26.
 */
public class TestServletContext4 extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String data = "<h1><font color ='red'>测试</font></h1>";

        response.getOutputStream().write(data.getBytes());

        /*ServletContext servletContext = this.getServletContext();

        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/servlet/TestServletContext5");

        requestDispatcher.forward(request,response);*/

    }

}
