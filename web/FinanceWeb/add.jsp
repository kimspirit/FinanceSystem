<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: karl
  Date: 5/5/13
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="add" method="post">
    支入<input name="financeDTO.inCome"/><br>
    支出<input name="financeDTO.outCome"/><br>
    原因<input name="financeDTO.reason"/><br>
    <input type="submit" value="确认"/>
</form>
</body>
</html>