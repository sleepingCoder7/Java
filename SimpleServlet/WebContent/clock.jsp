<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clock</title>
</head>
<body>

<%@ include file="/Hello.jsp" %>

<b>The time is: <%= new Date() %></b>


</body>
</html>