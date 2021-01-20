package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento ("F4");
		Cliente cliente = new Cliente("Marcela", assento);
		
		DAO<Cliente> dao = new DAO<>();
		dao.incluirAtomico(cliente);
	}

}
