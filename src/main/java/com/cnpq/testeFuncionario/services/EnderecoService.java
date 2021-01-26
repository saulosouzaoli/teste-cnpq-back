package com.cnpq.testeFuncionario.services;

import com.cnpq.testeFuncionario.models.Endereco;

public interface EnderecoService extends GenericService<Endereco,Long> {
    Endereco buscarPorFuncionario(Long idFuncionario);
}
