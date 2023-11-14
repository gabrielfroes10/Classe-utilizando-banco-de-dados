package ptc2;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Escolha uma opcao :");
			System.out.println("1. Inserir");
			System.out.println("2. Consultar");
			System.out.println("3. Deletar");
			System.out.println("4. Atualizar");
			System.out.println("0. Sair");

			 opcao = sc.nextInt();
			sc.nextLine(); 

			switch (opcao) {
			case 1:
				Inserir.inserir();
				break;
			case 2:
				Consulta.consultar();
				break;
			case 3:
				Delete.deletar();
				break;
			case 4:
				Atualiza.atualizar();
				break;
			case 0:
				System.out.println("Você saiu!");
				break;
			default:
				System.out.println("Opção inválida.");
			}

		} while (opcao != 0);
	}

}
