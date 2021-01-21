package teste;

import java.util.List;

import infra.DAO;
import modelo.muitospramuitos.Filme;

public class Consulta {

	public static void main(String[] args) {
	
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		List<Filme> filmes = dao.consultar("obterFilmesNotaMaior", "nota", 100.00);
		
		for(Filme filme : filmes) {
	         System.out.println(filme.getNome());
		}
	}
}
