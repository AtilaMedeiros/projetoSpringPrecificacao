package br.com.learn.projetoSpring.controller;

import br.com.learn.projetoSpring.model.RegimeTributario;
import br.com.learn.projetoSpring.service.impl.RegimeTributarioServiceImpl;
import br.com.learn.projetoSpring.validation.RegimeTributarioUpdateValidation;
import br.com.learn.projetoSpring.validation.RegimeTributarioValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/regime-tributario")
public class RegimeTributarioController {

    @Autowired
    RegimeTributarioServiceImpl regimeTributarioService;

    @GetMapping
    public List<RegimeTributario> getAll(){
        return regimeTributarioService.getAll();
    }

    @PostMapping
    public RegimeTributario create(@Valid @RequestBody RegimeTributarioValidation regimeTributarioValidation){
        return regimeTributarioService.create(regimeTributarioValidation);
    }

}
