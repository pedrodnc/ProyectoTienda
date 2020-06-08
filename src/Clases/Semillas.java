package Clases;

public class Semillas extends Producto {
	
	private String tipoSemilla;
	private int semanasFloracion;
	
	public Semillas(String nombre, int precio, int idProducto, int nStock, String tipoSemilla,int semanasFloracion) {
		super(nombre, precio, idProducto, nStock);
		this.tipoSemilla=tipoSemilla;
		this.semanasFloracion=semanasFloracion;
	}

	public String getTipoSemilla() {
		return tipoSemilla;
	}

	public void setTipoSemilla(String tipoSemilla) {
		this.tipoSemilla = tipoSemilla;
	}

	public int getSemanasFloracion() {
		return semanasFloracion;
	}

	public void setSemanasFloracion(int semanasFloracion) {
		this.semanasFloracion = semanasFloracion;
	}
	

}
