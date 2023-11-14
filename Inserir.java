package ptc2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inserir {
	public static void inserir() {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratica-2");
	        EntityManager em = emf.createEntityManager();
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Informe os dados do novo veículo:");

	        System.out.print("Chassi: ");
	        int chassi = sc.nextInt();
	        sc.nextLine(); 

	        System.out.print("Fabricante: ");
	        String fabricante = sc.nextLine();

	        System.out.print("Descrição: ");
	        String descricao = sc.nextLine();

	        System.out.print("Versão: ");
	        String versao = sc.nextLine();

	        System.out.print("Modelo: ");
	        String modelo = sc.nextLine();

	        System.out.print("Ano: ");
	        String ano = sc.nextLine();

	        System.out.print("Quantidade: ");
	        int qtde = sc.nextInt();

	        Veiculo v1 = new Veiculo(chassi, fabricante, descricao, versao, modelo, ano, qtde);

	        em.getTransaction().begin();
	        em.persist(v1);
	        em.getTransaction().commit();

	        System.out.println("Veículo adcionado");

	        em.close();
	        emf.close();
	    }

}
