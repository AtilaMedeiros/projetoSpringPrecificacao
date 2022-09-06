package br.com.learn.projetoSpring.service;

import br.com.learn.projetoSpring.model.Empresa;
import br.com.learn.projetoSpring.model.Produto;
import br.com.learn.projetoSpring.validation.EmpresaValidation;
import br.com.learn.projetoSpring.validation.ProdutoUpdateValidation;
import br.com.learn.projetoSpring.validation.ProdutoValidation;

import java.util.List;

public interface IProdutoService {

    Produto create(ProdutoValidation produtoValidation);

    Produto get(Long id);

    Produto update(Long id, ProdutoUpdateValidation produtoUpdateValidation);

    List<Produto> getAll();

    void delete(Long id);

}
