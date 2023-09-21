<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.amdocs.cargomanagementsystem.entity.Truck"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>driver registration page</title>
  </head>
  <body>
  	<h1>Driver Registration Portal</h1>
	<form action="handleDriver" method="post" modelAttribute="driver">
	  
	  <div class="form-group">
	    <label for="driverName">Driver Name</label>
	    <input type="text" class="form-control" id="driverName" aria-describedby="emailHelp" placeholder="Enter name" name="name">
	  </div>
	  
	  <div class="form-group">
	    <label for="driverContact">Driver Contact</label>
	    <input type="text" class="form-control" id="driverContact" aria-describedby="emailHelp" placeholder="Enter Contact Number" name="contactNo">
	  </div>
	  
	  <div class="form-group">
	    <label for="driverLicense">Driver License </label>
	    <input type="text" class="form-control" id="driverLicense" aria-describedby="emailHelp" placeholder="Enter License Number" name="licenseNo">
	  </div>
	  
	  <div class="form-group">
	  	<label for="truckId">Vehicle Number</label>
	  	<select id="truck" name="truck.id" style="width: 200px;" required>
	  	 <%
				  List<Truck> truckList= (List<Truck>) request.getAttribute("truckList");
				  		  	  for(Truck truck:truckList){
				  				  %>
		  <option value="<%= truck.getId() %>"><%= truck.getVehicleNo() %></option>
		  <%
				  	  }
				%>
	  	</select>
	  </div>
	  <div class="form-group">
	  <a href="/driver/" class="btn btn-outline-danger">Back</a></div>
	  
	  <button type="submit" class="btn btn-primary">Add</button>
    </form>
    
   <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
</body>
</html>