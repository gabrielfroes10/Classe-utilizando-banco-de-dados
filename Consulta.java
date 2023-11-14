package ptc2;

import java.util.Scanner;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Consulta {
	public static void consultar() {
		
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratica-2");
	        EntityManager em = emf.createEntityManager();
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Informe o chassi do veículo a ser consultado: ");
	        int chassi = sc.nextInt();

	        Veiculo veiculo = em.find(Veiculo.class, chassi);

	        if (veiculo != null) {
	            System.out.println("Informações do Veículo:");
	            System.out.println(veiculo);
	        } else {
	            System.out.println("Veículo não encontrado.");
	        }

	        em.close();
	        emf.close();
	    }

}
