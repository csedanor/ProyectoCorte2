package co.edu.unbosque.model;

public class InscripcionDTO {
	
	private String nombre;
	private String fecha;
	private String edad;
	private String colegio;
	private String carrera;
	private String precio;
	private String estrato;
	private String homologado;
	private String foto;
	private String nuevaCarrera;
	
	public InscripcionDTO() {
		super();
	}
	public InscripcionDTO(String nombre, String fecha, String edad, String colegio, String carrera, String precio,
			String estrato, String homologado, String foto) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.edad = edad;
		this.colegio = colegio;
		this.carrera = carrera;
		this.precio = precio;
		this.estrato = estrato;
		this.homologado = homologado;
		this.foto = foto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getColegio() {
		return colegio;
	}
	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getEstrato() {
		return estrato;
	}
	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}
	public String getHomologado() {
		return homologado;
	}
	public void setHomologado(String homologado) {
		this.homologado = homologado;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	@Override	
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("<table class=\"table table-bordered\">");
	    sb.append("<tr><th>Nombre:</th><td>").append(this.nombre).append("</td></tr>");
	    sb.append("<tr><th>Fecha de Nacimiento:</th><td>").append(this.fecha).append("</td></tr>");
	    sb.append("<tr><th>Edad:</th><td>").append(this.edad).append("</td></tr>");
	    sb.append("<tr><th>Colegio graduación:</th><td>").append(this.colegio).append("</td></tr>");
	    sb.append("<tr><th>Carrera aspira:</th><td>").append(this.carrera).append("</td></tr>");
	    sb.append("<tr><th>Precio carrera:</th><td>").append(this.precio).append("</td></tr>");
	    sb.append("<tr><th>Estrato:</th><td>").append(this.estrato).append("</td></tr>");
	    sb.append("<tr><th>Homologado:</th><td>").append(this.homologado).append("</td></tr>");
	    sb.append("<tr><th>Foto:</th><td>").append(this.foto).append("</td></tr>");
	    sb.append("</table>");
	    return sb.toString();
	}
	public String getNuevaCarrera() {
		return nuevaCarrera;
	}
	public void setNuevaCarrera(String nuevaCarrera) {
		this.nuevaCarrera = nuevaCarrera;
	}

}
