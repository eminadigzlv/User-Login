<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 15.11.2019
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>AddTask</title>
</head>
<body>
    <form:form modelAttribute="task" method="post" action="addTask">

        Title: <form:input path="title"/><br/>
        Description: <form:input path="description"/><br/>
        StartDate: <form:input path="startDate" type="date"/><br/>
        EndDate: <form:input path="endDate" type="date"/><br/>
        UserName: <form:input path="userName"/><br/>

        <input type="submit" value="submit"/>
    </form:form>


</body>
</html>
