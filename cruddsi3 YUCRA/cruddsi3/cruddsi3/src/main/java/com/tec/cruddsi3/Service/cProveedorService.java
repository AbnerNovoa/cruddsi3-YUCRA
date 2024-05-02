package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iProveedorService;
import com.tec.cruddsi3.interfaces.iProveedor;
import com.tec.cruddsi3.model.cProveedor;

@Service
public class cProveedorService implements iProveedorService {

    @Autowired
    private iProveedor data;

    @Override
    public List<cProveedor> find() {
        return (List<cProveedor>) data.findAll();      
       
    }

    @Override
    public Optional<cProveedor> findById(int id) {
        return (Optional<cProveedor>) data.findById(id);
    
    }

    @Override
    public int save(cProveedor obj) {
        int res=0;
        cProveedor oProveedor = data.save(obj);
        if (oProveedor.equals(null)) {
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
}
