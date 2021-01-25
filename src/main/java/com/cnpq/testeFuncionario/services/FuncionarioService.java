package com.cnpq.testeFuncionario.services;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.models.FuncionarioDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface FuncionarioService extends GenericService<Funcionario,Long> {

    Page<Funcionario> buscar(Integer page, Integer linesPerPage, String orderBy, String direction);
}
