<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 16.11.2019
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="formtask" method="post" action="edit_form">
        <form:hidden path="id"/>
        Title: <form:input path="title"/><br/>
        Description: <form:input path="description"/><br/>
        StartDate: <form:input path="startDate" type="date"/><br/>
        EndDate: <form:input path="endDate" type="date"/><br/>
        UserName: <form:input path="userName"/><br/>

        <input type="submit" value="submit"/>

    </form:form>
</body>
</html>
