package co.edu.unbosque.model;

import java.util.ArrayList;

public interface InscripcionDAO {

	public void crearInscripcion(String nombre, String fecha, String edad, String colegio, String carrera,
			String precio, String estrato, String homologado, String foto);

	public ArrayList<InscripcionDTO> listar();

	public boolean actualizarCarrera(String nombre, String carrera);

	public void eliminarInscripcion(int id);
	
	public ArrayList<InscripcionDTO> listarPorCarrera(String carrera);

}
