package com.cnpq.testeFuncionario.services.impl;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.models.RegistroPonto;
import com.cnpq.testeFuncionario.repositories.RegistroPontoRepository;
import com.cnpq.testeFuncionario.services.RegistroPontoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class RegistroPontoServiceImpl extends GenericServiceImpl<RegistroPonto,Long, RegistroPontoRepository> implements RegistroPontoService {
    public RegistroPontoServiceImpl(RegistroPontoRepository repo) {
        super(repo);
    }

    @Override
    public Page<RegistroPonto> buscar(Integer page, Integer linesPerPage, String orderBy, String direction, Long funcionario) {
            PageRequest pr = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
            return getRepo().findByFuncionario(pr,new Funcionario(funcionario));
    }
}
