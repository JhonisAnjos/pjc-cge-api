package dev.jhonis.pjccge.api.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaModel{

	private Long id;
	
	private String nome;
	
	private Date dataNascimento;
	
	private String sexo;
	
	private String nomeMae;
	
	private String nomePai;

	private EnderecoModel endereco;
	
}
