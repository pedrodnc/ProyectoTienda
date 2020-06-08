package Clases;

public class error_precio_exception extends RuntimeException {
	public error_precio_exception() {
		
	}
	public error_precio_exception(String msj_error) {
		super(msj_error);
	}

}
