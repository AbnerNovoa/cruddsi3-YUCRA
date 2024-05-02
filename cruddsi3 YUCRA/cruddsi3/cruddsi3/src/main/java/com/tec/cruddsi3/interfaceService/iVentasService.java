package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cVentas;

public interface iVentasService {
    public List<cVentas> find();
    public Optional<cVentas> findById(int id);
    public int save(cVentas obj);
    public void delete(int id);
    
}
