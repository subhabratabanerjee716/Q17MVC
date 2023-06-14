<%@ page import = "java.io.*,java.util.*,java.sql.*,Dao.*,Model.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Docs:-</title>
</head>
<body>



<h1>Inserted data in the mysql database:-</h1>

<table border="1" style="text-align: center;">

		<tr>
		<th>Id</th>
		<th>Topic</th>
		<th>Description</th>
		<th>Content</th>
		</tr>

<%  ResultSet r = DatabaseOperation.select();
		
	while(r.next()){
			
		out.print("<tr>");
		
		out.print("<td>"+r.getInt(1)+"</td>");		
		out.print("<td>"+r.getString(2)+"</td>");
		out.print("<td>"+r.getString(3)+"</td>");
		out.print("<td>"+r.getString(4)+"</td>");
		
		out.print("</tr>");
	}
%>
</table>



 		
         
  


</body>
</html>