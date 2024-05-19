package UnitTesting.DAM.EntornosDesarrollo.ej22;

public class Paquete {
	String destino;
	float peso;

	public Paquete(String destino, float peso) {
		this.destino = destino;
		this.peso = peso;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String ToString() {
		return "Destino: " + this.destino + "Peso: " + this.peso;
	}

}
