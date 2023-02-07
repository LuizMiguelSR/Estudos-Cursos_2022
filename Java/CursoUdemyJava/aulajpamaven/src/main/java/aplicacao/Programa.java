package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		

		 //Buscar no Banco de Dados com id3
		 Pessoa p = em.find(Pessoa.class, 3);
		 System.out.println(p);
		
		/*
		 * Salvar no Banco de Dados
		 * 
		 * em.getTransaction().begin();
		 * em.persist(p1);
		 * em.persist(p2);
		 * em.persist(p3);
		 * em.getTransaction().commit();
		*/
		
		/* 
		 * Apagar do Banco de Dados com id 2
		 * Precisa fazer a busca antes de apagar
		 * Precisa fazer a transação antes de apagar
		 * 
		 * Pessoa p = em.find(Pessoa.class, 2);
		 * em.getTransaction().begin();
		 * em.remove(p);
		 * em.getTransaction().commit();
		*/
		
		
		System.out.println("Pronto!");
		em.close();
		emf.close();

	}

}
