package com.tec.cruddsi3.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.cruddsi3.interfaceService.iUserService;
import com.tec.cruddsi3.interfaces.iUser;
import com.tec.cruddsi3.model.cUser;

@Service
public class cUserService implements iUserService {

    @Autowired
    private iUser data;
    
    @Override
    public List<cUser> find() {
        return (List<cUser>) data.findAll();      
        
    }
    @Override
    public Optional<cUser> findById(int id) {
        return (Optional<cUser>) data.findById(id);
       
    }
    @Override
    public int save(cUser obj) {
            int res=0;
            cUser oUser = data.save(obj);
            if (oUser.equals(null)) {
                res=1;
            }
            return res;
    }
    @Override
    public void delete(int id) {
        data.deleteById(id);
        
    }
    
}
