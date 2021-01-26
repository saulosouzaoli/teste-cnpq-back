package com.cnpq.testeFuncionario.resources;

import com.cnpq.testeFuncionario.models.Funcionario;
import com.cnpq.testeFuncionario.models.RegistroPonto;
import com.cnpq.testeFuncionario.services.RegistroPontoService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("registro-ponto")
public class RegistroPontoResource  extends GenericResource<RegistroPonto,Long, RegistroPontoService> {
    public RegistroPontoResource(RegistroPontoService service) {
        super(service);
    }


    @GetMapping(path = "buscar")
    public Page<RegistroPonto> buscar(@RequestParam(value = "pagina", defaultValue = "0") Integer page,
                                    @RequestParam(value = "linhasPorPagina", defaultValue = "5") Integer linesPerPage,
                                    @RequestParam(value = "ordernarPor", defaultValue = "id") String orderBy,
                                    @RequestParam(value = "direcao", defaultValue = "ASC") String direction,
                                    @RequestParam(value = "funcionario") Long funcionario){
        return this.getService().buscar(page,linesPerPage,orderBy,direction,funcionario);
    }
}
