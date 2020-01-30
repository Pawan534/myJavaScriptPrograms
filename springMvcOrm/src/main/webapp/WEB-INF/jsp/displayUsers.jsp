<%--
  Created by IntelliJ IDEA.
  User: nisum
  Date: 1/27/2020
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registered Users</title>
    <spring:url value="/resources/css/style.css" var="userCSS1"/>
    <spring:url value="/resources/css/grid.css" var="userCSS"/>
    <link href="${userCSS}" rel="stylesheet" type="text/css"/>
    <link href="${userCSS1}" rel="stylesheet" type="text/css"/>
    <link href="https://fonts.googleapis.com/css?family=Grenze:200,400,400i,600&display=swap" rel="stylesheet">
</head>
<body>

<h1>List of Users</h1>

<div class="row">
    <section class="user-list">
        <div style="text-align:center;">
            <table class="my-list">
                <tr>
                    <th>User ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email Address</th>
                    <th>Phone Number</th>
                </tr>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.firstName}</td>
                        <td>${user.lastName}</td>
                        <td>${user.emailId}</td>
                        <td>${user.phoneNumber}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </section>
</div>
</body>
</html>