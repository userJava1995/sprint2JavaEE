<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="bootstrap/bootstrap.jsp"%>
</head>
<body onload="">
    <%@include file="navbar.jsp"%>

    <%
        if(request.getParameter("invalidCredentials") != null){
    %>

    <div class="alert alert-danger" role="alert">
        Incorrect email or password
    </div>

    <%
        }
    %>


    <div class="card w-50 row mx-auto">
        <div class="card-header">
            <h1 class="h3 mb-3 fw-normal">Login page</h1>
        </div>
        <div class="card-body">
            <form class="form-control" action="/signIn" method="post">
                <div class="mb-3">
                    <label class="form-label">Email:</label>
                    <input type="email" class="form-control" placeholder="test@gmail.com" name="email">
                </div>
                <br>
                <div class="mb-3">
                    <label class="form-label">Password:</label>
                    <input type="password" class="form-control" placeholder="******" name="password">
                </div>
                <br>
                <button class="btn btn-success w-100 py-2" type="submit">Sign in</button>
            </form>
        </div>
    </div>



</body>
</html>
