package dev.jhonis.pjccge.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import dev.jhonis.pjccge.api.model.ServidorEfetivoModel;
import dev.jhonis.pjccge.api.model.input.ServidorEfetivoInput;
import dev.jhonis.pjccge.domain.entity.ServidorEfetivo;

@Component
public class ServidorEfetivoAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public ServidorEfetivoModel convertToModel(ServidorEfetivo entity) {
		return this.modelMapper.map(entity, ServidorEfetivoModel.class);
	}
	
	public ServidorEfetivo convertToEntity(ServidorEfetivoInput input) {
		return this.modelMapper.map(input, ServidorEfetivo.class);
	}

	public Page<ServidorEfetivoModel> convertToModelPage(Page<ServidorEfetivo> entityPage) {
		return entityPage.map(entity -> convertToModel(entity));
	}
}
