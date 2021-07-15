package aula5;

import java.util.ArrayList;






public class PessoaCadastro {
		ArrayList <Pessoa> pessoa = new ArrayList();
		
		
		
		public void cadastroPessoa( String nome,String end, int telefone) {
			pessoa.add(new Pessoa(nome ,end, telefone));
		}
		
		public String consultaPessoa(String nome) {
			for(Pessoa p: pessoa) {
				if(p.getNome().equals(nome)) {
				return p.toString();
			}
		}
		return "Cliente não encontrado";
	    }
		
		public String toStringPessoa() {
			String cliente = "";
			for(Pessoa p : pessoa) {
				cliente += p.toString() + "\n";
			}
			return cliente;
		}
		
		
		public void removePessoa( String nome) {
			Pessoa pe = null;
			for(Pessoa p : pessoa) {
			if(p.getNome().equals(nome)) {
			pe = p;
			}
		}
			if(pe != null) {
			pessoa.remove(pe);
			}
		}

		
	

}
