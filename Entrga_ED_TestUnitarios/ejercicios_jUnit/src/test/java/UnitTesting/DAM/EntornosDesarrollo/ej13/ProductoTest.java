package UnitTesting.DAM.EntornosDesarrollo.ej13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testNuevo() {
		Producto p = new Producto("pan", 0.50f, 1);
		assertEquals("pan", p.getNombre());
		assertEquals(0.50f, p.getPrecio(), 0.01);
		assertEquals(1, p.getCantidad());
	}

	@Test
	void testPrecioTotal() {
		Producto prod = new Producto("pan", 0.50f, 2);
		// Expected
		float expected = 1.00f;
		// Actual
		float actual = prod.precioTotal();
		// Assert
		assertEquals(expected, actual, "No coincide");
	}

}
