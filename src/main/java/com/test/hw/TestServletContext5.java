package com.test.hw;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huangwei on 2017/6/21.
 */
public class TestServletContext5 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        doGet(request,response);
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getOutputStream().write("测试ServletContext5".getBytes());

    }

}
