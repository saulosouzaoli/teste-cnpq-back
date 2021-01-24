package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.models.FuncionarioDTO;
import com.cnpq.testeFuncionario.services.FuncionarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("funcionario")
public class FuncionarioResource extends GenericResource<Funcionario,Long, FuncionarioService> {


    public FuncionarioResource(FuncionarioService service) {
        super(service);
    }

    @GetMapping(path = "/dto")
    public List<FuncionarioDTO> dto(){
     return getService().buscarTodosDTO();
    }
}
