package com.test.hw;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by huangwei on 2017/6/19.
 */
public class Serverlet extends HttpServlet{

    /**
     * 定义servletConfig对象来接收配置的初始化参数
     */
    private ServletConfig servletConfig;

    /**
     *当Servlet配置了初始化的参数后，Web容器在创建实例对象时，
     * 会自动将这些初始化的参数封装到ServletConfig对象中，
     * 并在调用servlet的init方法，将ServletConfig对象传递给Servlet。
     * 进而程序员通过ServletConfig对象就可以得到当前servlet的初始化信息
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException{

        this.servletConfig = servletConfig;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //获取在web.xml文件中配置的初始化参数
        String paramVal = this.servletConfig.getInitParameter("name");//获取指定的初始化参数
        ServletContext servletContext = this.servletConfig.getServletContext();
        response.getWriter().print(paramVal);
        response.getWriter().print("<hr/>");
        //获取所有的初始化参数
        Enumeration<String> enumeration = servletConfig.getInitParameterNames();
        while (enumeration.hasMoreElements()){
            String name = enumeration.nextElement();
            String value = servletConfig.getInitParameter(name);
            response.getWriter().print(name + "=" + value + "<br/>");
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        this.doGet(request,response);
    }







}
