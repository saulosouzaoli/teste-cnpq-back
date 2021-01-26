package com.cnpq.testeFuncionario.services;

import com.cnpq.testeFuncionario.models.DadosBasicos;
import com.cnpq.testeFuncionario.models.Funcionario;
import org.springframework.data.domain.Page;

public interface DadosBasicosService extends GenericService<DadosBasicos,Long> {
    DadosBasicos buscarPorFuncionario(Long idFuncionario);
}
