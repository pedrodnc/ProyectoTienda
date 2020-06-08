package Clases;

public abstract class Usuario {
	
	private String nombre;// Nombre de cada objeto persona    
    private String pass;// Contraseña de cada objeto persona
    private String numeroDNI;// DNI de cada objeto persona
    private int idusuario;
   
    
    
    
	public Usuario(String nombreAcceso, String pass, String numeroDNI, int idusuario) {
		super();
		this.nombre = nombreAcceso;
		this.pass = pass;
		this.numeroDNI = numeroDNI;
		this.idusuario=idusuario;
		
	}
	public Usuario() {
		
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", pass=" + pass + ", numeroDNI=" + numeroDNI + ", idusuario=" + idusuario
				+ "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass (String pass)throws logitud_pass_erronea_exception {
		if(this.pass.length()<8) {
			throw new logitud_pass_erronea_exception("La contraseña debe que tener al menos 8 caracteres");
		}else {
		this.pass = pass;
		}
	}
	public String getNumeroDNI() {
		return numeroDNI;
	}
	public void setNumeroDNI(String numeroDNI) {
		this.numeroDNI = numeroDNI;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
}	