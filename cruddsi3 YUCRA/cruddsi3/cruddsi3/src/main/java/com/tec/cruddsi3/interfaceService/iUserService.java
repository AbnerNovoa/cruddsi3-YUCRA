package com.tec.cruddsi3.interfaceService;

import java.util.List;
import java.util.Optional;

import com.tec.cruddsi3.model.cUser;

public interface iUserService {
    public List<cUser> find();
    public Optional<cUser> findById(int id);
    public int save(cUser obj);
    public void delete(int id);
}
