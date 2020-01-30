<%--
  Created by IntelliJ IDEA.
  User: nisum
  Date: 1/24/2020
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>User Registration</title>
    <spring:url value="/resources/css/style.css" var="userCSS1"/>
    <spring:url value="/resources/css/grid.css" var="userCSS"/>
    <link href="${userCSS}" rel="stylesheet" type="text/css"/>
    <link href="${userCSS1}" rel="stylesheet" type="text/css"/>
    <link href="https://fonts.googleapis.com/css?family=Grenze:200,400,400i,600&display=swap" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"/>
    <script>
        $(document).ready(function () {
            $("#id").change(function () {
                $.ajax({
                    url:'validateEmail',
                    data:{id:$("#id").value()},
                    success:function (responseText) {
                        $("#errMsg").text(responseText);
                        if(responseText!=null){
                            $("#id").focus()
                        }
                    }
                })
            })
        });
    </script>

</head>
<body>

<h1>Create User Data</h1>
<section class="section-form">
    <div class="row">
        <form action="registerUser" method="post" class="createUser-form">
            <div class="row">
                <div class="col span-1-of-3">
                    User Id
                </div>
                <div class="col span-2-of-3">
                    <input type="text" name="id" id="id">
                    <span id="errMsg" style="color: red"></span>
                </div>
            </div>
            <div class="row">
                <div class="col span-1-of-3">
                    First Name
                </div>
                <div class="col span-2-of-3">
                    <input type="text" name="firstName">
                </div>
            </div>
            <div class="row">
                <div class="col span-1-of-3">
                    Last Name
                </div>
                <div class="col span-2-of-3"><input type="text" name="lastName"></div>
            </div>
            <div class="row">
                <div class="col span-1-of-3">
                    Email Address
                </div>
                <div class="col span-2-of-3"> <input type="email" name="emailId"> </div>
            </div>
            <div class="row">
                <div class="col span-1-of-3">
                    Phone Number
                </div>  <div class="col span-2-of-3"><input type="text" name="phoneNumber"></div>
            </div>
            <div class="row">
                <div class="col span-2-of-3"><input type="submit" name="register"></div>
            </div>
        </form>
    </div>
</section>

<section class="result">
    <div class="row">
        ${result}
    </div>
</section>

</body>
</html>
