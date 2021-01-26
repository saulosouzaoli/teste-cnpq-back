package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.Endereco;
import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.repositories.EnderecoRepository;
import com.cnpq.testeFuncionario.services.EnderecoService;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl extends GenericServiceImpl<Endereco,Long, EnderecoRepository> implements EnderecoService {


    public EnderecoServiceImpl(EnderecoRepository repo) {
        super(repo);
    }

    @Override
    public Endereco buscarPorFuncionario(Long idFuncionario) {
        return getRepo().findByFuncionario(new Funcionario(idFuncionario));
    }
}
