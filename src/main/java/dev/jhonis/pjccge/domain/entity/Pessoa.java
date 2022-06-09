package dev.jhonis.pjccge.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Include
	@Id
	private Long id;
	
	private String nome;
	
	private Date dataNascimento;
	
	private Sexo sexo;
	
	private String nomeMae;
	
	private String nomePai;

	public enum Sexo{
		MASCULINO,
		FEMENINO
	}
}
