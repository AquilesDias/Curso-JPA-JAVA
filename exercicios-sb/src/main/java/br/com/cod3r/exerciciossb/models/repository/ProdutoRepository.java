package br.com.cod3r.exerciciossb.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.exerciciossb.models.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

	//Extendíamos o CrudRepository.
	
	public Iterable<Produto> findByNome(String nome);
}
