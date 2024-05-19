package UnitTesting.DAM.EntornosDesarrollo.ej13;

public class Producto {
	String nombre;
	float precio;
	int cantidad;

	public Producto() {

	}

	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float precioTotal() {
		float total = this.cantidad * this.precio;
		return total;
	}

	public String ToString() {
		return "Producto: " + this.nombre + this.precio + "€, Cantidad: " + this.cantidad + "\n";
	}

}
