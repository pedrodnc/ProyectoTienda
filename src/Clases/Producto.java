package Clases;

public abstract class Producto {
	
	private String nombre;//Nombre del producto
	private int precio;//Precio del producto
	private int idProducto;//ID del procucto
	private int nStock;//Cantidad que queda en stock del producto
	
	
	public Producto(String nombre, int precio, int idProducto, int nStock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.idProducto = idProducto;
		this.nStock = nStock;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public int getnStock() {
		return nStock;
	}


	public void setnStock(int nStock) {
		this.nStock = nStock;
	}
	
	
	
	

	
}
