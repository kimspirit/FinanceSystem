<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: karl
  Date: 5/6/13
  Time: 7:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script  type="text/javascript" src="jquery-1.9.1.js">

    </script>
</head>
<body>
<s:form action="query">
    <s:textfield name="financeDTO.statrTime" label="开始日期"></s:textfield>
    <s:textfield name="financeDTO.endTime" label="结束日期"></s:textfield>
    <s:submit label="确认" id="submit"/>

</s:form>

<table width="100%" border="1" cellspacing="0" cellpadding="0">
    <tr>
        <td></td>
        <td>支入</td>
        <td>支出</td>
        <td>日期</td>
        <td>原因</td>
        <td>操作</td>
    </tr>

    <s:iterator value="list" status="status">
        <tr>
            <td><s:property value="#status.count" /></td>
            <td><s:property value="inCome"/></td>
            <td><s:property value="outCome"/></td>
            <td><s:property value="addTime"/></td>
            <td><s:property value="reason"/></td>
            <td>删除 &nbsp &nbsp &nbsp 编辑</td>
            <br>
        </tr>
    </s:iterator>
    <a href="FinanceWeb/add.jsp">添加</a>
</table>
</body>
</html>