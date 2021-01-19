package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Gabinete Gamer", 450.54);
		
		DAO<Produto> dao = new DAO<>(Produto.class);

		dao.incluirAtomico(produto).fechar();
		//dao.abrirT().incluir(produto).fecharT().fechar();
		
		System.out.println("ID do produto: " +produto.getId());
		
	}
	
	
	
}
