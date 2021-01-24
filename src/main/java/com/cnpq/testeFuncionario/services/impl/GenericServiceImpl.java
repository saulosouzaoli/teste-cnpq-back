package com.cnpq.testeFuncionario.services.impl;


import com.cnpq.testeFuncionario.services.GenericService;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Getter
public abstract class GenericServiceImpl<T,ID,R extends JpaRepository<T,ID>> implements GenericService<T,ID> {

    private R repo;

    public GenericServiceImpl(R repo){
        this.repo = repo;
    }

    @Override
    public List<T> findAll() {
        return repo.findAll();
    }

    @Override
    public T save(T obj) {
        return repo.save(obj);
    }

    @Override
    public void delete(T obj) {
        repo.delete(obj);
    }

    @Override
    public Optional<T> findById(ID id) {
        return repo.findById(id);
    }
}
