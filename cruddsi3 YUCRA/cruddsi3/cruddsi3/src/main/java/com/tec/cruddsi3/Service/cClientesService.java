package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iClientesService;
import com.tec.cruddsi3.interfaces.iClientes;
import com.tec.cruddsi3.model.cClientes;

@Service
public class cClientesService implements iClientesService{

    
    @Autowired
    private iClientes data;
    @Override
    public List<cClientes> find() {
        return (List<cClientes>) data.findAll();
       
    }

    @Override
    public Optional<cClientes> findById(int id) {
        return (Optional<cClientes>) data.findById(id);
    }

    @Override
    public int save(cClientes obj) {
        int res=0;
        cClientes oClientes = data.save(obj);
        if (oClientes.equals(null)) {
            res=1;
        }
        return res;  
    }
    
    @Override
    public void delete(int id) {
        
    }
    
}
