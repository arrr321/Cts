<%@page import="crm.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

	List <Customer> lst = (List<Customer>)request.getAttribute("success");
		System.out.println(lst);
%>

</body>
</html>