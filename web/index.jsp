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
</head>
<body>
    <s:form action="query">
        <s:textfield name="financeDTO.statrTime" label="开始日期"></s:textfield>
        <s:textfield name="financeDTO.endTime" label="结束日期"></s:textfield>
        <s:submit label="确认" />
    </s:form>

    <table width="100%" border="1" cellspacing="0" cellpadding="0">
        <tr>
            <td></td>
            <td>支入</td>
            <td>支出</td>
            <td>日期</td>
            <td>原因</td>
        </tr>


    <s:iterator value="list">
        <tr>
            <td></td>
            <td><s:property value="inCome"/> </td>
            <td><s:property value="outCome"/></td>
            <td><s:property value="addTime"/></td>
            <td><s:property value="reason"/></td><br>
        </tr>
    </s:iterator>

    </table>
</body>
</html>