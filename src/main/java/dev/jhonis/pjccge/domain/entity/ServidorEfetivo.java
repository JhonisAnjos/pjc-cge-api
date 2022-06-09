package dev.jhonis.pjccge.domain.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@PrimaryKeyJoinColumn(name = "pessoa_id")
public class ServidorEfetivo extends Pessoa{
	
	private static final long serialVersionUID = 1L;
	
	private String matricula;

}
