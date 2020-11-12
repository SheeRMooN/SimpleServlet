package ru.servlet_2;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet2")
public class MainServlet_2 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8;");
        System.out.println("Hello ssssss");
        resp.getWriter().write("<h1>Hello doGet</h1>");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        System.out.println();
        System.out.println(firstName);
        System.out.println(lastName);
        resp.getWriter().write("first name : " + firstName + "\n<br>");
        resp.getWriter().write("last name : " + lastName + "\n");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.getWriter().write("<h1>Hello doPost</h1>");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        System.out.println();
        System.out.println(firstName);
        System.out.println(lastName);
        resp.getWriter().write("first name : " + firstName + "\n<br>");
        resp.getWriter().write("last name : " + lastName + "\n");
    }
}
