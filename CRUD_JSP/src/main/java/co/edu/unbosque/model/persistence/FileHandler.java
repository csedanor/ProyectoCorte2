package co.edu.unbosque.model.persistence;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

import co.edu.unbosque.model.InscripcionDTO;

public class FileHandler {
	private ObjectInputStream input;
	private ObjectOutputStream output;
	private PrintWriter pw;
	private FileReader fr;
	private BufferedWriter bw;
	private BufferedReader br;
	private File f;
	String username = System.getProperty("user.name");

	private ArrayList<InscripcionDTO> listadoInscritos;
	
	String path = (System.getProperty("user.dir") + "/src/main/java/co/edu/unbosque/model/persistence/us.txt");
	
	public FileHandler() {
		this.listadoInscritos = new ArrayList<>();
		this.f = new File(path);
	}
	
	public void writefile(ArrayList<InscripcionDTO> inscritos) {
		try {
			this.pw = new PrintWriter(f, "UTF-8");
			for (int i = 0; i < inscritos.size(); i++) {
				String a = inscritos.get(i).getNombre() + ";" + inscritos.get(i).getFecha() + ";"
						+ inscritos.get(i).getEdad() + ";" + inscritos.get(i).getColegio() + ";"
						+ inscritos.get(i).getCarrera() + ";" + inscritos.get(i).getPrecio() + ";"
						+ inscritos.get(i).getEstrato() + ";" + inscritos.get(i).getHomologado() + ";"
						+ inscritos.get(i).getFoto() + ".";
				this.pw.println(a);
			}
			this.pw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public void deletefile(ArrayList<InscripcionDTO> inscritos, int id) {
		try {
			this.pw = new PrintWriter(f, "UTF-8");
			for (int i = 0; i < inscritos.size(); i++) {
				if(i == id) {
					inscritos.remove(i);
				}
			}
			this.pw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<InscripcionDTO> readfile() {
		String texto = "";
		String completo = "";
		try {
			this.fr = new FileReader(path);
			this.br = new BufferedReader(fr);
			while((texto = br.readLine())!=null) {
				completo= completo+texto+"%";
			}
			System.out.println(completo);
			String separarEspacios[] = completo.split("%");
			System.out.println(separarEspacios[0]);
			for(int i = 0;i<separarEspacios.length;i++) {
				String agregar[] = separarEspacios[i].split(";");
				InscripcionDTO dto = new InscripcionDTO(agregar[0], agregar[1], agregar[2], agregar[3], agregar[4], agregar[5], agregar[6], agregar[7], agregar[8]);
				this.listadoInscritos.add(dto);
			}
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return this.listadoInscritos;
	}
	
	public PrintWriter getPW() {
		return pw;
	}
	public void setPW(PrintWriter pw) {
		this.pw = pw;
	}
	public ArrayList<InscripcionDTO> getListado() {
		return listadoInscritos;
	}
	public void setListado(ArrayList<InscripcionDTO> listado) {
		this.listadoInscritos = listado;
	}
	
	public void eliminarRegistro(String registroAEliminar) {
	    try {
	        FileReader fr = new FileReader(f);
	        BufferedReader br = new BufferedReader(fr);
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = br.readLine()) != null) {
	            if (!line.equals(registroAEliminar)) { // Omitir la l�nea que deseas eliminar
	                sb.append(line);
	                sb.append(System.lineSeparator());
	            }
	        }
	        fr.close();
	        br.close();
	        
	        // Escribir el archivo actualizado
	        FileWriter fw = new FileWriter(f.getAbsoluteFile());
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(sb.toString());
	        bw.close();
	        fw.close();
	        
	        System.out.println("Registro eliminado exitosamente.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}


}