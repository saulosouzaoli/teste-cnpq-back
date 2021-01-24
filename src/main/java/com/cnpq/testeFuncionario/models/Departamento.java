package com.cnpq.testeFuncionario.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="departamento")
public class Departamento  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;


    @Column(name = "nome",length = 255,nullable = false)
    private String nome;

    @Column(name = "sigla",length = 10,nullable = false)
    private String sigla;


    @JsonIgnore
    @OneToMany(mappedBy = "departamento", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<Funcionario> funcionarios;


}
