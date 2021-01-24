package com.cnpq.testeFuncionario.repositories;

import com.cnpq.testeFuncionario.models.DadoBasico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadoBasicoRepository extends JpaRepository<DadoBasico, Long> {
}
