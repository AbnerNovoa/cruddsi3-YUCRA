package com.tec.cruddsi3.interfaceService;


import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cCategoria;


public interface iCategoriaService {

    public List<cCategoria> find();
    public Optional<cCategoria> findById(int id);
    public int save(cCategoria obj);
    public void delete(int id);

    
}
