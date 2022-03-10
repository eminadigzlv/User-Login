<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 23.10.2019
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Task Table</title>
    <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css"></link>
</head>
<body>
<h2>Task Table</h2>
<button>
    <a href="addTask">
        Add Task
    </a>

</button>
<table id = "task-table">
    <thead>
    <tr>
        <td>ID</td>
        <td>Title</td>
        <td>Description</td>
        <td>Start date</td>
        <td>End date</td>
        <td>User name</td>
        <td>Action</td>
    </tr>
    </thead>

    <tbody>

    </tbody>
</table>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="http://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
<script>
    $(document).ready(function() {
        $('#task-table ').DataTable({
            "lengthMenu":[[5,10,20,50,100,-1], [5,10,20,50,100,'All']],
            "processing": true,
            "serverSide": true,
            "ajax": "getTaskListAjax"
        });
    } );
</script>
</html>
