package co.edu.unbosque.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


import co.edu.unbosque.model.persistence.FileHandler;

public class InscripcionDAOImpl implements InscripcionDAO {
	
	ArrayList<InscripcionDTO> inscritos = new ArrayList<InscripcionDTO>();
	private FileHandler fileHandler;
	private static final String ARCHIVO_INSCRIPCIONES = "us.txt";
	private File f;

	
	public InscripcionDAOImpl() {
		FileHandler fileHandler = new FileHandler();
	}

	@Override
	public void crearInscripcion(String nombre, String fecha, String edad, String colegio, String carrera,
			String precio, String estrato, String homologado, String foto) {
		inscritos.add(new InscripcionDTO(nombre, fecha, edad, colegio, carrera, precio, estrato, homologado, foto));		
	}
		
	@Override
	public void eliminarInscripcion(int id) {
		// TODO Auto-generated method stub
		inscritos.remove(id);
	}
	
	@Override
	public ArrayList<InscripcionDTO> listar() {
		// TODO Auto-generated method stub
		return inscritos;
	}

	public ArrayList<InscripcionDTO> getInscritos() {
		return inscritos;
	}

	public void setInscritos(ArrayList<InscripcionDTO> inscritos) {
		this.inscritos = inscritos;
	}

	

	@Override
	public boolean actualizarCarrera(String nombre, String nuevaCarrera) {
	    for (int i = 0; i < inscritos.size(); i++) {
	        InscripcionDTO inscripcion = inscritos.get(i);
	        if (inscripcion.getNombre().equals(nombre)) {
	            inscripcion.setCarrera(nuevaCarrera);
	            return true;
	        }
	    }
	    return false; 
	}
	
	public ArrayList<InscripcionDTO> listarPorCarrera(String carrera) {
	    ArrayList<InscripcionDTO> inscripcionesPorCarrera = new ArrayList<>();
	    for (InscripcionDTO inscripcion : inscritos) {
	        if (inscripcion.getCarrera().equals(carrera)) {
	            inscripcionesPorCarrera.add(inscripcion);
	        }
	    }
	    return inscripcionesPorCarrera;
	}

	

}

