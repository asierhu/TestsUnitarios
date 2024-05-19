package UnitTesting.DAM.EntornosDesarrollo.ej22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransporteTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testPesoTotal() {
		Camioneta camioneta = new Camioneta();
		Paquete paquete = new Paquete("paq", 1.25f);
		camioneta.incluirPaquete(paquete);
		
		// Expected
		float expected = 1.25f;
		
		// Actual
		float actual = camioneta.pesoTotal();
		
		// Assert
		assertEquals(expected, actual, "Error, no coindicen las cantidades");
	}

	@Test
	public void testRecorrerDistancia() {
		Camioneta camioneta = new Camioneta();

		// Expected
		int distanciaMin = 70;
		int distandiaMax = 100;
		
		// Actual
		int distancia = camioneta.recorrerDistancia();
		
		// Assert
		assertTrue(distancia >= distanciaMin && distancia <= distandiaMax,
				"Error, la distancia no está entre 0 y 100 kilometros");
	}

}