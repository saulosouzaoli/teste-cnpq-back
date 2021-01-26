package com.cnpq.testeFuncionario.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="endereco")
public class Endereco {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_funcionario",nullable = false)
    private Funcionario funcionario;

    @Column(name = "descricao",length = 100)
    private String descricao;

    @Column(name = "endereco",nullable = false)
    private String endereco;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "cep",length = 8,nullable = false)
    private String cep;

    @Column(name = "bairro",length = 100,nullable = false)
    private String bairro;

    @Column(name = "cidade",length = 100,nullable = false)
    private String cidade;

    @Column(name = "uf",length = 2,nullable = false)
    private String uf;


}
