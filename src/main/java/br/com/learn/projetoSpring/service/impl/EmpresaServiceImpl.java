package br.com.learn.projetoSpring.service.impl;

import br.com.learn.projetoSpring.model.Empresa;
import br.com.learn.projetoSpring.model.RegimeTributario;
import br.com.learn.projetoSpring.repository.EmpresaRepository;
import br.com.learn.projetoSpring.repository.RegimeTributarioRepository;
import br.com.learn.projetoSpring.service.IEmpresaService;
import br.com.learn.projetoSpring.validation.EmpresaUpdateValidation;
import br.com.learn.projetoSpring.validation.EmpresaValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//informando para o spring que o @Service é um BEAN que será instanciado com o @Autowired em qualquer lugar da application
@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private RegimeTributarioRepository regimeTributarioRepository;

    @Override
    public Empresa create(EmpresaValidation empresaValidation) {
        Empresa empresa = new Empresa();
        empresa.setNome(empresaValidation.getNome());

        RegimeTributario regimeTributarioId = regimeTributarioRepository.findById(empresaValidation.getRegime_id()).get();
        empresa.setRegime(regimeTributarioId);

        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa get(Long id) {

        return null;
    }

    @Override
    public List<Empresa> getAll() {
        return empresaRepository.findAll();
    }

    @Override
    public Empresa update(Long id, EmpresaUpdateValidation empresaUpdateValidation) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
