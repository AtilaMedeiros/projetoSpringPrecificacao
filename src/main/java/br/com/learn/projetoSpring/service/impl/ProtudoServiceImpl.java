package br.com.learn.projetoSpring.service.impl;

import br.com.learn.projetoSpring.model.Empresa;
import br.com.learn.projetoSpring.model.Produto;
import br.com.learn.projetoSpring.repository.EmpresaRepository;
import br.com.learn.projetoSpring.repository.ProdutoRepository;
import br.com.learn.projetoSpring.service.IProdutoService;
import br.com.learn.projetoSpring.validation.ProdutoUpdateValidation;
import br.com.learn.projetoSpring.validation.ProdutoValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//informando para o spring que o @Service é um BEAN que será instanciado com o @Autowired em qualquer lugar da application
@Service
public class ProtudoServiceImpl implements IProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public Produto create(ProdutoValidation produtoValidation) {
        Produto produto = new Produto();
        produto.setNome(produtoValidation.getNome());
        produto.setPrecoCompra(produto.getPrecoCompra());

        Empresa empresaId = empresaRepository.findById(produtoValidation.getEmpresa_id()).get();
        produto.setEmpresa(empresaId);

        return produtoRepository.save(produto);
    }

    @Override
    public Produto get(Long id) {
        return null;
    }

    @Override
    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto update(Long id, ProdutoUpdateValidation produtoUpdateValidation) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
