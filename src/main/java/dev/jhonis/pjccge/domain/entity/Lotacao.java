package dev.jhonis.pjccge.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Lotacao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Include
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name = "unidade_id")
	private Unidade unidade;
	
	@Temporal(TemporalType.DATE)
	private Date dataLotacao;
	
	@Temporal(TemporalType.DATE)
	private Date dataRemocao;
	
	private String portaria;

}
