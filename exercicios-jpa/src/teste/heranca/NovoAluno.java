package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {
	
	public static void main(String[] args) {
		
		
		DAO<Aluno> dao = new DAO<>();
		
		Aluno aluno1 = new Aluno(2017L, "Mariazinha");
		AlunoBolsista aluno2 = new AlunoBolsista(201878L, "Joaozin", 458);
		
		dao.incluirAtomico(aluno1);
		dao.incluirAtomico(aluno2);
		
		dao.fechar();
		
		
	}

}
