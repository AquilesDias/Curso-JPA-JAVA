package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	
	private String complemento;
	private String logradouro;
	
	
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	

}
