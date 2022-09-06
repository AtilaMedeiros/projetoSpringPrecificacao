package br.com.learn.projetoSpring.config;

import br.com.learn.projetoSpring.model.Empresa;
import br.com.learn.projetoSpring.model.Produto;
import br.com.learn.projetoSpring.model.RegimeTributario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public Empresa getLivro(){
        return new Empresa();
    }

    @Bean
    public Produto getProduto(){
        return new Produto();
    }

    @Bean
    public RegimeTributario getRegimeTributario(){
        return new RegimeTributario();
    }


}
