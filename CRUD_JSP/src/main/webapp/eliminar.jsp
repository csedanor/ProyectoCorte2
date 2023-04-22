<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Borrar inscripción</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="bg-success p-2 text-white">
		<img width="10%" height="10%" class="rounded mx-auto d-block" alt=""
			src="https://www.unbosque.edu.co/sites/default/files/logo.png">
		<h1 class="text-center">Universidad El Bosque</h1>
	</div>
	
	<div class="p-3 mb-2 bg-light text-dark">
		<h1 class="text-center text-uppercase text-success">Formulario de eliminacion</h1>
	</div>
	<div class="container my-5">
		<h1>Borrar inscripción</h1>
		<form action="http://Localhost:8080/CRUD_JSP/EliminarServlet" method="POST" class="form-inline">
			<div class="form-group mx-sm-3 mb-2">
				<label for="nombre" class="sr-only">ID: </label>
				<input type="number" class="form-control" id="idInscripcion" name="idInscripcion" placeholder="ID del registro">
			</div>
			<button type="submit" class="btn btn-danger mb-2">Eliminar</button>
		</form>
	</div>
</body>
</html>
