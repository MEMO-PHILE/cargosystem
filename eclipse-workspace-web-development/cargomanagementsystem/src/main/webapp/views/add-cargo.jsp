<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>cargo registration page</title>
  </head>
  <body>
  	<h1>Cargo Registration Portal</h1>
	<form action="handleCargo" method="post">
	  
	  <div class="form-group">
	    <label for="cargoName">Cargo Name</label>
	    <input type="text" class="form-control" id="cargoName" aria-describedby="emailHelp" placeholder="Enter name" name="name">
	  </div>
	  
	  <div class="form-group">
	    <label for="cargoContact">Cargo Contact</label>
	    <input type="text" class="form-control" id="cargoContact" aria-describedby="emailHelp" placeholder="Enter Contact Number" name="contactNo">
	  </div>
	  
	  <div class="form-group">
	    <label for="cargoService">Cargo Service (logistics,shipping,warehousing)</label>
	    <input type="text" class="form-control" id="cargoService" aria-describedby="emailHelp" placeholder="Enter service" name="serviceType">
	  </div>
	  
	  <div class="form-group">
	  <a href="/cargo/" class="btn btn-outline-danger">Back</a></div>
	  
	  <button type="submit" class="btn btn-primary">Add</button>
    </form>
    
   <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
</body>
</html>