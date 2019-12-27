<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateProfile" method="post">
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" /></td>
				</tr>
					<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				
				<tr>
					<td>Select Role</td>
					<td>
					<select name="role" >
						<option value="STUDENT"> Student </option>
						<option value="EMPLOYEE"> Employee </option>
					</select>
					</td>
				</tr>
				
					<tr>
					<td>Mobile Number</td>
					<td><input type="tel" name="mobile" /></td>
				</tr>
				<tr>
				<td>User Email</td>
					<td><input type="email" name="userMail" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" /></form>
</body>
</html>