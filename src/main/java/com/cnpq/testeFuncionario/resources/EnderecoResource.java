package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.Funcao;
import com.cnpq.testeFuncionario.services.FuncaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("funcao")
public class FuncaoResource extends GenericResource<Funcao,Long, FuncaoService> {


    public FuncaoResource(FuncaoService service) {
        super(service);
    }

}
