package dev.jhonis.pjccge.core.modelmapper;

import javax.transaction.Transactional;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.jhonis.pjccge.api.model.input.EnderecoInput;
import dev.jhonis.pjccge.domain.entity.Cidade;
import dev.jhonis.pjccge.domain.entity.Endereco;
import dev.jhonis.pjccge.domain.service.CidadeService;

@Configuration
public class ModelMapperConfig {

	@Autowired
	private CidadeService cidadeService;

	@Bean
	@Transactional
	public ModelMapper modelMapper() {

		Converter<Long, Cidade> cidadeConverter = ctx -> {
			return this.cidadeService.findById(ctx.getSource());
		};

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.createTypeMap(EnderecoInput.class, Endereco.class)
				.addMappings(
						mapper -> mapper.using(cidadeConverter).map(EnderecoInput::getCidadeId, Endereco::setCidade))
				.addMappings(mapper -> mapper.skip(Endereco::setId));

		return modelMapper;
	}

}
