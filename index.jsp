<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet_Forum</title>
</head>
<body>

<h1 style="text-align: center;text-shadow: black;">Please fill the below form :-</h1>
<div class="container" style="text-align: center;text-shadow: black;" >
<form action="Controller1" method="get" >
	<div style="padding-bottom: 20px;padding-left: 37px">
		Title :-    <input  type="text" placeholder="Title" name="title">
		<br>
	</div>
	<div style="padding-bottom: 20px">
	Description :-<input  type="text" placeholder="Description" name="desc">
	<br>
	</div>
	<div style="padding-bottom: 20px;padding-left: 22px">
	Content :-   <input  type="text" placeholder="Content" name="content">
	<br>
	</div>
	<div style="padding-bottom: 20px;padding-left: 45px">
	<input  type ="submit" value="Submit">'
	</div>
</form>

</div>
</body>
</html>