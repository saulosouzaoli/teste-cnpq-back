package com.cnpq.testeFuncionario.repositories;

import com.cnpq.testeFuncionario.models.RegistroPonto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroPontoRepository extends JpaRepository<RegistroPonto, Long> {
}
