package dev.jhonis.pjccge.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.jhonis.pjccge.domain.service.ServidorEfetivoService;

@RestController
@RequestMapping(path = "/servidores-efetivos")
public class ServidorEfetivoController {
	
	@Autowired
	private ServidorEfetivoService servidorEfetivoService;
	
	
}
