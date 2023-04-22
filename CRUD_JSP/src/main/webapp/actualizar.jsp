<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Actualizar inscripción</title>
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
		<h2>Actualizar Inscripción</h2>
		<form action="http://Localhost:8080/CRUD_JSP/ActualizarServlet" method="POST">
			<div class="form-group">
				<label for="nombre">Nombre:</label>
				<input type="text" class="form-control" id="nombre" name="nombre" required>
			</div>
		<div class="form-group">
				<label for="carreraAspira" class="fw-bold">Nueva carrera a la que aspira:</label> 
				<select class="form-control" name="carreraAspira" id="carreraAspira" onchange="seleccion()">
					<option value="">--Seleccione una opción--</option>
					<optgroup label="Artes y Diseño">
						<option value="Arquitectura">Arquitectura</option>
						<option value="Artes Dramatico">Arte Dramatico</option>
						<option value="Artes Plasticas">Artes Plásticas</option>
						<option value="Diseno Industrial">Diseño Industrial</option>
						<option value="Diseno Comunicacion">Diseño de Comunicación</option>
						<option value="Formacion Musical">Formación Musical</option>
					</optgroup>
					<optgroup label="Ciencias Sociales">
						<option value="cienciaPolitica">Ciencia Política y Gobierno</option>
						<option value="Derecho">Derecho</option>
						<option value="Filosofia">Filosofía</option>
						<option value="EducacionInfantil">Licenciatura en Educación Infantil</option>
						<option value="Psicologia">Psicologia</option>
						<option value="Bilinguismo">Licenciatura en Bilingüismo con Énfasis en la Enseñanza del Inglés</option>
						<option value="Lengua Senas">Intérprete Profesional de la Lengua de Señas Colombiana - Modalidad Virtual</option>
					</optgroup>
					<optgroup label="Ingenierías y Administración">
						<option value="Administracion Empresas">Administración de Empresas</option>
						<option value="Bioingenieria">Bioingeniería</option>
						<option value="Ingenieria Ambiental">Ingeniería Ambiental</option>
						<option value="Ingenieria Electronica">Ingeniería Electrónica</option>
						<option value="Ingenieria Industrial">Ingeniería Industrial</option>
						<option value="Ingenieria Sistemas">Ingeniería de Sistemas</option>
						<option value="Negocios Internacionales">Negocios Internacionales</option>
						<option value="Matematicas">Matemáticas</option>
						<option value="Estadistica">Estadística</option>
						<option value="Contaduria Publica">Contaduría Pública -	Modalidad Virtual</option>
						<option value="Finanzas">Finanzas - Modalidad Virtual</option>
						<option value="Marketing Transformacion">Marketing y Transformación Digital - Modalidad Virtual</option>
						<option value="Economia">Economía - Modalidad Virtual</option>
						<option value="Administracion Negocios">Administración de Negocios Sostenibles - Modalidad Virtual</option>
						<option value="Administracion Producion">Administración	de Producción y Logística Internacional - Modalidad Virtual</option>
					</optgroup>
					<optgroup label="Ciencias Naturales y de la Salud">
						<option value="Biología">Biología</option>
						<option value="Enfermería">Enfermería</option>
						<option value="Instrumentación Quirúrgica">Instrumentación Quirúrgica</option>
						<option value="Medicina">Medicina</option>
						<option value="Odontología">Odontología</option>
						<option value="Optometría">Optometría</option>
						<option value="Química Farmacéutica">Química Farmacéutica</option>
					</optgroup>
				</select>
			</div>
			<button type="submit" class="btn btn-primary">Actualizar</button>
		</form>
	</div>
</body>
</html>