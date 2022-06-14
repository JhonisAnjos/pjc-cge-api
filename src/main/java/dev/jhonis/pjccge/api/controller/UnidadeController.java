package dev.jhonis.pjccge.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.jhonis.pjccge.api.assembler.UnidadeAssembler;
import dev.jhonis.pjccge.api.model.UnidadeModel;
import dev.jhonis.pjccge.api.model.input.UnidadeInput;
import dev.jhonis.pjccge.domain.service.UnidadeService;

@RestController
@RequestMapping(path = "/unidades")
public class UnidadeController {

	@Autowired
	private UnidadeService unidadeService;

	@Autowired
	private UnidadeAssembler unidadeAssembler;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public UnidadeModel save(@RequestBody UnidadeInput input) {
		return this.unidadeAssembler
				.convertToModel(this.unidadeService.save(this.unidadeAssembler.convertToEntity(input)));
	}

}
