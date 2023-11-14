package ptc2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Delete {
	public static void deletar() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratica-2");
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o chassi do veículo a ser deletado: ");
		int chassi = sc.nextInt();

		Veiculo veiculo = em.find(Veiculo.class, chassi);

		if (veiculo != null) {
			System.out.println("Informações do Veículo:");
			System.out.println(veiculo);

			System.out.print("Deseja realmente deletar este veículo? (Digite 'S' para confirmar): ");
			String confirmacao = sc.next();

			if (confirmacao.equalsIgnoreCase("S")) {
				em.getTransaction().begin();
				em.remove(veiculo);
				em.getTransaction().commit();
				System.out.println("Veículo removido!");
			} else {
				System.out.println("Cancelado.");
			}
		} else {
			System.out.println("Veículo não encontrado.");
		}

		em.close();
		emf.close();
	}
	}
	
	
	

