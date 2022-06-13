package dev.jhonis.pjccge.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import dev.jhonis.pjccge.api.model.CidadeModel;
import dev.jhonis.pjccge.domain.entity.Cidade;

@Component
public class CidadeAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public CidadeModel convertToModel(Cidade entity) {
		return this.modelMapper.map(entity, CidadeModel.class);
	}

	public Page<CidadeModel> convertToModelPage(Page<Cidade> entityPage) {
		return entityPage.map(entity -> convertToModel(entity));
	}
}
