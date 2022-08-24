package br.com.learn.projetoSpring.controller;

import br.com.learn.projetoSpring.model.Empresa;
import br.com.learn.projetoSpring.model.Produto;
import br.com.learn.projetoSpring.service.impl.EmpresaServiceImpl;
import br.com.learn.projetoSpring.validation.EmpresaValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaServiceImpl empresaServiceImpl;


    //@GetMapping é o method get do http
    @GetMapping
    public List<Empresa> getAll(@RequestParam(value = "nome", required = false) String nome){
        return empresaServiceImpl.getAll(nome);
    }

    //@Postmapping é o method post do Http
    //EmpresaValidation recebe as regras de validacao dos dados, como se fosse um formulario
    //@RequestBody vamos passar no corpo da requisiça o novo cadastro como json
    //@Valid ativa as validações. Ex. EmpresaValidation
    @PostMapping
    public Empresa create(@Valid @RequestBody EmpresaValidation empresaValidation) {
        return empresaServiceImpl.create(empresaValidation);
    }

    //@PathVariable => vamos passar argumentos no endereço
    @GetMapping("/{empresa_id}/produtos")
    public List<Produto> getAllProdutosId(@PathVariable Long empresa_id){
        return empresaServiceImpl.getAllProdutosId(empresa_id);

    }

}
