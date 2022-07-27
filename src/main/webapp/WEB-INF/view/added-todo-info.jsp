<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: VagramsMac
  Date: 15.07.2022
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Added Todo Info</title>
</head>
<body>
  <h3>Added Todo Info</h3>
  <br><br>
    <form:form action="saveAddedToDo" modelAttribute="addedTodo">
        <form:hidden path="id"/>
        Title:<form:input path="title"/>
        <br><br>
        Description:<form:input path="descriptionTodo"/>
        <br><br>
        Priority:<form:input path="priority"/>
        <br><br>
        Date:<form:input path="dateTodo"/>
        <br><br>
        <input type="submit" value="add">
    </form:form>
</body>
</html>
