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
				<label for="colegioGraduacion" class="fw-bold">Colegio de Graduación:</label> 
				<input type="text" class="form-control" name="colegioGraduacion" id="colegioGraduacion" placeholder="Ingrese el nombre del colegio de graduación">
			</div>
			<br>
			<div class="form-group">
				<label for="carreraAspira" class="fw-bold">Carrera a la que aspira:</label> 
				<select class="form-control" name="carreraAspira" id="carreraAspira" onchange="seleccion()">
					<option value="">--Seleccione una opción--</option>
					<optgroup label="Artes y Diseño">
						<option value="Arquitectura">Arquitectura</option>
						<option value="Artes Dramatico">Arte Dramatico</option>
						<option value="Artes Plasticas">Artes Plasticas</option>
						<option value="Diseno Industrial">Diseño Industrial</option>
						<option value="Diseno Comunicacion">Diseño de Comunicacion</option>
						<option value="Formacion Musical">Formación Musical</option>
					</optgroup>
					<optgroup label="Ciencias Sociales">
						<option value="cienciaPolitica">Ciencia Política y Gobierno</option>
						<option value="Derecho">Derecho</option>
						<option value="Filosofia">Filosofía</option>
						<option value="EducacionInfantil">Licenciatura en Educación Infantil</option>
						<option value="Psicologia">Psicologia</option>
						<option value="Bilinguismo">Licenciatura en Bilingüismo con Énfasis en la Enseñanza del Ingles</option>
						<option value="Lengua Senas">Intérprete Profesional de la Lengua de Señas Colombiana - Modalidad Virtual</option>
					</optgroup>
					<optgroup label="Ingenierías y Administración">
						<option value="Administracion Empresas">Administracion de Empresas</option>
						<option value="Bioingenieria">Bioingenieria</option>
						<option value="Ingenieria Ambiental">Ingenieria Ambiental</option>
						<option value="Ingenieria Electronica">Ingenieria Electrónica</option>
						<option value="Ingenieria Industrial">Ingenieria Industrial</option>
						<option value="Ingenieria Sistemas">Ingenieria de Sistemas</option>
						<option value="Negocios Internacionales">Negocios Internacionales</option>
						<option value="Matematicas">Matematicas</option>
						<option value="Estadistica">Estadistica</option>
						<option value="Contaduria Publica">Contaduria Publica -	Modalidad Virtual</option>
						<option value="Finanzas">Finanzas - Modalidad Virtual</option>
						<option value="Marketing Transformacion">Marketing y Transformación Digital - Modalidad Virtual</option>
						<option value="Economia">Economia - Modalidad Virtual</option>
						<option value="Administracion Negocios">Administracion de Negocios Sostenibles - Modalidad Virtual</option>
						<option value="Administracion Producion">Administración	de Producción y Logística Internacional - Modalidad Virtual</option>
					</optgroup>
					<optgroup label="Ciencias Naturales y de la Salud">
						<option value="Biología">Biologia</option>
						<option value="Enfermería">Enfermeria</option>
						<option value="Instrumentación Quirúrgica">Instrumentacion Quirurgica</option>
						<option value="Medicina">Medicina</option>
						<option value="Odontología">Odontología</option>
						<option value="Optometría">Optometria</option>
						<option value="Química Farmacéutica">Quimica Farmaceutica</option>
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
						<label class="form-check-label" for="homologado"> Sí </label>
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