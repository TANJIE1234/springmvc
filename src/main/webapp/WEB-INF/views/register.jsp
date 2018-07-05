<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: tanjie
  Date: 18-7-4
  Time: 下午7:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" href="/static/css/style.css">
</head>
<body>
    <h1>Register</h1>
    <sf:form method="post" commandName="spitter">
        First Name:<sf:input path="firstName" /><sf:errors path="firstName" cssClass="error" /><br />
        Last Name:<sf:input path="lastName" /><br />
        Username:<sf:input path="username" /><br />
        Password:<sf:password path="password" /><br />
        <input type="submit" value="Register">
    </sf:form>
</body>
</html>
