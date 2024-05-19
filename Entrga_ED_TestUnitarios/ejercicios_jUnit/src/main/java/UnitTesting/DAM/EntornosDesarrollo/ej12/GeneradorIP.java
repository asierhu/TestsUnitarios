package UnitTesting.DAM.EntornosDesarrollo.ej12;

import java.util.Random;

public class GeneradorIP {
	public int generarNumero(int min, int max) {
		Random rdn = new Random();
		return min + rdn.nextInt(max - min);

	}

	public String generarIp() {
		return generarNumero(1, 255) + "." + generarNumero(0, 255) + "." + generarNumero(0, 255) + "."
				+ generarNumero(1, 255);
	}

}
