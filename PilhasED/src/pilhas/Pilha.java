
package pilhas;

import java.util.Scanner;

public class Pilha {
	public Object[] pilha;
	public int posicaoPilha;
	public String sabor;

	public Pilha() {
		this.posicaoPilha = -1;
		// indica que esta nula, vazia, pois posição 
		//  um indica que contém informação
		this.pilha = new Object[50];
		// criando uma pilha com 50 posições
	}

	public boolean pilhaVazia() {
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}

	public int tamanho() {
		if (this.pilhaVazia()) {
			return 0;
		}
		return this.posicaoPilha + 1;
	}

	public Object exibeUltimoValor() {
		if (this.pilhaVazia()) {
			return null;
		}
		return this.pilha[this.posicaoPilha];
	}

	public Object desempilhar() {
		if (pilhaVazia()) {
			return null;
		}
		return this.pilha[this.posicaoPilha--];
	}

	public void empilhar(Object valor) {
		if (this.posicaoPilha < this.pilha.length - 1) {
			this.pilha[++posicaoPilha] = valor;
		}
	}

	public void menu() {
		int op;
		Scanner tec = new Scanner(System.in);
		do {
			System.out.println("|---------------- PIZZARIA GRUPO 6 ED-------------------|");
			System.out.println("|-------------------------------------------------------|");
			System.out.println("| [1] Escolher Sabor da pizza                           |");
			System.out.println("| [2] Listar sabores escolhidos                         |");
			System.out.println("| [3] Entregar pizza                                    |");
			System.out.println("| [0] Sair                                              |");
			System.out.println("| Digite a opção desejada:                              |");
			op = tec.nextInt();
			
			switch (op) {
			case 1:
				escolherSabor();
				break;
			case 2:
				listarSabor();
				break;
			case 3:
				entegar();
				break;
			case 0:
				System.out.println("|----------------------FIM------------------------------|");
				System.exit(op);
				break;
			default:
				System.out.println("Valor invalido!!!!");
				break;
			}
		} while (op != 0);
		
	}

	public void escolherSabor() {
		int op;
		Scanner tec = new Scanner(System.in);
		do {
			System.out.println("|-------------------------------------------------------|");
			System.out.println("| Digite o Sabor de pizza");
			sabor = tec.nextLine();
			System.out.println("| Digite 1 pars escolher outro Sabor de pizza ou 0 para sair");
			op = tec.nextInt();
			tec.nextLine();
			empilhar(sabor);
		} while (op != 0);
	}

	public void listarSabor() {
		for (Object sabor : pilha) {
			if (sabor != null) {
				System.out.println(sabor);
			}
		}
	}

	public void entegar() {
		while (pilhaVazia() == false) {
			System.out.println(desempilhar());
		}
	}

	public static void main(String[] args) {
		Pilha p = new Pilha();
		p.menu();
	}
}
