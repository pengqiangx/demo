package com.github.pengqiangx.demo.safe.xss;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        request.setAttribute("info", name);//保存错误信息
        request.getRequestDispatcher("/page/xss/xss.jsp").forward(request,response);//跳转
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
       this.doGet(httpServletRequest, httpServletResponse);
    }
}

