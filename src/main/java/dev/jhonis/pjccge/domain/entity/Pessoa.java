package dev.jhonis.pjccge.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
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
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Include
	@Id
	private Long id;
	
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	private Sexo sexo;
	
	private String nomeMae;
	
	private String nomePai;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "pessoa_endereco", 
      joinColumns = 
        { @JoinColumn(name = "pessoa_id", referencedColumnName = "id") },
      inverseJoinColumns = 
        { @JoinColumn(name = "endereco_id", referencedColumnName = "id") })
	private Endereco endereco;
	
	public enum Sexo{
		MASCULINO,
		FEMENINO;
	}
}
