package com.cnpq.testeFuncionario.repositories;

import com.cnpq.testeFuncionario.models.DadosBasicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosBasicosRepository extends JpaRepository<DadosBasicos, Long> {
}
