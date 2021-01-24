package com.cnpq.testeFuncionario.services;

import java.util.List;
import java.util.Optional;

public interface GenericService<T,ID> {

    List<T> findAll();

    T save(T obj);

    void delete(T obj);


    Optional<T> findById(ID id);

}
