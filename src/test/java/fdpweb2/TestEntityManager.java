package fdpweb2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fabricaprogramador.entidade.Usuario;

public class TestEntityManager {

	public static void main(String[] args) {
		
		//criação de EntityManager Factory
		//Aqui criamos o banco
		//DDL
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("javaweb2");
		
		//insert, update, delete, select
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario();
		usuario.setNome("Jão");
		usuario.setLogin("jj");
		usuario.setSenha("123");
		
		//abrir uma transação
		em.getTransaction().begin();
		//gera o SQL insert into...
		em.persist(usuario);
		//Executa a transação
		em.getTransaction().commit();
		//encerra a transação
		em.close();
		
		
	}

}
