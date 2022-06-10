package dev.jhonis.pjccge.api.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoInput{

	private String tipoLogradouro;
	
	private String logradouro;
	
	private Integer numero;
	
	private String bairro;

	private Long cidadeId;
	
}
