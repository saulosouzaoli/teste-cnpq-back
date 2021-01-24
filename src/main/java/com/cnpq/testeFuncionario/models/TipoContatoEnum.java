package com.cnpq.testeFuncionario.models;

import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum TipoContatoEnum {
    EMAIL(1,"Email"),
    TELEFONE_RESIDENCIAL(2,"Telefone Residencial"),
    CELULAR(3,"Celular"),
    WHATSAPP(4,"WhatsApp"),
    TELEGRAM(5,"Telegram"),
    FACEBOOK(6,"Facebook"),
    TWITTER(7,"Twitter"),
    INSTAGRAM(8,"Instagram");

    private Integer codigo;
    private String descricao;

    TipoContatoEnum(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static TipoContatoEnum lookup(Integer valorTipoContato) {
        return Stream.of(TipoContatoEnum.values())
                .filter(p -> p.getCodigo().equals(valorTipoContato))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
