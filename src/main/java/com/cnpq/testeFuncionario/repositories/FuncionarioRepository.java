package com.cnpq.testeFuncionario.repositories;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.models.dto.FuncionarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @Query(value = "select new com.cnpq.testeFuncionario.models.dto.FuncionarioDTO(f) from Funcionario f")
    public List<FuncionarioDTO> buscarTodosDTO();


    @Query(value = "select new com.cnpq.testeFuncionario.models.dto.FuncionarioDTO(f) from Funcionario f where id = :id")
    public FuncionarioDTO buscarDTOPorId(@Param("id") Long id);
}
