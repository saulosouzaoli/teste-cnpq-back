package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.services.GenericService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Getter
public abstract class GenericResource<T,ID,S extends GenericService<T,ID>> {

    private S service;

    public GenericResource(S service){
        this.service = service;
    }

    @GetMapping()
    public List<T> findAll(){
        return service.findAll();
    }

    @PostMapping()
    public T save(@RequestBody  T obj){
       return service.save(obj);
    }

    @PutMapping(path="/{id}")
    public T update(@RequestBody T obj,@PathVariable ID id){
        return service.save(obj);
    }

    @DeleteMapping()
    public void delete(T obj){
        service.delete(obj);
    }

    @GetMapping(path="/{id}")
    public Optional<T> findById(@PathVariable ID id){
        return service.findById(id);
    }
}
