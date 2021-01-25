package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.DadosBasicos;
import com.cnpq.testeFuncionario.services.DadosBasicosService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dado-basico")
public class DadosBasicosResource extends GenericResource<DadosBasicos,Long, DadosBasicosService> {


    public DadosBasicosResource(DadosBasicosService service) {
        super(service);
    }

}
