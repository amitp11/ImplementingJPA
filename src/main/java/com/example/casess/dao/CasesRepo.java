package com.example.casess.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.casess.modal.Cases;

@Repository
public interface CasesRepo extends CrudRepository<Cases, Integer>{

}
