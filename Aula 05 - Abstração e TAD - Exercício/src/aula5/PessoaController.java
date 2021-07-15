package aula5;

import java.util.Scanner;

public class PessoaController {
	private PessoaCadastro cadastro;
	
	public PessoaController () {
	     cadastro = new PessoaCadastro();
	}

	public void menu() {
		Scanner tec = new Scanner(System.in);
		int op ;
		do {
			System.out.println("|-------------------------------------------------------|");
			System.out.println("|----------------- Questão 1 ED ------------------------|");
			System.out.println("|-------------------------------------------------------|");
			System.out.println("| [1] Cadastrar Pessoa                                  |");
			System.out.println("| [2] pesquisar Pessoa                                  |");
			System.out.println("| [3] listar    pessoa                                  |");
			System.out.println("| [4] Exclui Pessoa                                     |");
			System.out.println("| [0] Sair                                              |");
			System.out.println("|-------------------------------------------------------|");
			System.out.println("| Digite o numero desejado:                             |");
			op = tec.nextInt();
			System.out.println("|-------------------------------------------------------|");

			switch (op) {
			case 1:
				cadastroPessoa();
				break;
			case 2:
				pesquisaPessoa();
				break;
			case 3:
				listaPessoa();
				break;				
			case 4:
				excluiPessoa();
				break;			
			default:
				System.out.println("Valor invalido!!!!");
				break;
			}
		} while (op != 0);
	}
	
	public void cadastroPessoa() {
		String nome;
		String end;
		int telefone;
		int op;
		Scanner tec = new Scanner(System.in);

		do {
			System.out.println("|------------------ CADASTRO PESSOA -------------------|");
			System.out.println("|-------------------------------------------------------|");
			System.out.println("| Digite o nome:");
			nome = tec.nextLine();
			System.out.println("| Digite o endereço:");
			end = tec.nextLine();
			System.out.println("| Digite o telefone:");
			telefone = tec.nextInt();
			cadastro.cadastroPessoa(nome, end, telefone);
			System.out.println("|-------------------------------------------------------|");
			System.out.println("|           Cadastro realizado com sucesso              |");
			System.out.println("|-------------------------------------------------------|");
			System.out.println(cadastro.consultaPessoa(nome));
			System.out.println("|-------------------------------------------------------|");
			System.out.println("|        Digite 1 para continuar ou 0 para sair         |");
			op = tec.nextInt();
			tec.nextLine();
		} while (op == 1);
		if (op == 0) {
			menu();
		}

	}
	
	public void pesquisaPessoa() {
		Scanner tec = new Scanner(System.in);
		int op;
		String nome;
		int cnh;
		do {
		System.out.println("|------------------- PESQUISA CLIENTE ------------------|");
		System.out.println("|-------------------------------------------------------|");
		System.out.println("| [1] para pesquisar por Nome ");
		System.out.println("| [0] para sair");
		System.out.println("| Digite a opcao desejada\n");
		op = tec.nextInt();
		tec.nextLine();
		switch (op) {
		case 1:
			System.out.println("| Digite o nome: ");
			nome = tec.nextLine();
			System.out.println(cadastro.consultaPessoa(nome));
			break;
		default:
			System.out.println(" Digite um numero valido");
			break;
		}
		}while (op != 0);
		if (op == 0) {
			menu();
		}
		
	}
	
	public void listaPessoa() {
		System.out.println(cadastro.toStringPessoa());
	}
	
	public void excluiPessoa() {
		Scanner tec = new Scanner(System.in);
		int op;
		String nome;
		int cnh;
		do {
		System.out.println("|------------------- EXCLUIR CLIENTE ------------------|");
		System.out.println("|-------------------------------------------------------|");
		System.out.println("| [1] para excluir digite o nome desejado");
		System.out.println("| [0] para sair");
		System.out.println("| Digite a opcao desejada\n");
		op = tec.nextInt();
		tec.nextLine();
		switch (op) {
		case 1:
			System.out.println("| Digite o nome: ");
			nome = tec.nextLine();
			cadastro.removePessoa(nome);
			break;
		default:
			System.out.println(" Digite um numero valido");
			break;
		}
		}while (op != 0);
		if (op == 0) {
			menu();
		}
	}
}
	
	



