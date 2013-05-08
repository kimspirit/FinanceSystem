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
    <s:form action="add">
        <s:textfield  name="financeDTO.inCome"/>
        <s:textfield  name="financeDTO.outCome"/>
        <s:textfield  name="financeDTO.reason"/>
        <input type="submit" value="确认" />
    </s:form>
</body>
</html>