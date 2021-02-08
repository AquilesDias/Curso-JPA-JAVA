package br.com.cod3r.exerciciossb.models.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cod3r.exerciciossb.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
