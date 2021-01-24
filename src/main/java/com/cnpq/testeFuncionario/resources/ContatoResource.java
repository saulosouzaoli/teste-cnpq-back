package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.Contato;
import com.cnpq.testeFuncionario.services.ContatoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class ContatoResource extends GenericResource<Contato,Long, ContatoService> {


    public ContatoResource(ContatoService service) {
        super(service);
    }

}
