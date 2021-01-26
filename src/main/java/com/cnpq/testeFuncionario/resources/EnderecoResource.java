package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.DadosBasicos;
import com.cnpq.testeFuncionario.models.Endereco;
import com.cnpq.testeFuncionario.services.EnderecoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("endereco")
public class EnderecoResource extends GenericResource<Endereco,Long, EnderecoService> {


    public EnderecoResource(EnderecoService service) {
        super(service);
    }

    @GetMapping(path = "buscarPorFuncionario/{id}")
    public Endereco buscarPorFuncionario(@PathVariable("id")Long idFuncionario){
        return this.getService().buscarPorFuncionario(idFuncionario);
    }
}
