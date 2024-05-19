package UnitTesting.DAM.EntornosDesarrollo.ej13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTotalFactura() {
		// Expected
		Factura factura = new Factura();
		factura.meterProducto(new Producto("pan", 0.50f, 2));
		factura.meterProducto(new Producto("leche", 1.50f, 1));
		float expected = 2f;
		
		// Inserted
		float inserted = factura.totalFactura();
		
		// Assert
		assertEquals(expected, inserted, "Error, no coindicen los valores");
	}

	@Test
	void testAplicarIva() {
		// Expected
		Factura factura = new Factura();
		factura.meterProducto(new Producto("pan", 0.50f, 2));
		factura.meterProducto(new Producto("leche", 1.50f, 1));
		float expected = 22f;
		
		// Inserted
		float inserted = factura.aplicarIva(10);
		
		// Assert
		assertEquals(expected, inserted, "Error, no coindicen los valores");
	}


}
