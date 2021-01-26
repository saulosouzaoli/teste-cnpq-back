package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.DadosBasicos;
import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.services.DadosBasicosService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dados-basicos")
public class DadosBasicosResource extends GenericResource<DadosBasicos,Long, DadosBasicosService> {


    public DadosBasicosResource(DadosBasicosService service) {
        super(service);
    }

    @GetMapping(path = "buscarPorFuncionario/{id}")
    public DadosBasicos buscarPorFuncionario(@PathVariable("id") Long idFuncionario){
        return this.getService().buscarPorFuncionario(idFuncionario);
    }
}
