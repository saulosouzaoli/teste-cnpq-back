package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.Departamento;
import com.cnpq.testeFuncionario.services.DepartamentoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("departamento")
public class DepartamentoResource extends GenericResource<Departamento,Long, DepartamentoService>  {
    public DepartamentoResource(DepartamentoService service) {
        super(service);
    }
}
