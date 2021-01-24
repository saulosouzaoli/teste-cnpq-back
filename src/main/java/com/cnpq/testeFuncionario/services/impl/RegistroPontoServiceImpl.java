package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.RegistroPonto;
import com.cnpq.testeFuncionario.repositories.RegistroPontoRepository;
import com.cnpq.testeFuncionario.services.RegistroPontoService;
import org.springframework.stereotype.Service;

@Service
public class RegistroPontoServiceImpl extends GenericServiceImpl<RegistroPonto,Long, RegistroPontoRepository> implements RegistroPontoService {
    public RegistroPontoServiceImpl(RegistroPontoRepository repo) {
        super(repo);
    }
}
