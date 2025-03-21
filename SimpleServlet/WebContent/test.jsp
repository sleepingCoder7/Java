<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Testing JSPs</h3>

<%!
public int add(int a, int b) {
	return a + b;
}

%>

<%
int l = 1;
int j = 2;
int k = l + j;

out.println("Value of k is " + k);

%>

<%
k = add(35643, 87658);
%>
<br>

The value of k is <%=k%>

<%
for (int i = 0; i < 5; i++) {
	out.println("<br> Value of i is " + i);
}

%>

<% for(int i = 5; i < 10; i++) { %>

<br> Value of i is <%=i%>

<% } %>

<%
        out.println("This is the first part of the response.<br>");
        out.flush(); // Flush the buffer to send this part to the client immediately

        // Simulate a delay (e.g., a long-running process)
        Thread.sleep(3000);

        out.println("This is the second part of the response.<br>");
    %>

</body>
</html>