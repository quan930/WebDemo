<%@ page import="app.mrquan.factory.ServiceFactory" %>
<%@ page import="java.util.List" %>
<%@ page import="app.mrquan.pojo.Book" %><%--
  Created by IntelliJ IDEA.
  User: daquan
  Date: 2018/9/26
  Time: 下午3:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部商品</title>
</head>
<body>
<%
    List<Book> pojos = ServiceFactory.getIServiceBookInstance().list();
    out.print("<table border=\"1\" align=\"center\">");
    out.print("<tr><td>编号</td><td>名字</td><td>价格</td><td>删除</td></tr>");
    for (int i = 0; i < pojos.size(); i++) {
        out.print("<tr><td>"+pojos.get(i).getId()+"</td><td>"+pojos.get(i).getName()+"</td><td>"+pojos.get(i).getPrice()+"</td>");
        out.print("<form action=\"delete\" method=\"post\"><td><input type=\"submit\" value=\"删除\"><input type=\"hidden\" name=\"number\" value=\""+pojos.get(i).getId()+"\"></td></form></tr>");
    }
    out.print("</table>");
%>
</body>
</html>
