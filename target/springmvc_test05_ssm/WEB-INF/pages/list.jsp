<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/25
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
    <h3>展示所有用户信息！</h3>

    <c:forEach items="${users}" var="user">
        ${user.id}
        ${user.username}
        ${user.sex}
        ${user.birthday}
        ${user.address}

    </c:forEach>
</body>
</html>
