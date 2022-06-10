package dev.jhonis.pjccge.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoModel{

	private Long id;

	private String tipoLogradouro;
	
	private String logradouro;
	
	private Integer numero;
	
	private String bairro;

	private CidadeModel cidade;
	
}
