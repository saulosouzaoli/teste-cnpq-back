package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.Contato;
import com.cnpq.testeFuncionario.models.DadosBasicos;
import com.cnpq.testeFuncionario.services.ContatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contato")
public class ContatoResource extends GenericResource<Contato,Long, ContatoService> {


    public ContatoResource(ContatoService service) {
        super(service);
    }

    @GetMapping(path = "buscarPorFuncionario/{id}")
    public List<Contato> buscarPorFuncionario(@PathVariable("id") Long idFuncionario){
        return this.getService().buscarPorFuncionario(idFuncionario);
    }
}
