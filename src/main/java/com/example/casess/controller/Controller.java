package com.example.casess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.casess.dao.CasesRepo;
import com.example.casess.dao.EntitiesRepo;
import com.example.casess.dao.Entities_To_CasesRepo;
import com.example.casess.exceptions.IdNotFoundException;
import com.example.casess.modal.Cases;
import com.example.casess.modal.Entities;
import com.example.casess.modal.Entities_To_Cases;

@RestController
public class Controller {
	
	@Autowired
	CasesRepo caseRepo;
	@Autowired
	EntitiesRepo entitiesRepo;
	@Autowired
	Entities_To_CasesRepo entities_To_CasesRepo;
	
	@RequestMapping(value="/casesCount", method=RequestMethod.GET)
	public int getCasesCount() {
		return (int) caseRepo.count();
	}
	@RequestMapping(value="/cases", method=RequestMethod.GET)
	public List<Cases> getCases() {
		return (List<Cases>) this.caseRepo.findAll();
	}
	
	@RequestMapping(value="/entities", method=RequestMethod.GET)
	public List<Entities> getEntities() {
		return (List<Entities>) this.entitiesRepo.findAll();
	}
	@RequestMapping(value="/entities", method=RequestMethod.POST)
	public Entities addEntities(@RequestBody Entities entity) {
		return this.entitiesRepo.save(entity);
	}
	@RequestMapping(value="/entities_to/{id}", method=RequestMethod.POST)
	public Entities_To_Cases updateEntities_To_Cases(@PathVariable("id")int id,@RequestBody Entities_To_Cases entities_To_Cases) {
		if(entities_To_CasesRepo.findById(id).isEmpty()) {
			throw new IdNotFoundException();
		}
		entities_To_CasesRepo.deleteById(id);
		return entities_To_CasesRepo.save(entities_To_Cases);	
	}
	@RequestMapping(value="/entities_to", method=RequestMethod.GET)
	public List<Entities_To_Cases> getEntitiesTo() {
		return (List<Entities_To_Cases>) this.entities_To_CasesRepo.findAll();
	}
	
}
