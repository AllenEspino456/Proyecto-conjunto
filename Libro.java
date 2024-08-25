package Biblioteca;

public class Libro {

	private int codigo = 0000;
	private String nombre = "";
	private String categoria = "";
	private Autor autor; 
	private int añopublic = 0000; 
	private String edicion = "";
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getAñopublic() {
		return añopublic;
	}
	public void setAñopublic(int añopublic) {
		this.añopublic = añopublic;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	
	

}
