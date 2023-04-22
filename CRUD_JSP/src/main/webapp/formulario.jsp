<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Scanner"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscripciones</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script type="text/javascript" src="script.js"></script>
</head>
<body>
<div class="bg-success p-2 text-white">
		<img width="10%" height="10%" class="rounded mx-auto d-block" alt=""
			src="https://www.unbosque.edu.co/sites/default/files/logo.png">
		<h1 class="text-center">Universidad El Bosque</h1>
	</div>

	<div class="p-3 mb-2 bg-light text-dark">
		<h1 class="text-center text-uppercase text-success">Formulario de inscripciones</h1>
	</div>
	
	<div class="container">
	<h1></h1>
	<hr class="border border-success border-2 opacity-75">

	<h2>Nueva inscripcion:</h2>
	<form action="http://Localhost:8080/CRUD_JSP/InscripcionServlet"
		method="POST">
		<div class="form-group">
				<label for="nombreCompleto" class="fw-bold">Nombre Completo:</label>
				<input type="text" class="form-control" name="nombreCompleto" id="nombreCompleto" placeholder="Ingrese su nombre completo"> 
				<br>
			</div>
			<div class="form-group">
				<label for="fechaNacimiento" class="fw-bold">Fecha de Nacimiento:</label> 
				<input type="date" class="form-control" name="fechaNacimiento" id="fechaNacimiento" onchange="calculoedad()">
				<br>
			</div>
		
			<div class="form-group">
				<label for="edad" class="fw-bold">Edad:</label> <input type="number"
					class="form-control" name="edad" name="edad" id="edad" readonly="readonly">
			</div>
			<br>
			<div class="form-group">
				<label for="colegioGraduacion" class="fw-bold">Colegio de Graduaci�n:</label> 
				<input type="text" class="form-control" name="colegioGraduacion" id="colegioGraduacion" placeholder="Ingrese el nombre del colegio de graduaci�n">
			</div>
			<br>
			<div class="form-group">
				<label for="carreraAspira" class="fw-bold">Carrera a la que aspira:</label> 
				<select class="form-control" name="carreraAspira" id="carreraAspira" onchange="seleccion()">
					<option value="">--Seleccione una opci�n--</option>
					<optgroup label="Artes y Dise�o">
						<option value="Arquitectura">Arquitectura</option>
						<option value="Artes Dramatico">Arte Dramatico</option>
						<option value="Artes Plasticas">Artes Plasticas</option>
						<option value="Diseno Industrial">Dise�o Industrial</option>
						<option value="Diseno Comunicacion">Dise�o de Comunicacion</option>
						<option value="Formacion Musical">Formaci�n Musical</option>
					</optgroup>
					<optgroup label="Ciencias Sociales">
						<option value="cienciaPolitica">Ciencia Pol�tica y Gobierno</option>
						<option value="Derecho">Derecho</option>
						<option value="Filosofia">Filosof�a</option>
						<option value="EducacionInfantil">Licenciatura en Educaci�n Infantil</option>
						<option value="Psicologia">Psicologia</option>
						<option value="Bilinguismo">Licenciatura en Biling�ismo con �nfasis en la Ense�anza del Ingles</option>
						<option value="Lengua Senas">Int�rprete Profesional de la Lengua de Se�as Colombiana - Modalidad Virtual</option>
					</optgroup>
					<optgroup label="Ingenier�as y Administraci�n">
						<option value="Administracion Empresas">Administracion de Empresas</option>
						<option value="Bioingenieria">Bioingenieria</option>
						<option value="Ingenieria Ambiental">Ingenieria Ambiental</option>
						<option value="Ingenieria Electronica">Ingenieria Electr�nica</option>
						<option value="Ingenieria Industrial">Ingenieria Industrial</option>
						<option value="Ingenieria Sistemas">Ingenieria de Sistemas</option>
						<option value="Negocios Internacionales">Negocios Internacionales</option>
						<option value="Matematicas">Matematicas</option>
						<option value="Estadistica">Estadistica</option>
						<option value="Contaduria Publica">Contaduria Publica -	Modalidad Virtual</option>
						<option value="Finanzas">Finanzas - Modalidad Virtual</option>
						<option value="Marketing Transformacion">Marketing y Transformaci�n Digital - Modalidad Virtual</option>
						<option value="Economia">Economia - Modalidad Virtual</option>
						<option value="Administracion Negocios">Administracion de Negocios Sostenibles - Modalidad Virtual</option>
						<option value="Administracion Producion">Administraci�n	de Producci�n y Log�stica Internacional - Modalidad Virtual</option>
					</optgroup>
					<optgroup label="Ciencias Naturales y de la Salud">
						<option value="Biolog�a">Biologia</option>
						<option value="Enfermer�a">Enfermeria</option>
						<option value="Instrumentaci�n Quir�rgica">Instrumentacion Quirurgica</option>
						<option value="Medicina">Medicina</option>
						<option value="Odontolog�a">Odontolog�a</option>
						<option value="Optometr�a">Optometria</option>
						<option value="Qu�mica Farmac�utica">Quimica Farmaceutica</option>
					</optgroup>
				</select>
				</div>
				<br>
				<div class="form-group">
					<label for="preciocarrera" class="fw-bold">Precio de la carrera:</label> 
					<input type="number" class="form-control" name="precioCarrera" id="precioCarrera" readonly="readonly">
				</div>
				<br>
				<div class="form-group">
					<label for="estrato" class="fw-bold">Estrato:</label> 
					<input type="number" class="form-control" name="estrato" id="estrato" min="1" max="6">
				</div>
				<br>
				<div class="form-group">
					<label for="homologado" class="fw-bold">Homologado:</label>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="homologado" id="homologado1" value="si"> 
						<label class="form-check-label" for="homologado"> S� </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="homologado" id="homologado2" value="no"> 
						<label class="form-check-label" for="homologado"> No </label>
					</div>
				</div>
				<br>
				<div class="form-group">
					<label for="rutaImg" class="fw-bold">Foto:</label> 
				<input  type="text" class= "form-control"  id="rutaImg" name="rutaImg" required>
				<br>
				<button type="button" onclick="foto()" >Cargar Link</button> 
				<br>
				<br>
				 <img  id = "img" src ="" width="150" height="200" />
				</div>
				<br>
				<br>
		<div class="row g-1 align-items-center">
			<div class="text-center">
				<button type="button" class="btn btn-outline-success d-inline-block">
					<input type="submit" name="Agregar Inscripcion">
				</button>
			</div>
		</div>
		<h1></h1>
	<hr class="border border-primary border-2 opacity-75">
	</form> </div>
</body>
</html>