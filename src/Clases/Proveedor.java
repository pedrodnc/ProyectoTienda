package Clases;

public class Proveedor extends Cliente {
	
	private String tipoProducto;//Nos dice el tipo de producto que nos vende este proveedor.
	private boolean diario;//Indica si el proveedor efectua envios diarios
	private int cantidad; //Cantidad en kg del rpoducto suminstrado
	
	

	public Proveedor(String nombreAcceso, String pass, String numeroDNI, int idusuario, String formaPago) {
		super(nombreAcceso, pass, numeroDNI, idusuario, formaPago);
		// TODO Auto-generated constructor stub
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public boolean isDiario() {
		return diario;
	}

	public void setDiario(boolean diario) {
		this.diario = diario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

	

}
