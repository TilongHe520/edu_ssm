<%--
  Created by IntelliJ IDEA.
  User: tilon
  Date: 2019/11/6
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
    <h2 align="center" >用户登录页面</h2>
    <form action="./Default.jsp" method="post">
        <table align="center" border="1">
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="name" id="username"></td>
            </tr>
            <tr>
                <td>密&nbsp;&nbsp;码:</td>
                <td><input type="password" name="password" id="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="登录" name="login"></td>
                <td><input type="reset" value="重置" name="reset"></td>
            </tr>
        </table>
        <p align="center"><a href="registered.jsp" color=blue>注册用户</a></p>
    </form>
</body>
</html>

