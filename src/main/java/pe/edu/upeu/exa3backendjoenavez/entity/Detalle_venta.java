package pe.edu.upeu.exa3backendjoenavez.entity;

public class Detalle_venta {
	private int iddetalle;
	private int idventa;
	private int idproducto;
	private String nomprod;
	private float precio;
	private int cantidad;
	public Detalle_venta() {
		
	}
	public Detalle_venta(int iddetalle, int idventa, int idproducto, String nomprod, float precio, int cantidad) {
		
		this.iddetalle = iddetalle;
		this.idventa = idventa;
		this.idproducto = idproducto;
		this.nomprod = nomprod;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getIddetalle() {
		return iddetalle;
	}
	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNomprod() {
		return nomprod;
	}
	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
