package dev.jhonis.pjccge.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.jhonis.pjccge.domain.entity.Unidade;
import dev.jhonis.pjccge.domain.exception.AlreadyExistsException;
import dev.jhonis.pjccge.domain.repository.UnidadeRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UnidadeService {

	private final UnidadeRepository unidadeRepository;
	
	private static String UNIDADE_AL_READY_EXISTS_EXCEPTION_MSG = "Já existe uma unidade com a sigla '%s' ou nome '%s' informados";

	@Transactional
	public Unidade save(Unidade unidade) {
		if (this.unidadeRepository.existsByNomeOrSigla(unidade.getNome(), unidade.getSigla())) {
			throw new AlreadyExistsException(
					String.format(UNIDADE_AL_READY_EXISTS_EXCEPTION_MSG, unidade.getSigla(), unidade.getNome()));
		}
		
		return this.unidadeRepository.save(unidade);
	}

}
