package br.com.learn.projetoSpring.service;

import br.com.learn.projetoSpring.model.Empresa;
import br.com.learn.projetoSpring.validation.EmpresaUpdateValidation;
import br.com.learn.projetoSpring.validation.EmpresaValidation;

import java.util.List;

/*Cada implementação obriga o CRUD a aplicar as regras de validacao */
public interface IEmpresaService {

    Empresa create(EmpresaValidation empresaValidation);

    Empresa get(Long id);

    Empresa update(Long id, EmpresaUpdateValidation empresaUpdateValidation);

    List<Empresa> getAll();

    void delete(Long id);

}
