package Clases;

public class Usuario {
	
	private String nombreAcceso;// Nombre de cada objeto persona    
    private String pass;// Contraseña de cada objeto persona
    private String numeroDNI;// DNI de cada objeto persona
    private boolean estado; //Estado del usuario. Conctado/desconectado
    
    
    
	public Usuario(String nombreAcceso, String pass, String numeroDNI) {
		super();
		this.nombreAcceso = nombreAcceso;
		this.pass = pass;
		this.numeroDNI = numeroDNI;
		
	}
	
	
	public String getNombreAcceso() {
		return nombreAcceso;
	}


	public void setNombreAcceso(String nombreAcceso) {
		this.nombreAcceso = nombreAcceso;
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
