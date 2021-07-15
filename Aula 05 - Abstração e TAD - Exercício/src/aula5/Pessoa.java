package aula5;

public class Pessoa {
	private String nome;
	private String end;
	private int telefone;

	public Pessoa(String nome,String end,int telefone) {
		this.nome = nome;
		this.end = end;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "nome: " + nome + ", end: " + end + ", telefone: " + telefone + "";
	}
	
	

}
