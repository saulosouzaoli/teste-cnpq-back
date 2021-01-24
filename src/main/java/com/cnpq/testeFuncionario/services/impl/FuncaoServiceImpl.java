package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.Funcao;
import com.cnpq.testeFuncionario.repositories.FuncaoRepository;
import com.cnpq.testeFuncionario.services.FuncaoService;
import org.springframework.stereotype.Service;

@Service
public class FuncaoServiceImpl extends GenericServiceImpl<Funcao,Long, FuncaoRepository> implements FuncaoService {


    public FuncaoServiceImpl(FuncaoRepository repo) {
        super(repo);
    }


}
