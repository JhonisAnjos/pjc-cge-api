package dev.jhonis.pjccge.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.jhonis.pjccge.api.assembler.ServidorEfetivoAssembler;
import dev.jhonis.pjccge.api.model.ServidorEfetivoModel;
import dev.jhonis.pjccge.api.model.input.ServidorEfetivoInput;
import dev.jhonis.pjccge.domain.service.ServidorEfetivoService;

@RestController
@RequestMapping(path = "/servidores-efetivos")
public class ServidorEfetivoController {
	
	@Autowired
	private ServidorEfetivoService servidorEfetivoService;
	
	@Autowired
	private ServidorEfetivoAssembler servidorEfetivoAssembler;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ServidorEfetivoModel save(@RequestBody ServidorEfetivoInput input) {
		return this.servidorEfetivoAssembler
				.convertToModel(this.servidorEfetivoService.save(this.servidorEfetivoAssembler.convertToEntity(input)));
	}
	
	
}
