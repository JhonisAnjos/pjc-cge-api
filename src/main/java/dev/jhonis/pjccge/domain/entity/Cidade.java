package dev.jhonis.pjccge.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cidade implements Serializable{

	private static final long serialVersionUID = 1L;

	@Include
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private Uf uf;
	
	public enum Uf{
		AM,
		BA,
		CE,
		DF,
		ES,
		GO,
		MA,
		MT,
		MS,
		MG,
		PA,
		PB,
		PR,
		PE,
		PI,
		RJ,
		RN,
		RS,
		RO,
		RR,
		SC;
	}
}
