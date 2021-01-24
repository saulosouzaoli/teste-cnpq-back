package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.Contato;
import com.cnpq.testeFuncionario.repositories.ContatoRepository;
import com.cnpq.testeFuncionario.services.ContatoService;
import org.springframework.stereotype.Service;

@Service
public class ContatoServiceImpl extends GenericServiceImpl<Contato,Long, ContatoRepository> implements ContatoService {


    public ContatoServiceImpl(ContatoRepository repo) {
        super(repo);
    }


}
