package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iVentasService;
import com.tec.cruddsi3.interfaces.iVentas;
import com.tec.cruddsi3.model.cVentas;

@Service
public class cVentasService implements iVentasService{

    @Autowired
    private iVentas data;
    @Override
    public List<cVentas> find() {
        return (List<cVentas>) data.findAll();
       
    }

    @Override
    public Optional<cVentas> findById(int id) {
        return (Optional<cVentas>) data.findById(id);
    }

    @Override
    public int save(cVentas obj) {
        int res=0;
        cVentas oVentas = data.save(obj);
        if (oVentas.equals(null)) {
            res=1;
        }
        return res;
       
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);

      
    }
    
}
