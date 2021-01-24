package com.cnpq.testeFuncionario.services;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.models.FuncionarioDTO;

import java.util.List;

public interface FuncionarioService extends GenericService<Funcionario,Long> {

    public List<FuncionarioDTO> buscarTodosDTO();


    public FuncionarioDTO buscarDTOPorId(Long id);
}
