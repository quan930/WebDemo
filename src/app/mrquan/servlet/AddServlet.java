package app.mrquan.servlet;

import app.mrquan.factory.ServiceFactory;
import app.mrquan.pojo.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String id = request.getParameter("id");
//        String name = new String(request.getParameter("name").getBytes("iso-8859-1"), "utf-8");
//        double price = Double.valueOf(request.getParameter("price"));
        Book pojo = new Book();
        pojo.setId(request.getParameter("id"));
        pojo.setName(new String(request.getParameter("name").getBytes("iso-8859-1"), "utf-8"));
        pojo.setPrice(Double.valueOf(request.getParameter("price")));
        int m = ServiceFactory.getIServiceBookInstance().add(pojo);
        response.setCharacterEncoding("UTF-8");
        response.setHeader("content-type","text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        if (m==0){
            //失败
            out.print("<script language='javascript'>alert('失败');window.location.href='add.html';</script>");
        }else {
            //成功
//            out.print("<script language='javascript'>alert('成功');window.location.href='show.html';</script>");
//            response.sendRedirect("add.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
