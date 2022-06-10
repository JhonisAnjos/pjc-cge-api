package dev.jhonis.pjccge.api.model.input;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaInput{

	private Long id;
	
	private String nome;
	
	@DateTimeFormat(iso = ISO.DATE )
	private Date dataNascimento;
	
	private String sexo;
	
	private String nomeMae;
	
	private String nomePai;

	private EnderecoInput endereco;
	
}
