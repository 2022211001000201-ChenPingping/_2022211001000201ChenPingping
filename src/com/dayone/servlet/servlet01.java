package com.dayone.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: servlet01
 * Package: com.dayone.servlet
 * Description:
 *
 * @Author:
 * @Create 2024/3/4 20:31
 * @Version 1.1
 * 实现servlet
 * 1. 创建普通java类
 * 2. 实现servlet的规范， 基础 HttpServlet类
 * 3. 重写service方法，用来处理请求
 * 4. 设置注解，指定访问的路径
 */
@WebServlet("/ser01")
    //@WebServlet(name = "Servlet01", value = {"/ser01", "/ser001"})
public class servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        System.out.println("hello Servlet!");
        // 通过流输出数据到浏览器
        resp.getWriter().write("hello Servlet!");
    }
}
