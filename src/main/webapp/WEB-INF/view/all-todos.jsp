<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: VagramsMac
  Date: 14.07.2022
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TodoTable</title>
</head>
<body>
    <br>
    <table>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Priority</th>
            <th>Date</th>
            <th>Operations</th>
        </tr>
        <c:forEach var="todo" items="${allToDs}">
            <c:url var="updateButton" value="/updateInfo">
                <c:param name="todoId" value="${todo.id}"/>
            </c:url>
            <c:url var="deleteButton" value="/deleteTodo">
                <c:param name="todoId" value="${todo.id}"/>
            </c:url>
            <tr>
                <td>${todo.title}</td>
                <td>${todo.descriptionTodo}</td>
                <td>${todo.priority}</td>
                <td>${todo.dateTodo}</td>
                <td>
                    <input type="button" value="Update" onclick="window.location.href='${updateButton}'">
                </td>
                <td>
                    <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'">
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <br>
<input type="button" value="add todo" onclick="window.location.href='addNewTodo'">

</body>
</html>
