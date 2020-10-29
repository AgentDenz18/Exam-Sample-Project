<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
.center {
  margin: auto;
  width: 50%;
  border: 5px solid black;
  padding: 10px;
}
.title{
  margin: auto;
  width: 30%;
  padding: 10px;
}
.submit{
  margin: auto;
  width: 20%;
  padding: 10px;
}
</style>

	<div class="center">
	<div class="title"><h3>MiniBank System</h3></div>
	
		<table align="center">
			<tr>
				<td><label>User Name:</label></td>
				<td><input type="text"></input></td>
			</tr>
			<tr>
				<td><label>Deposit:</label></td>
				<td><input type="text"></input></td>
			</tr>
			<tr>
				<td><label>Withdraw:</label></td>
				<td><input type="text"></input></td>
			</tr>
			<tr>
				<td><label>Transfer:</label></td>
				<td><input type="text"></input></td>
			</tr>
			<tr>
				<td><label>Transaction History:</label></td>
				<td><input type="submit" value='transaction History'></input></td>
			</tr>
		</table>
		
		<div class="submit">
				<input type="submit" value="submit"></input>
		</div>
	</div>


</body>
</html>