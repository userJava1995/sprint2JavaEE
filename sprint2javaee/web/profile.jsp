<%@ page import="kz.bitlab.shop.items.users.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="bootstrap/bootstrap.jsp"%>
</head>
<body>

    <%@include file="navbar.jsp"%>


    <main style="text-align: center">
        <%
            String name = (String) request.getAttribute("name");
            System.out.println(name);
        %>
        <h1 style="font-size: 50px">Hello <%=name%> Profile</h1>
        <p style="color: grey">This is your profile page</p>
    </main>



</body>
</html>
