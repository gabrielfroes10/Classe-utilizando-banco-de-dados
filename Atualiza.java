package ptc2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Atualiza {
	public static void atualizar() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratica-2");
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner(System.in);

		System.out.print("Chassi do carro:");
		Integer cha = sc.nextInt();

		em.getTransaction().begin();

		Veiculo v = em.find(Veiculo.class, cha);

		if (v != null) {
			
			System.out.println("Novo fabricante");
			String novoFabricante = sc.nextLine();
			
			System.out.println("Nova Descrição");
			String novaDescricao = sc.nextLine();

			System.out.println("Nova Versão");
			String novaVersaoSTR = sc.nextLine();

			System.out.println("Novo modelo");

			String novoModelo = sc.nextLine();

			System.out.println("Novo ano");
			String novoAnoSTR = sc.nextLine();

			System.out.println("Nova qtde");
			String novaQtdeSTR = sc.nextLine();

			try {
				int qtde = Integer.parseInt(novaQtdeSTR);
				
				
				v.setFabricante(novoFabricante);
				v.setDescricao(novaDescricao);
				v.setVersao(novaVersaoSTR);
				v.setModelo(novoModelo);
				v.setAno(novoAnoSTR);
				v.setQtde(qtde);
				
				em.merge(v);
				em.getTransaction().commit();
				System.out.println("Atualizado!");
			} catch (NumberFormatException e) {
				System.out.println("Chassi inválido");
			}
		} else {
			System.out.println("Veiculo não encontrado!!");
		}

	}

}
