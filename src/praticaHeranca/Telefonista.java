package praticaHeranca;

public class Telefonista extends Funcionario {
	
	private String codigo;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Telefonista(String nome, int salario, String codigo) {
		super(nome, salario);
		this.codigo = codigo;
	}
}
