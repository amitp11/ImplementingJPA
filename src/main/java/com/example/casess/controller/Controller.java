package com.example.casess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.casess.dao.EntitiesRepo;
import com.example.casess.modal.Entities;

@RestController
public class Controller {

	@Autowired
	EntitiesRepo entitiesRepo;

	@RequestMapping(value="/entities", method=RequestMethod.GET)
	public List<Entities> getEntities() {
		return (List<Entities>) this.entitiesRepo.findAll();
	}

	@RequestMapping(value="/entities", method=RequestMethod.POST)
	public Entities addEntities(@RequestBody Entities entity) {
		return this.entitiesRepo.save(entity);
	}
	
}
