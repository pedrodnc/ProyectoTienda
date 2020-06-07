package Clases;

public class Cliente extends Usuario {
	private String formaPago;

	public Cliente(String nombreAcceso, String pass, String numeroDNI, String formaPago) {
		super(nombreAcceso, pass, numeroDNI);
		this.formaPago=formaPago;
		
		// TODO Auto-generated constructor stub
	}
	public Cliente() {
		
	}
	

	public String getFormaPago() {
		return formaPago;
	}

	public Cliente(String nombreAcceso, String pass, String numeroDNI) {
		super(nombreAcceso, pass, numeroDNI);
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	

}
