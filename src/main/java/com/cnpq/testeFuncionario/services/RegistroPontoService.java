package com.cnpq.testeFuncionario.services;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.models.RegistroPonto;
import org.springframework.data.domain.Page;

public interface RegistroPontoService  extends GenericService<RegistroPonto,Long> {
    Page<RegistroPonto> buscar(Integer page, Integer linesPerPage, String orderBy, String direction, Long funcionario);
}
