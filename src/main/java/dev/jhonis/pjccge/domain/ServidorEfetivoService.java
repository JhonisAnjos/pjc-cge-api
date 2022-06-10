package dev.jhonis.pjccge.domain;

import org.springframework.stereotype.Service;

import dev.jhonis.pjccge.domain.entity.ServidorEfetivo;
import dev.jhonis.pjccge.domain.exception.AlreadyExistsException;
import dev.jhonis.pjccge.domain.repository.ServidorEfetivoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServidorEfetivoService {
	
	private static String SERVIDOR_AL_READY_EXISTS_EXCEPTION_MSG = "Já existe um servidor com a mátricula: %s";

	private final ServidorEfetivoRepository servidorEfetivoRepository;

	public ServidorEfetivo save(ServidorEfetivo servidorEfetivo) {
		this.servidorEfetivoRepository.findByMatricula(servidorEfetivo.getMatricula()).ifPresent(servidorExistente -> {
			throw new AlreadyExistsException(String.format(SERVIDOR_AL_READY_EXISTS_EXCEPTION_MSG, servidorExistente.getMatricula()));
		});
		
		return this.servidorEfetivoRepository.save(servidorEfetivo);
	}

}
