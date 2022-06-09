package dev.jhonis.pjccge.domain.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@PrimaryKeyJoinColumn(name = "pessoa_id")
public class ServidorTemporario extends Pessoa{
	
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	private Date dataAdmissao;
	
	@Temporal(TemporalType.DATE)
	private Date dataDemissao;

}
