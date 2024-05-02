package com.tec.cruddsi3.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.tec.cruddsi3.model.cUser;

public interface iUser extends CrudRepository<cUser, Integer> {
    
}
