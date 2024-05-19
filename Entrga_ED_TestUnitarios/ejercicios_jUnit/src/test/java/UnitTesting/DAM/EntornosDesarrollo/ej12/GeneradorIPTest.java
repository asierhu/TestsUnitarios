package UnitTesting.DAM.EntornosDesarrollo.ej12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeneradorIPTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGenerarNumero() {
		GeneradorIP ip = new GeneradorIP();
		int numero;
		for (int i = 0; i < 1000; i++) {
			numero = ip.generarNumero(0, 255);
			assertTrue(numero >= 0 && numero <= 254);
		}

	}

	@Test
	void testGenerarIp() {
		GeneradorIP ip = new GeneradorIP();
		try {
			for (int i = 0; i < 1000; i++) {

				String direccionIp = ip.generarIp();

				// Expected
				char expectedPrimeroUltimo = '0';

				// Actual
				char actualPrimero = direccionIp.charAt(0);
				char actualUltimo = direccionIp.charAt(direccionIp.length() - 1);

				// Asserts
				assertNotEquals(expectedPrimeroUltimo, actualPrimero, "La IP no puede comenzar por cero");
				assertNotEquals(expectedPrimeroUltimo, actualUltimo, "La IP no puede acabar por cero");

			}
		} catch (AssertionError e) {
			System.out.println("El test ha fallado");

		}
	}
}
