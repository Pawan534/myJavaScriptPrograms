<%--
  Created by IntelliJ IDEA.
  User: nisum
  Date: 1/24/2020
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <form action="/registerUser" method="post">
        <pre>
            User Id:    <input type="text" name="id">
            First Name: <input type="text" name="firstName">
            Last Name:  <input type="text" name="lastName">
            Email Address:  <input type="email" name="emailAddr">
            Phone Number:   <input type="text" name="phoneNumber">
            Submit: <input type="submit" name="register">
        </pre>
    </form>
        <div>
            ${result}
        </div>
</body>
</html>
