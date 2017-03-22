package repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Produto;

public class RepositorioProduto {
	EntityManagerFactory emf;
	EntityManager em;	
	
	
	public RepositorioProduto() {
		emf = Persistence.createEntityManagerFactory("felipe");
		em = emf.createEntityManager();
	}
	
	public Produto obterPorId(int id) {
		em.getTransaction().begin();
		Produto produto = em.find(Produto.class,id);
		em.getTransaction().commit();
		emf.close();
		return produto;
	}
	
	public void salvar(Produto prod) {
		em.getTransaction().begin();
		em.merge(prod);
		em.getTransaction().commit();
		emf.close();
	}
	public void remover(Produto prod){
		em.getTransaction().begin();
		em.remove(prod);
		em.getTransaction().commit();
		emf.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select produto from Produto produto");
		List<Produto> produtos = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return produtos;
	}
 }
