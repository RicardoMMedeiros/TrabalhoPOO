package trabalho_POO;

public class Dolar extends Moeda{

	public Dolar(double valorInserido) {
		this.valor = valorInserido;
	}
	
	public void info() {
		System.out.println("Dolar - " + valor);	
	}

	public double converter() {
		return this.valor * 5.34;
	}

}
