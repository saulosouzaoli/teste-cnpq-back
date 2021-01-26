package com.cnpq.testeFuncionario.services;

import com.cnpq.testeFuncionario.models.Contato;

import java.util.List;

public interface ContatoService  extends GenericService<Contato,Long>  {
    List<Contato> buscarPorFuncionario(Long idFuncionario);
}
