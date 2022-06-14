package dev.jhonis.pjccge.api.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnidadeInput{
	
	private String nome;
	
	private String sigla;

	private EnderecoInput endereco;
}
