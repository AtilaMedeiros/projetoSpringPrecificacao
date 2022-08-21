package br.com.learn.projetoSpring.service.impl;

import br.com.learn.projetoSpring.model.RegimeTributario;
import br.com.learn.projetoSpring.repository.RegimeTributarioRepository;
import br.com.learn.projetoSpring.service.IRegimeTributarioService;
import br.com.learn.projetoSpring.validation.RegimeTributarioUpdateValidation;
import br.com.learn.projetoSpring.validation.RegimeTributarioValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//informando para o spring que o @Service é um BEAN que será instanciado com o @Autowired em qualquer lugar da application
@Service
public class RegimeTributarioServiceImpl implements IRegimeTributarioService {

    @Autowired
    RegimeTributarioRepository regimeTributarioRepository;

    //de uma lado usa o objeto e seta nome e do outro pega os parametros de validação do campo
    //regimeTributario.setNome ==> seta o valor
    //regimeTributarioValidation.getTaxa() ==> conforme regra de validacao
    @Override
    public RegimeTributario create(RegimeTributarioValidation regimeTributarioValidation) {
        RegimeTributario regimeTributario = new RegimeTributario();
        regimeTributario.setNome(regimeTributarioValidation.getNome());
        regimeTributario.setTaxa(regimeTributarioValidation.getTaxa());

        //salva o objeto regimeTributario na variavel regimeTributarioRepository (o JPA sabva no banco depois que está nessa var)
        return regimeTributarioRepository.save(regimeTributario);
    }

    @Override
    public RegimeTributario get(Long id) {
        return null;
    }

    @Override
    public List<RegimeTributario> getAll() {
        return regimeTributarioRepository.findAll();
    }

    @Override
    public RegimeTributario update(Long id, RegimeTributarioUpdateValidation regimeTributarioUpdateValidation) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
