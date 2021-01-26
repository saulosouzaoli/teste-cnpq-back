package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.Contato;
import com.cnpq.testeFuncionario.models.DadosBasicos;
import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.repositories.ContatoRepository;
import com.cnpq.testeFuncionario.services.ContatoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoServiceImpl extends GenericServiceImpl<Contato,Long, ContatoRepository> implements ContatoService {


    public ContatoServiceImpl(ContatoRepository repo) {
        super(repo);
    }


    @Override
    public List<Contato> buscarPorFuncionario(Long idFuncionario) {
        return getRepo().findByFuncionario(new Funcionario(idFuncionario));
    }
}
