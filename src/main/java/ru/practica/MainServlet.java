package ru.practica;

//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.stream.Collectors;
//
//@WebServlet(urlPatterns = {"/cool-servlet"})
//public class MainServlet extends HttpServlet {
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        log("metod init....!...!...!");
//    }
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write("metod start service....!...!...!\n");
//        super.service(req, resp);
//        resp.getWriter().write("metod close service....!...!...!\n");
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String requestURI = req.getRequestURI();
//        String params = fomatParams(req);
//        resp.getWriter().write("metod doGet....!...!...!\nURI: " + requestURI + "\nParams: \n" + params + "\n");
//    }
//
//    private String fomatParams(HttpServletRequest req) {
//        String params = req.getParameterMap()
//                .entrySet()
//                .stream()
//                .map(entry -> {
//                    String param = String.join(" and ", entry.getValue());
//                    return entry.getKey() + " => " + param;
//                })
//                .collect(Collectors.joining("\n"));
//        return params;
//    }
//
//    @Override
//    public void destroy() {
//        log("metod destroy....!...!...!");
//    }
//}
