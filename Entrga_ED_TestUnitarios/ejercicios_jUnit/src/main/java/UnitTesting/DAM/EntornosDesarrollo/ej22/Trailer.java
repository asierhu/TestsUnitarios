package UnitTesting.DAM.EntornosDesarrollo.ej22;

import java.util.Random;
import java.util.Vector;

public class Trailer implements Transporte {
	private Vector<Paquete> paquetes = new Vector<>();

	public void incluirPaquete(Paquete paquete) {
		paquetes.add(paquete);
	}

	public float pesoTotal() {
		float total = 0;
		for (Paquete paquete : paquetes) {
			total += paquete.getPeso();
		}
		return total;
	}

	public int recorrerDistancia() {
		Random rand = new Random();
		return 270 + rand.nextInt(31);
	}
}
