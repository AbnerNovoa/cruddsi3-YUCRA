package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cProveedor;

public interface iProveedorService {
    public List<cProveedor> find();
    public Optional<cProveedor> findById(int id);
    public int save(cProveedor obj);
    public void delete(int id);
}

