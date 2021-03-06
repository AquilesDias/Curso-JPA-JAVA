package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
	
	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		Cliente clienteId = dao.obterPorID(2L);
		System.out.println("Cliente: " + clienteId.getNome() + ", Cadeira: " + clienteId.getAssento().getNome());
	    dao.fechar();
	}

}