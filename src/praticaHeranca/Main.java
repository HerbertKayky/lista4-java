package praticaHeranca;

public class Main {
	
	public static void main(String[] args) {

	Secretaria secretaria = new Secretaria("Herbert", 1550, "12358105");
	Gerente gerente = new Gerente("Kayky", 2000, "OLP2451", "password1234");
	Telefonista telefonista = new Telefonista("Ana", 1700, "RECP01");
	
	System.out.println("SECRETARIA: ");
	System.out.println(secretaria.getNome() + "\n" + secretaria.getSalario() + "\n" + secretaria.getNumeroRamal());
	
	System.out.println("\n");
	System.out.println("GERENTE: ");
	System.out.println(gerente.getNome() + "\n" + gerente.getSalario() + "\n" + gerente.getLogin() + "\n" + gerente.getSenha());
	
	System.out.println("\n");
	System.out.println("TELEFONISTA: ");
	System.out.println(telefonista.getNome() + "\n" + telefonista.getSalario() + "\n" + telefonista.getCodigo());
}
}