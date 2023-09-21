<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.amdocs.cargomanagementsystem.entity.Driver"%>
    <%@page isELIgnored="false" %> 
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>driver page</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col -md-12">
				<h1 class="text-center mb-3">Welcome to Driver Portal</h1>
				<!-- copy table format by searching table in bootstrap 4 -->
				<table class="table table-striped">
				  <thead>
				    <tr>
				      <th scope="col">Driver Id</th>
				      <th scope="col">Driver Name</th>
				      <th scope="col">Driver Contact</th>
				      <th scope="col">Driver License</th>
				      <th scope="col">Vehicle Number</th>
				      <th scope="col">Action</th>
				    </tr>
				  </thead>
				  <tbody>
				  
				  <%
				  				  List<Driver> driverList= (List<Driver>) request.getAttribute("driverList");
				  				  String vehicleNumber="NULL";
				  				  		  	  for(Driver driver:driverList){
				  				  		  		  if(driver.getTruck()!=null)
				  				  		  			  vehicleNumber=driver.getTruck().getVehicleNo();
				  				  %>
					    <tr>
					      <th scope="row"><%= driver.getId() %></th>
					      <td><%= driver.getName() %></td>
					      <td><%= driver.getContactNo() %></td>
					      <td><%= driver.getLicenseNo() %></td>
					      <td><%= vehicleNumber %></td>
					      <td><a href="delete/<%= driver.getId() %>">delete</a></td>
					      <td><a href="update/<%= driver.getId() %>">update</a></td>
					    </tr>
				<%
				  	  }
				%>
				  </tbody>
				</table>
				
				<div class="container text-center">
				<a href="addDriver" class="btn btn-outline-success">Add Driver</a></div>
				<div class="container text-center">
				<a href="/" class="btn btn-outline-danger">Back</a></div>
			</div>
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
</body>
</html>