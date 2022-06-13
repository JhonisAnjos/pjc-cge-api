package dev.jhonis.pjccge.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.jhonis.pjccge.api.assembler.CidadeAssembler;
import dev.jhonis.pjccge.api.model.CidadeModel;
import dev.jhonis.pjccge.domain.repository.CidadeRepository;

@RestController
@RequestMapping(path = "/cidades")
public class CidadeController {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private CidadeAssembler cidadeAssembler;
	
	@GetMapping
	private Page<CidadeModel> findAll(@PageableDefault(sort = "nome", direction = Direction.ASC, page = 0, size = 10) Pageable paginacao){
		return this.cidadeAssembler.convertToModelPage(this.cidadeRepository.findAll(paginacao));
	}

}
