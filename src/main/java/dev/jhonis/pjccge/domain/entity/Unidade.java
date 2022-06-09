package dev.jhonis.pjccge.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Unidade implements Serializable{

	private static final long serialVersionUID = 1L;

	@Include
	@Id
	private Long id;
	
	private String nome;
	
	private String sigla;
}
