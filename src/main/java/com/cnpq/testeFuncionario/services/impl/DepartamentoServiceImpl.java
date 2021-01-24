package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.Departamento;
import com.cnpq.testeFuncionario.repositories.DepartamentoRepository;
import com.cnpq.testeFuncionario.services.DepartamentoService;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServiceImpl extends GenericServiceImpl<Departamento,Long, DepartamentoRepository> implements DepartamentoService {
    public DepartamentoServiceImpl(DepartamentoRepository repo) {
        super(repo);
    }
}
