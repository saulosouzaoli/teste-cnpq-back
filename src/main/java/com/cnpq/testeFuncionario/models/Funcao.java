package com.cnpq.testeFuncionario.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="funcao")
public class Funcao  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome",length = 255,nullable = false)
    private String nome;

    @Column(name = "cbo",length = 7,nullable = false)
    private String cbo;


    @JsonIgnore
    @OneToMany(mappedBy = "funcao", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<Funcionario> funcionarios;
}
