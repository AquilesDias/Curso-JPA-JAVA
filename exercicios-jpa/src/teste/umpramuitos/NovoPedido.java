package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Notebook DELL", 3458.89);
		ItemPedido item = new ItemPedido(2, pedido, produto);
		
		dao.abrirT()
		   .incluir(produto)
		   .incluir(pedido)
		   .incluir(item)
	       .fecharT()
	       .fechar();
	}
}
