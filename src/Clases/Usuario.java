package Clases;

public abstract class Usuario {
	
	private String nombreUsuario;// Nombre de cada objeto persona    
    private String pass;// Contraseña de cada objeto persona
    private String numeroDNI;// DNI de cada objeto persona
    private boolean estado; //Estado del usuario. Conctado/desconectado
    
    
    
	public Usuario(String nombreAcceso, String pass, String numeroDNI) {
		super();
		this.nombreUsuario = nombreAcceso;
		this.pass = pass;
		this.numeroDNI = numeroDNI;
		
	}
	public Usuario() {
		
	}
	
	public String getNombreAcceso() {
		return nombreUsuario;
	}


	public void setNombreAcceso(String nombreAcceso) {
		this.nombreUsuario = nombreAcceso;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getNumeroDNI() {
		return numeroDNI;
	}


	public void setNumeroDNI(String numeroDNI) {
		this.numeroDNI = numeroDNI;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public void leerBD() {
		
	}
    public void grabarBD() {
    	
    }
   

    
    

}
