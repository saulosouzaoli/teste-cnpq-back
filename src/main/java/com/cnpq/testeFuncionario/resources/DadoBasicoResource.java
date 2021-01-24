package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.DadoBasico;
import com.cnpq.testeFuncionario.services.DadoBasicoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dado-basico")
public class DadoBasicoResource extends GenericResource<DadoBasico,Long, DadoBasicoService> {


    public DadoBasicoResource(DadoBasicoService service) {
        super(service);
    }

}
