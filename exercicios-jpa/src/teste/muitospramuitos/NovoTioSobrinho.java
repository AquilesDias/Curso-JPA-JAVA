package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tio1 = new Tio("Ti lu");
		Tio tia2 = new Tio("Tia le");
		
		Sobrinho sobrinho1 = new Sobrinho("joaozin");
		Sobrinho sobrinha2 = new Sobrinho("Mariazinha");
		
		tio1.getSobrinhos().add(sobrinho1);
		tia2.getSobrinhos().add(sobrinha2);
		
		tio1.getSobrinhos().add(sobrinha2);
		tia2.getSobrinhos().add(sobrinho1);
		
		sobrinho1.getTios().add(tia2);
		sobrinha2.getTios().add(tio1);
		
		sobrinho1.getTios().add(tio1);
		sobrinha2.getTios().add(tia2);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		   .incluir(tio1)
		   .incluir(tia2)
           .incluir(sobrinho1)
           .incluir(sobrinha2)
           .fecharT()
           .fechar();
		
	}
}
