package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cClientes;

public interface iClientesService {
    public List<cClientes> find();
    public Optional<cClientes> findById(int id);
    public int save(cClientes obj);
    public void delete(int id);
    
}
