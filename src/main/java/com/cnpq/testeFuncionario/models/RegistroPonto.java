package com.cnpq.testeFuncionario.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="registro_ponto")
public class RegistroPonto   {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;


    @ManyToOne
    @JoinColumn(name = "id_funcionario",nullable = false)
    private Funcionario funcionario;

    @Temporal(value = TemporalType.DATE)
    @Column(name = "data", nullable = false)
    private Date data;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "entrada1", nullable = false)
    private Date entrada1;


    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "entrada2", nullable = false)
    private Date entrada2;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "saida1", nullable = false)
    private Date saida1;


    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "saida2", nullable = false)
    private Date saida2;


}
