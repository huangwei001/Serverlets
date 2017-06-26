package com.test.hw;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by huangwei on 2017/6/26.
 */
public class TestServletContext6 extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //设置页面的编码格式
        response.setHeader("content-type","text/html;charset=UTF-8");
        readSrcConfig(response);
        response.getOutputStream();
        response.getWriter().print("<hr/>");
    }

    private void readSrcConfig(HttpServletResponse response) throws IOException {
        InputStream inputStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/appConfig.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String url = properties.getProperty("url");
        response.getWriter().print(url);

    }

}
