package com.example.casess.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.casess.modal.Entities;

@Repository
public interface EntitiesRepo extends CrudRepository<Entities, Integer>{

}
