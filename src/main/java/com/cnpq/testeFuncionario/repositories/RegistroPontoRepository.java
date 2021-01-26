package com.cnpq.testeFuncionario.repositories;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.models.RegistroPonto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroPontoRepository extends JpaRepository<RegistroPonto, Long> {

    Page<RegistroPonto> findByFuncionario(Pageable pageable, Funcionario funcionario);
}
