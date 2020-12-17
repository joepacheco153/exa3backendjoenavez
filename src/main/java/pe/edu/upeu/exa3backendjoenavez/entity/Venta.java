package pe.edu.upeu.exa3backendjoenavez.entity;

public class Venta {
	private int idventa;
	private String fecha;
	private String tipodoc;
	private String numdoc;
	private String idpersona;
	private String idusuario;
	public Venta() {
		
	}
	public Venta(int idventa, String fecha, String tipodoc, String numdoc, String idpersona, String idusuario) {
		
		this.idventa = idventa;
		this.fecha = fecha;
		this.tipodoc = tipodoc;
		this.numdoc = numdoc;
		this.idpersona = idpersona;
		this.idusuario = idusuario;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipodoc() {
		return tipodoc;
	}
	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}
	public String getNumdoc() {
		return numdoc;
	}
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
	public String getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}
	public String getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}
	
	
}
