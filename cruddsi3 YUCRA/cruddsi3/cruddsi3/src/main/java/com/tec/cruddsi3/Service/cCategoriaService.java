package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iCategoriaService;
import com.tec.cruddsi3.interfaces.iCategoria;
import com.tec.cruddsi3.model.cCategoria;

@Service
public class cCategoriaService implements iCategoriaService{

    @Autowired
    private iCategoria data;

    @Override
    public List<cCategoria> find() {
        return (List<cCategoria>) data.findAll();
     
    }

    @Override
    public Optional<cCategoria> findById(int id) {
        return (Optional<cCategoria>) data.findById(id);
      
    }
    @Override
    public int save(cCategoria obj) {
        int res=0;
        cCategoria oCategoria = data.save(obj);
        if (oCategoria.equals(null)) {
            res=1;
        }
        return res;
    }
    @Override
    public void delete(int id) {
        data.deleteById(id);
      
    }
    
}
