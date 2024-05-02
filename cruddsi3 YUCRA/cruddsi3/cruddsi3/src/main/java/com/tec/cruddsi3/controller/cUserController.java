package com.tec.cruddsi3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec.cruddsi3.interfaceService.iUserService;
import com.tec.cruddsi3.model.cUser;

@RestController
@RequestMapping(path = "/api/v1/user")
public class cUserController {

    @Autowired
    private iUserService service;

    @GetMapping
    public List<cUser> find(){
        return service.find();
    }

    @GetMapping("/{id}")
    public Optional<cUser> findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @PostMapping
    public int save(@RequestBody cUser oUser){
        return service.save(oUser);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }
    
}
