<%@page import="crm.Customer"%>
<%@page import="java.util.List"%>
<%@page import="crm.CustomerServiceImpl"%>
<%@page import="crm.CustomerService"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>

<html>

<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Add customer"
				   onclick="window.location.href='customer-form.jsp'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
			<table data-role="table" id="table-1" class="ui-responsive">
				<thead>
					
				</thead>
				<tbody>
					
				</tbody>
			</table>
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Update </th>
				</tr>
				
				<c:forEach var = "tempcustomer"  items ="${Customers }">
					<c:url var = "UpdateUrl" value="updateCustomer.do">
					
					<c:param name="customerId" value="${tempcustomer.id}S"></c:param>
					</c:url>
			
				
				</c:forEach>
					
					<tr>
							<td> ${tempcustomer.firstName}</td>
							<td>${tempcustomer.lastName} </td>
							<td>${tempcustomer.email}</td>
							<td><a href = "${UpdateUrl}"> Update</a>
					</tr>		
					
			</table>
			
		</div>
	
	</div>
	

</body>

</html>