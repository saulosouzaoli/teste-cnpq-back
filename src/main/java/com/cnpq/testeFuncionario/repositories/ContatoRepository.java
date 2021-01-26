package com.cnpq.testeFuncionario.repositories;

import com.cnpq.testeFuncionario.models.Contato;
import com.cnpq.testeFuncionario.models.Endereco;
import com.cnpq.testeFuncionario.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatoRepository  extends JpaRepository<Contato, Long> {


    List<Contato> findByFuncionario(Funcionario funcionario);
}
