package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		
		Filme filmeA = new Filme("Harry Potter e a camera secreta" ,100.56);
		
		Ator atorA = new Ator("Harry");
		Ator atorB = new Ator("Hermione");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atorB);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		
		}
}
