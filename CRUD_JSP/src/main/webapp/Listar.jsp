<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="co.edu.unbosque.model.InscripcionDAOImpl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
	<form action="http://Localhost:8080/CRUD_JSP/ListarServlet" method="GET">
	</form>
	<div class="p-3 mb-2 bg-light text-dark">
        <h3 class="text-center text-uppercase text-success\">Lista por carrera</h3>
    </div>
    
    <div class="container">
        <table class="table table-bordered">
            <thead>
                <tr class="bg-light">
                <th># Registro</th>
                    <th>Nombre</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Edad</th>
                    <th>Colegio de Graduacion</th>
                    <th>Carrera aspirada</th>
                    <th>Precio carrera</th>
                    <th>Estrato</th>
                    <th>Homologado</th>
                    <th>Foto</th>
                </tr>
            </thead>
        </table>
        <a href="index.jsp" class="btn btn-primary btn-sm">Volver</a>
    </div>
</body>
</html>