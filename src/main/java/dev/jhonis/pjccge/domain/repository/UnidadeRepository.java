package dev.jhonis.pjccge.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import dev.jhonis.pjccge.domain.entity.Unidade;

public interface UnidadeRepository extends PagingAndSortingRepository<Unidade, Long>{
	
	public Boolean existsByNomeOrSigla(String nome, String sigla);
}
