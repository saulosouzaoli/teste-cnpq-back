package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.services.FuncionarioService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("funcionario")
public class FuncionarioResource extends GenericResource<Funcionario,Long, FuncionarioService> {


    public FuncionarioResource(FuncionarioService service) {
        super(service);
    }

    @GetMapping(path = "buscar")
    public Page<Funcionario> buscar(@RequestParam(value = "pagina", defaultValue = "0") Integer page,
                                                   @RequestParam(value = "linhasPorPagina", defaultValue = "10") Integer linesPerPage,
                                                   @RequestParam(value = "ordernarPor", defaultValue = "id") String orderBy,
                                                   @RequestParam(value = "direcao", defaultValue = "ASC") String direction){
        return this.getService().buscar(page,linesPerPage,orderBy,direction);
    }

}
