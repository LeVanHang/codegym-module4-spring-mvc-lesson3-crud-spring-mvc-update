<%--
  Created by IntelliJ IDEA.
  User: vanha
  Date: 11/16/2022
  Time: 12:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
    <h2>Striped Rows</h2>
    <p>The .table-striped class adds zebra-stripes to a table:</p>
    <a href="/create" class="btn btn-success" type="button">Create</a>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Img</th>
            <th>Price</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${products}" var="sp">
            <tr>
                <td>${sp.id}</td>
                <td>${sp.name}</td>
                <td><img src="${sp.img}" height="200" width="200"></td>
                <td>${sp.price}</td>
                <td><a type="button" class="btn btn-warning" href="/edit?id=${sp.id}" >Edit</a></td>
                <td><a type="button" class="btn btn-danger" href="/delete/${sp.id}">Delete</a></td>

            </tr>
        </c:forEach>
        </thead>
    </table>
</div>

</body>
</html>
