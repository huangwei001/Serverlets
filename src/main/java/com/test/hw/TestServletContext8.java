package com.test.hw;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by huangwei on 2017/6/26.
 */
public class TestServletContext8 extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    };

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String data = "测试缓冲时间";
        response.setDateHeader("expires",System.currentTimeMillis() + 24 * 3600 * 1000);
        response.getOutputStream().write(data.getBytes());
    }
}
