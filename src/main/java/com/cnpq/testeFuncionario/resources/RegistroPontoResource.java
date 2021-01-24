package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.RegistroPonto;
import com.cnpq.testeFuncionario.services.RegistroPontoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registro-ponto")
public class RegistroPontoResource  extends GenericResource<RegistroPonto,Long, RegistroPontoService> {
    public RegistroPontoResource(RegistroPontoService service) {
        super(service);
    }
}
