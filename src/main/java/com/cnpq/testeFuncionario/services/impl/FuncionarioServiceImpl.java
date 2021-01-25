package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.models.FuncionarioDTO;
import com.cnpq.testeFuncionario.repositories.FuncionarioRepository;
import com.cnpq.testeFuncionario.services.FuncionarioService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl extends GenericServiceImpl<Funcionario,Long, FuncionarioRepository> implements FuncionarioService {


    public FuncionarioServiceImpl(FuncionarioRepository repo) {
        super(repo);
    }


    @Override
    public Page<Funcionario> buscar(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pr = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return getRepo().findAll(pr);
    }
}
