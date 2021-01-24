package com.cnpq.testeFuncionario.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="funcionario")
public class Funcionario  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;


    @Column(name = "matricula",length = 15,nullable = false)
    private String matricula;

    //@NotNull
    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;


    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_dado_basico", referencedColumnName = "id")
    private DadoBasico dadoBasico;

    @ManyToOne
    @JoinColumn(name = "id_funcao")
    private Funcao funcao;

    @JsonIgnore
    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<RegistroPonto> registroPontos;

    @JsonIgnore
    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<Contato> contatos;

    @JsonIgnore
    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<Endereco> enderecos;

}
