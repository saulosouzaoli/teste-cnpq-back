package com.cnpq.testeFuncionario.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="contato")
public class Contato {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;


    @Column(name = "contato",length = 250,nullable = false)
    public String contato;

    @Column(name = "tipo_contato",nullable = false)
    public Integer valorTipoContato;

    @ManyToOne
    @JoinColumn(name = "id_funcionario",nullable = false)
    private Funcionario funcionario;

    @Transient
    private TipoContatoEnum tipoContato;

    @PostLoad
    void fillTransient() {
        if (valorTipoContato!=null) {
            this.tipoContato = TipoContatoEnum.lookup(valorTipoContato);
        }
    }

    @PrePersist
    void fillPersistent() {
        if (tipoContato != null) {
            this.valorTipoContato = tipoContato.getCodigo();
        }
    }
}
