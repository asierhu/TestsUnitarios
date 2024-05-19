package UnitTesting.DAM.EntornosDesarrollo.ej22;

import java.util.ArrayList;
import java.util.Random;

public class Camioneta implements Transporte {
	private ArrayList<Paquete> paquetes = new ArrayList<>();

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
		return 70 + rand.nextInt(31);
	}

}
