package com.cnpq.testeFuncionario.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuncionarioDTO {

    public Long id;

    public String matricula;

    public Departamento departamento;

    public Funcao funcao;

    public FuncionarioDTO() {
    }
    public FuncionarioDTO(Funcionario f) {
        if(f==null){
            return;
        }
        this.setId(f.getId());
        this.setDepartamento(f.getDepartamento());
        this.setFuncao(f.getFuncao());
        this.setMatricula(f.getMatricula());
    }
}
