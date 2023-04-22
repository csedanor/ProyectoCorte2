package co.edu.unbosque.controller;

import java.io.IOException;
import java.io.PrintWriter;
import co.edu.unbosque.model.InscripcionDAO;
import co.edu.unbosque.model.InscripcionDAOImpl;
import co.edu.unbosque.model.persistence.FileHandler;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ActualizarServlet")
public class ActualizarServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private InscripcionDAOImpl dao;
	private FileHandler fh;

	public ActualizarServlet() {
		this.dao = new InscripcionDAOImpl();
		this.fh = new FileHandler();
		this.dao.setInscritos(this.fh.readfile());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nombre = req.getParameter("nombre");
		String nuevaCarrera = req.getParameter("nuevaCarrera");
		
		InscripcionDAO dao = new InscripcionDAOImpl();
		boolean resultado = dao.actualizarCarrera(nombre, nuevaCarrera);
		
		PrintWriter salida = resp.getWriter();
		
		if(resultado) {
			salida.println("<html>");
			salida.println("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
			salida.println("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>");
			salida.println("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>");
			salida.println("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>");
			salida.println("<head>");
			salida.println("<title> Actualizado exitosamente </title>");
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
			salida.println("<h4 class=\"text-center\" \"p-3 mb-2 bg-success text-white\"> Insripcion completada con exito </h4>");
			salida.println("<br>");
			salida.println("<div class=\"text-center\">");
			salida.println("La persona " + nombre + "ahora esta interesada en" + nuevaCarrera);
			salida.println("<div/");
			salida.println("<div class=\"text-center\">");
			salida.println("<a href=\"index.jsp\"><button type=\"button\" class=\"btn btn-outline-primary d-inline-block\">Volver</button></a>");
			salida.println("<div/");
			salida.println("</body>");
			salida.println("</html>");
			salida.close();
		} else {
			salida.println("<html>");
			salida.println("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
			salida.println("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>");
			salida.println("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>");
			salida.println("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>");
			salida.println("<head>");
			salida.println("<title> Error al actualizar </title>");
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
			salida.println("<h4 class=\"text-center\" \"p-3 mb-2 bg-success text-white\"> Insripcion completada con exito </h4>");
			salida.println("<br>");
			salida.println("<div class=\"text-center\">");
			salida.println("La persona " + nombre + "no existe entonces no se pudo actualizar");
			salida.println("<div/");
			salida.println("<div class=\"text-center\">");
			salida.println("<a href=\"index.jsp\"><button type=\"button\" class=\"btn btn-outline-primary d-inline-block\">Volver</button></a>");
			salida.println("<div/");
			salida.println("</body>");
			salida.println("</html>");
			salida.close();
		}
		RequestDispatcher rd = req.getRequestDispatcher("actualizar.jsp");
		
	}

}