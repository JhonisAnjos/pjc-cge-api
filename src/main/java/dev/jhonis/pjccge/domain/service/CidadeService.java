package dev.jhonis.pjccge.domain.service;

import org.springframework.stereotype.Service;

import dev.jhonis.pjccge.domain.entity.Cidade;
import dev.jhonis.pjccge.domain.exception.ObjectNotFoundException;
import dev.jhonis.pjccge.domain.repository.CidadeRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CidadeService {

	private final CidadeRepository cidadeRepository;

	private final static String CIDADE_NOT_FOUND_MSG = "Cidade com id: %d não encontrada";

	public Cidade findById(Long id) {
		return this.cidadeRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException(String.format(CIDADE_NOT_FOUND_MSG, id)));
	}
}
