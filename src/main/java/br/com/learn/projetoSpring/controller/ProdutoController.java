package br.com.learn.projetoSpring.controller;

import br.com.learn.projetoSpring.model.Produto;
import br.com.learn.projetoSpring.validation.ProdutoValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.learn.projetoSpring.service.impl.ProtudoServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProtudoServiceImpl produtoServiceImpl;

    @GetMapping
    public List<Produto> getAll(){
        return produtoServiceImpl.getAll();
    }

    //@PostMapping => method post do http
    //@RequestBody => postman (client) vai enviar um body via json
    //@Valid, ativa as regras de validacao do ProdutoValidation como tambanho do campo etc
    @PostMapping
    public Produto create(@Valid @RequestBody ProdutoValidation produtoValidation) {
        return produtoServiceImpl.create(produtoValidation);
    }

}
