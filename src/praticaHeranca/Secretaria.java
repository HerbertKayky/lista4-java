package praticaHeranca;

public class Secretaria extends Funcionario {
	
	private String numeroRamal;
	
	public String getNumeroRamal() {
		return numeroRamal;
	}
	public void setNumeroRamal(String numeroRamal) {
		this.numeroRamal = numeroRamal;
	}
	public Secretaria(String nome, int salario, String numeroRamal) {
		super(nome, salario);
		this.numeroRamal = numeroRamal;
	}
}
