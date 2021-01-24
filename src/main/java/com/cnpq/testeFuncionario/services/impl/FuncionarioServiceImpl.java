package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.models.FuncionarioDTO;
import com.cnpq.testeFuncionario.repositories.FuncionarioRepository;
import com.cnpq.testeFuncionario.services.FuncionarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl extends GenericServiceImpl<Funcionario,Long, FuncionarioRepository> implements FuncionarioService {


    public FuncionarioServiceImpl(FuncionarioRepository repo) {
        super(repo);
    }


    @Override
    public List<FuncionarioDTO> buscarTodosDTO() {
        return getRepo().buscarTodosDTO();
    }

    @Override
    public FuncionarioDTO buscarDTOPorId(Long id) {
        return  getRepo().buscarDTOPorId(id);
    }
}
