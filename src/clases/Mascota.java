package clases;

public class Mascota {
	
	private int id;
	private String nombre;
	private String raza;
	private double precio;
	private TipoMascota tipo;
		
	
	public Mascota(int id, String nombre, String raza, double precio, TipoMascota tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	public Mascota() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public TipoMascota getTipo() {
		return tipo;
	}
	public void setTipo(TipoMascota tipo) {
		this.tipo = tipo;
	}
	
	
	

}
