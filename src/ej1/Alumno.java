package ej1;

public class Alumno {
	
	private String nombre="";
	
	private int notaMedia=0;

	
	
	
	
	
	
	
	public Alumno() {
	}

	public Alumno(String nombre, int notaMedia) {
		//ELENA TE PIDE QUE NO DEJES EL SUPER PORQUE HACE REFERENCIA A LA SUPERCLASE QUE ES ALGO QUE SE VA A DAR
		//super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}
	
	
	
	
	
	
	
	
}
