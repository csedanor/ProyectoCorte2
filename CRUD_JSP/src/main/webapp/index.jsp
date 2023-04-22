<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Universidad El Bosque</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous"></link>
<script type="text/javascript" src="script.js"></script>
</head>
<body>
	<div class="bg-success p-2 text-white">
		<img width="10%" height="10%" class="rounded mx-auto d-block" alt=""
			src="https://www.unbosque.edu.co/sites/default/files/logo.png">
		<h1 class="text-center">Universidad El Bosque</h1>
	</div>

	<div class="p-3 mb-2 bg-light text-dark">
		<h1 class="text-center text-uppercase text-success">Bienvenido a
			la universidad El Bosque</h1>
	</div>

	<h1 class="text-center">Inscripciones abiertas</h1>
	<div class="text-center">
		<div class="btn-group" role="group" aria-label="Basic example">
			<h1 class="btn btn-write">
				<button type="button" class="btn btn-outline-success">
					<a href="formulario.jsp" class="formulario">FORMULARIO DE
						INSCRIPCIONES</a>
				</button>
			</h1>
		</div>
	</div>
	<img width="15%" height="15%" class="rounded mx-auto d-block" alt=""
		src="https://www.unbosque.edu.co/sites/default/files/2021-05/El%20bosque%20%20universidad.jpg">

	<br />
			<h1 class="text-center">Actualizar datos</h1>
					<div class="text-center">
				<button type="button" class="btn btn-outline-success d-inline-block">
					<a href="actualizar.jsp" class="formulario">ACTUALIZAR INSCRIPCION</a>
				</button>
			</div>
			<br />
			<h1 class="text-center">Eliminar datos</h1>
					<div class="text-center">
				<button type="button" class="btn btn-outline-success d-inline-block">
					<a href="eliminar.jsp" class="formulario">ELIMINAR INSCRIPCION</a>
				</button>
			</div>
			<br /> <br /> 
		<h1 class="text-center">Listar todos los datos</h1>
		<div class="text-center">
			<form action="http://Localhost:8080/CRUD_JSP/InscripcionServlet"
				method="GET">
				<input type="submit" class="btn btn-outline-success d-inline-block"
					value="Mostrar Solicitudes">
			</form>
		</div>
		<br />
		<h1 class="text-center">Listar por carrera</h1>
		<div class="text-center">
			<button type="button" class="btn btn-outline-success d-inline-block">
					<a href="Listar.jsp" class="formulario">LISTAR POR CARRERA</a>
				</button>
			</div>
	<h1></h1>
</body>
</html>
