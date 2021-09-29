<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/25
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>

    <h3>测试查询</h3>
    <a href="user/findAll">findAll</a>

    <br/>
    <hr/>

    <h3>测试保存</h3>
    <form action="user/saveUser" method="post">
        姓名：<input type="text" name="username"><br/>
        生日：<input type="text" name="birthday"><br/>
        性别：<input type="text" name="sex"><br/>
        地址：<input type="text" name="address"><br/>
        <input type="submit" value="保存">
    </form>


</body>
</html>
