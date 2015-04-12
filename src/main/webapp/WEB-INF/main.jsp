<%--
  Created by IntelliJ IDEA.
  User: Пользователь
  Date: 12.04.2015
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app>
<head>
    <title>Main page of customers ejb-test application</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
</head>
<body>
    <h1>This is a main page of customers ejb-test application!</h1>
    <li>Customer REST services url: ${initParam.customerUrl}</li>

    <div>
        <label>Name:</label>
        <input type="text" ng-model="yourName" placeholder="Enter a name here">
        <hr>
        <h1>Hello {{yourName}}!</h1>
    </div>
</body>
</html>
