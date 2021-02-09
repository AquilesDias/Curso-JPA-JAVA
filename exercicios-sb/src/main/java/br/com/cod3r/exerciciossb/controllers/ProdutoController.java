package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.entities.Produto;
import br.com.cod3r.exerciciossb.models.repository.ProdutoRepository;

@RestController
@RequestMapping(path = "/api/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
//	@PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Produto> obterProdutoId(@PathVariable int id){
		return produtoRepository.findById(id);
	}
	
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		return produtoRepository.save(produto);
//	}
	
	@DeleteMapping(path="/{id}")
	public void excluirProduto(@PathVariable int id) {
		 produtoRepository.deleteById(id);
	}

}
