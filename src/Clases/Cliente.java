package Clases;

public class Cliente extends Usuario {
	private String formaPago;

	
		
		// TODO Auto-generated constructor stub
	public Cliente(String nombreAcceso, String pass, String numeroDNI, int idusuario,String formaPago) {
		super(nombreAcceso, pass, numeroDNI, idusuario);
		this.formaPago=formaPago;
		
		// TODO Auto-generated constructor stub
	}
	
	public Cliente() {
		
	}
	

	public String getFormaPago() {
		return formaPago;
	}

	
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	

}
