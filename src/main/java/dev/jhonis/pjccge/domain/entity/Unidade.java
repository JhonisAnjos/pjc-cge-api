package dev.jhonis.pjccge.domain.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

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
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private String sigla;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "unidade_endereco", 
      joinColumns = 
        { @JoinColumn(name = "unidade_id", referencedColumnName = "id") },
      inverseJoinColumns = 
        { @JoinColumn(name = "pessoa_id", referencedColumnName = "id") })
	private Endereco endereco;
}
