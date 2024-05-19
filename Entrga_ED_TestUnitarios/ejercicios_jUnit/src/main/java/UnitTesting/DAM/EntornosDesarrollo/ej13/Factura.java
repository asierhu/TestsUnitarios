package UnitTesting.DAM.EntornosDesarrollo.ej13;

import java.util.ArrayList;

public class Factura {
	public ArrayList<Producto> vector = new ArrayList<Producto>();

	public void meterProducto(Producto producto) {
		vector.add(producto);
	}

	public float totalFactura() {
		float total = 0;
		for (Producto producto : vector) {
			total += producto.precio;
		}
		return total;
	}

	public float aplicarIva(float iva) {
		return totalFactura() * (1 + iva);
	}

}
