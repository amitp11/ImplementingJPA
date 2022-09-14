package com.example.casess.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.casess.modal.Entities_To_Cases;

@Repository
public interface Entities_To_CasesRepo extends CrudRepository<Entities_To_Cases, Integer>{

}
