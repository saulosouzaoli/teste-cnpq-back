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

    @Column(name = "tipo_registro_ponto",nullable = false)
    private Integer valorTipoRegistroPonto;

    @Transient
    private TipoRegistroPontoEnum tipoRegistroPonto;


    @PostLoad
    void fillTransient() {
        if (valorTipoRegistroPonto!=null) {
            this.tipoRegistroPonto = TipoRegistroPontoEnum.lookup(valorTipoRegistroPonto);
        }
    }

    @PrePersist
    void fillPersistent() {
        if (tipoRegistroPonto != null) {
            this.valorTipoRegistroPonto = tipoRegistroPonto.getCodigo();
        }
    }


}
