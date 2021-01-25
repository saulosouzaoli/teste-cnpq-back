package com.cnpq.testeFuncionario.repositories;

import com.cnpq.testeFuncionario.models.Funcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao, Long> {
}
