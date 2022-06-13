package dev.jhonis.pjccge.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Include
	@Id
	@GeneratedValue
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TipoLogradouro tipoLogradouro;
	
	private String logradouro;
	
	private Integer numero;
	
	private String bairro;
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Cidade cidade;
	
	public enum TipoLogradouro{
		AVENIDA,
		RUA;
	}
}
