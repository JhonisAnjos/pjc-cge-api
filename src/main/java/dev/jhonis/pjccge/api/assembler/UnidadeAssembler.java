package dev.jhonis.pjccge.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import dev.jhonis.pjccge.api.model.UnidadeModel;
import dev.jhonis.pjccge.api.model.input.UnidadeInput;
import dev.jhonis.pjccge.domain.entity.Unidade;

@Component
public class UnidadeAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public UnidadeModel convertToModel(Unidade entity) {
		return this.modelMapper.map(entity, UnidadeModel.class);
	}
	
	public Unidade convertToEntity(UnidadeInput input) {
		return this.modelMapper.map(input, Unidade.class);
	}

	public Page<UnidadeModel> convertToModelPage(Page<Unidade> entityPage) {
		return entityPage.map(entity -> convertToModel(entity));
	}
}
