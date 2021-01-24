package com.cnpq.testeFuncionario.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="dado_basico")
public class DadoBasico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "nome",length = 255,nullable = false)
    private String nome;

    @Column(name = "cpf",nullable = false,length = 11)
    private String cpf;

    @Column(name="rg",nullable = false,length = 15)
    private String rg;

    @Column(name = "nome_pai",length = 255)
    private String nomePai;

    @Column(name = "nome_mae",nullable = false,length = 255)
    private String nomeMae;


    @OneToOne(mappedBy = "dadoBasico")
    private Funcionario funcionario;



}