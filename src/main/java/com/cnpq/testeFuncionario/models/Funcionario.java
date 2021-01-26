package com.cnpq.testeFuncionario.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;
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

    @JsonIgnore
    @OneToOne(mappedBy = "funcionario")
    private DadosBasicos DadosBasicos;

    @ManyToOne
    @JoinColumn(name = "id_funcao")
    private Funcao funcao;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "data_exclusao")
    private Date dataExclusao;

    @JsonIgnore
    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<RegistroPonto> registroPontos;

    @JsonIgnore
    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<Contato> contatos;

    @JsonIgnore
    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<Endereco> enderecos;
    public Funcionario(){}

    public Funcionario(Long idFuncionario) {
        this.id = idFuncionario;
    }
}
