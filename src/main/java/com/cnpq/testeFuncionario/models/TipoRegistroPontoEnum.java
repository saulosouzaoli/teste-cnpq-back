package com.cnpq.testeFuncionario.models;

import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum TipoRegistroPontoEnum {

    ENTRADA(1,"Entrada"),SAIDA(2,"Saída");

    private Integer codigo;
    private String descricao;

    TipoRegistroPontoEnum(Integer codigo,String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static TipoRegistroPontoEnum lookup(Integer codigo) {
        return Stream.of(TipoRegistroPontoEnum.values())
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
