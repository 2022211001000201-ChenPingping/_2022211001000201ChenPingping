package com.ChenPingping.week2.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.script.ScriptContext;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ClassName: HelloWorldServlet
 * Package: com.ChenPingping.week2.demo
 * Description:
 *
 * @Author:
 * @Create 2024/3/9 15:14
 * @Version 1.1
 */
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("Name : Chen Pingping\nID : 2022211001000201\nDate and Time" +
                "March Sat 9 15:34:40 CST 2024");
    }
}
