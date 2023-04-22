package co.edu.unbosque.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import co.edu.unbosque.model.InscripcionDAO;
import co.edu.unbosque.model.InscripcionDAOImpl;
import co.edu.unbosque.model.InscripcionDTO;
import co.edu.unbosque.model.persistence.FileHandler;

/**
 * Servlet implementation class InscripcionServlet
 */
public class InscripcionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private InscripcionDAOImpl dao;
	private FileHandler fh;

	public InscripcionServlet() {
		this.dao = new InscripcionDAOImpl();
		this.fh = new FileHandler();
		this.dao.setInscritos(this.fh.readfile());

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
		salida.println("<html>");
		salida.println("<head>");
		salida.println(
				"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
		salida.println(
				"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>");
		salida.println(
				"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>");
		salida.println(
				"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>");
		salida.println("<title>Lista de todas las solicitudes</title>");
		salida.println("</head>");
		salida.println("<body>");
		salida.println("<div class=\"bg-success p-2 text-white\">");
		salida.println("<img width=\"10%\" height=\"5%\" class=\"rounded mx-auto d-block\" alt=\"\"");
		salida.println("src=\"https://www.unbosque.edu.co/sites/default/files/logo.png\">");
		salida.println("<h1 class=\"text-center\">Universidad El Bosque</h1>");
		salida.println("</div>");
		salida.println("<div class=\"p-3 mb-2 bg-light text-dark\">");
		salida.println("<h3 class=\"text-center text-uppercase text-success\">Lista de todas las solicitudes</h3>");
		salida.println("</div>");
		salida.println("<div class=\"container\">");
		salida.println("<table class=\"table table-bordered\">");
		salida.println("<thead>");
		salida.println("<tr class=\"bg-light\">");
		salida.println("<th>Registro # </th>");
		salida.println("<th>Nombre</th>");
		salida.println("<th>Fecha de Nacimiento</th>");
		salida.println("<th>Edad</th>");
		salida.println("<th>Colegio de Graduaci�n</th>");
		salida.println("<th>Carrera Aspira</th>");
		salida.println("<th>Precio Carrera</th>");
		salida.println("<th>Estrato</th>");
		salida.println("<th>Homologado</th>");
		salida.println("<th>Foto</th>");
		salida.println("</tr>");
		salida.println("</thead>");
		// Obtener la lista de inscripciones desde la base de datos
		ArrayList<InscripcionDTO> inscripciones = dao.listar();
		int i = 1;
		if (inscripciones != null && inscripciones.size() > 0) {
			for (InscripcionDTO inscripcion : inscripciones ) {
				salida.println("<tr>");
				salida.println("<td>" + i + "</td>");
				salida.println("<td>" + inscripcion.getNombre() + "</td>");
				salida.println("<td>" + inscripcion.getFecha() + "</td>");
				salida.println("<td>" + inscripcion.getEdad() + "</td>");
				salida.println("<td>" + inscripcion.getColegio() + "</td>");
				salida.println("<td>" + inscripcion.getCarrera() + "</td>");
				salida.println("<td>" + inscripcion.getPrecio() + "</td>");
				salida.println("<td>" + inscripcion.getEstrato() + "</td>");
				salida.println("<td>" + inscripcion.getHomologado() + "</td>");
				salida.println("<td>" + inscripcion.getFoto() + "</td>");
				i = i+1;
			}
		}
		salida.println("<tbody>");
		salida.println("</div>");
		salida.println("<div class=\"container\">");		
		salida.println("<a href=\"index.jsp\" class=\"btn btn-primary btn-sm\">Volver</a>");
		salida.println("</div>");
		salida.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		resp.getWriter().append("Served at: ").append(req.getContextPath());

		String nombre = req.getParameter("nombreCompleto");
		String fecha_Nacimiento = req.getParameter("fechaNacimiento");
		String edad = req.getParameter("edad");
		String colegio = req.getParameter("colegioGraduacion");
		String carrera = req.getParameter("carreraAspira");
		String precio = req.getParameter("precioCarrera");
		String estrato = req.getParameter("estrato");
		String homologado = req.getParameter("homologado");
		String foto = req.getParameter("rutaImg");

		this.dao.crearInscripcion(nombre, fecha_Nacimiento, edad, colegio, carrera, precio, estrato, homologado, foto);

		PrintWriter salida = resp.getWriter();

		salida.println("<html>");
		salida.println(
				"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
		salida.println(
				"  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>");
		salida.println(
				"  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>");
		salida.println(
				"  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>");
		salida.println("<head>");
		salida.println("<title> Creado exitosamente </title>");
		salida.println("</head>");
		salida.println("<body>");
		salida.println("<div class=\"bg-success p-2 text-white\">");
		salida.println("<img width=\"10%\" height=\"5%\" class=\"rounded mx-auto d-block\" alt=\"\"");
		salida.println("src=\"https://www.unbosque.edu.co/sites/default/files/logo.png\">");
		salida.println("<h1 class=\"text-center\">Universidad El Bosque</h1>");
		salida.println("</div>");
		salida.println("<div class=\"p-3 mb-2 bg-light text-dark\">");
		salida.println("<h3 class=\"text-center text-uppercase text-success\">Lista de inscripciones</h3>");
		salida.println("</div>");
		salida.println(
				"<h4 class=\"text-center\" \"p-3 mb-2 bg-success text-white\"> Insripcion completada con exito </h4>");
		salida.println("<br>");
		salida.println("<div class=\"text-center\">");
		salida.println("<h4> Los datos enviados fueron: </h4>");
		salida.println("<div class=\"container\">");
		salida.println("<table class=\"table table-bordered\">");
		salida.println("<thead>");
		salida.println("<tr class=\"bg-light\">");
		salida.println("<th>Registro # </th>");
		salida.println("<th>Nombre</th>");
		salida.println("<th>Fecha de Nacimiento</th>");
		salida.println("<th>Edad</th>");
		salida.println("<th>Colegio de Graduaci�n</th>");
		salida.println("<th>Carrera Aspira</th>");
		salida.println("<th>Precio Carrera</th>");
		salida.println("<th>Estrato</th>");
		salida.println("<th>Homologado</th>");
		salida.println("<th>Foto</th>");
		salida.println("</tr>");
		salida.println("</thead>");
		salida.println("<tr>");
		salida.println("<td>" + this.dao.getInscritos().size() + "</td>");
		salida.println("<td>" + nombre + "</td>");
		salida.println("<td>" + fecha_Nacimiento + "</td>");
		salida.println("<td>" + edad + "</td>");
		salida.println("<td>" + colegio + "</td>");
		salida.println("<td>" + carrera + "</td>");
		salida.println("<td>" + precio + "</td>");
		salida.println("<td>" + estrato + "</td>");
		salida.println("<td>" + homologado + "</td>");
		salida.println("<td>" + "<img src=\" " + foto + "\" alt=\"Foto de la persona\" width=\"150\" height=\"200\">" + "</td>");
		salida.println("<br>");
		salida.println("<div/");
		salida.println("<div class=\"text-center\">");
		salida.println(
				"<a href=\"index.jsp\"><button type=\"button\" class=\"btn btn-outline-primary d-inline-block\">Volver</button></a>");
		salida.println("<div/");
		salida.println("</body>");
		salida.println("</html>");
		salida.close();
		this.fh.writefile(this.fh.getListado());
	}

}
