package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<D> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<D> classe;
	
	static {
		
		try {
		    emf = Persistence.createEntityManagerFactory("exercicios-jpa"); 
			
		} catch (Exception e) {
			
		}
		
	}
	
	public DAO() {
		this(null);
	}
	 
	public DAO(Class<D> classe){
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<D> abrirT(){
		em.getTransaction().begin();
	    return this;
	}
	
	public DAO<D> fecharT(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<D> incluir(D entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<D> incluirAtomico(D entidade){
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	public D obterPorID(Object id) {
		return em.find(classe, id);
	}
	
	public List<D> obterTodos(){
		return this.obterTodos(10,0);
	}
	
	public List<D> obterTodos(int qtde, int deslocamento){ // Limit, offSet
		
		if(classe == null) {
		   throw new UnsupportedOperationException("Classe nula :( ");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<D> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		return query.getResultList();
		
	}
	
	public List<D> consultar(String nomeConsulta, Object...params){
		TypedQuery<D> query = em.createNamedQuery(nomeConsulta, classe);
		
		for(int i = 0; i< params.length; i +=2 ) {
			query.setParameter(params[i].toString(), params[i +1]);
		}
		return query.getResultList();
	}
	
	
	
	public D consultarUm(String nomeConsulta, Object...params) {
		List<D> lista = consultar(nomeConsulta, params);
		return lista.isEmpty() ? null : lista.get(0);
	}
	
	
	
	public void fechar() { //fechar o DAO
		em.close();
	}
	
}
