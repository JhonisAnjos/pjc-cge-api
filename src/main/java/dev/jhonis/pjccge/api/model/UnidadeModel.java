package dev.jhonis.pjccge.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnidadeModel{

	private Long id;
	
	private String nome;
	
	private String sigla;

	private EnderecoModel endereco;
}
