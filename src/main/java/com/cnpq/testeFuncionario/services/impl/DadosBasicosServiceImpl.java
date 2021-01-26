package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.DadosBasicos;
import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.repositories.DadosBasicosRepository;
import com.cnpq.testeFuncionario.services.DadosBasicosService;
import org.springframework.stereotype.Service;

@Service
public class DadosBasicosServiceImpl extends GenericServiceImpl<DadosBasicos,Long, DadosBasicosRepository> implements DadosBasicosService {
    public DadosBasicosServiceImpl(DadosBasicosRepository repo) {
        super(repo);
    }

    @Override
    public DadosBasicos buscarPorFuncionario(Long idFuncionario) {
        return getRepo().findByFuncionario(new Funcionario(idFuncionario));
    }
}
