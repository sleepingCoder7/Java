<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String userName = request.getParameter("name");
if(userName != null) {
	session.setAttribute("sessionUserName", userName);
	//application.setAttribute("applicationUserName", userName);
	pageContext.setAttribute("pageContextUserName", userName);
	pageContext.setAttribute("applicationUserName", userName, PageContext.APPLICATION_SCOPE);
	out.println("Value of applicationUserName is " + pageContext.findAttribute("applicationUserName"));
}
%>

<br>
The user name in the request object is: <%= userName %>
<br>
User name in the session object is: <%= session.getAttribute("sessionUserName") %>
<br>
User name in the application context object is: <%= application.getAttribute("applicationUserName") %>
<br>
User name in the page context object is: <%= pageContext.getAttribute("pageContextUserName") %>

</body>
</html>