package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.DadoBasico;
import com.cnpq.testeFuncionario.repositories.DadoBasicoRepository;
import com.cnpq.testeFuncionario.services.DadoBasicoService;
import org.springframework.stereotype.Service;

@Service
public class DadoBasicoServiceImpl extends GenericServiceImpl<DadoBasico,Long, DadoBasicoRepository> implements DadoBasicoService {
    public DadoBasicoServiceImpl(DadoBasicoRepository repo) {
        super(repo);
    }
}
