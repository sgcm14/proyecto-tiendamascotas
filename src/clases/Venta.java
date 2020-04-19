package clases;

import java.util.Date;

public class Venta {
	
	private int id;
	private Date fecha;
	private Mascota mascota;
	private double total;
	private int cantidad;
	
	public Venta(int id, Date fecha, Mascota mascota, double total, int cantidad) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.mascota = mascota;
		this.total = total;
		this.cantidad = cantidad;
	}
	
	public Venta() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
