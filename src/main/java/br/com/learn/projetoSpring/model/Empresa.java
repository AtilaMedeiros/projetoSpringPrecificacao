package br.com.learn.projetoSpring.model;


import br.com.learn.projetoSpring.validation.ProdutoValidation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_empresas")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @OneToOne()
    @JoinColumn(name = "regime_id", nullable = false)
    private RegimeTributario regime;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL ) //fetch = FetchType.LAZY
    @JsonIgnore
    private List<Produto> produtos = new ArrayList<>();

}


//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//configuramos a inicialização lazy do hibernate pois estamos usando FetchType.LAZY

/*
\    mappedBy =>  O campo que você informa o atributo dono do relacionamento. Este elemento é especificado apenas no lado inverso (não proprietário) da associação.
    FetchType.LAZY => somente carrega tudo se tiver um endpoit proprio.
    @OneToMany => uma empresa tem muitos produtos
    CascadeType.ALL => alteração feita em Empresa vai REPERCUTIR em produtos. se excluir a empresa, vai excluir os produtos associado a ela
    @JoinColumn => A coluna produtos vai aparecer dentro de Empresa. CUIDADO, não pode usar quando for uma list
    @JsonIgnore ==> configuramos isso quando usamos o FetchType.LAZY / não é obrigado enviar no json
*/
