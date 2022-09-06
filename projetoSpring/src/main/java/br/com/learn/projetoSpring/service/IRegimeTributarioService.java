package br.com.learn.projetoSpring.service;

import br.com.learn.projetoSpring.model.Produto;
import br.com.learn.projetoSpring.model.RegimeTributario;
import br.com.learn.projetoSpring.validation.ProdutoValidation;
import br.com.learn.projetoSpring.validation.RegimeTributarioUpdateValidation;
import br.com.learn.projetoSpring.validation.RegimeTributarioValidation;

import java.util.List;

public interface IRegimeTributarioService {


    RegimeTributario create(RegimeTributarioValidation regimeTributarioValidation);

    RegimeTributario get(Long id);

    RegimeTributario update(Long id, RegimeTributarioUpdateValidation regimeTributarioUpdateValidation);

    List<RegimeTributario> getAll();

    void delete(Long id);



}
