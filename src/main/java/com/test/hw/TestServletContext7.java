package com.test.hw;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by huangwei on 2017/6/26.
 */
public class TestServletContext7 extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("content-type","text/html;charset=UTF-8");
        readConfig(response);
        response.getWriter().print("<hr/>");
    }

    private void readConfig(HttpServletResponse response) throws IOException {
        ClassLoader loader = TestServletContext7.class.getClassLoader();
        InputStream inputStream = loader.getResourceAsStream("appConfig.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String url = properties.getProperty("url");
        response.getWriter().print(url);

    }
}
