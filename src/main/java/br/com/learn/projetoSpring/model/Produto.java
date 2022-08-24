package br.com.learn.projetoSpring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    //@Column(nullable = false)
    private double precoCompra;

    @ManyToOne()
    @JoinColumn(name = "empresa_id") //, nullable = false
    private Empresa empresa;

}


//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//configuramos a inicialização lazy do hibernate pois estamos usando FetchType.LAZY

/*  mappedBy => dentro da tabela produtos, qual o campo que corresponde a empresa? foi informado quando usamos List var
    FetchType.LAZY => somente carrega tudo se tiver um endpoit proprio.
    @OneToMany => uma empresa tem muitos produtos
    CascadeType.ALL =>  alteração feita em Produto vai REPERCUTIR na tabela Empresa. Se excluir um produto excluiria tambem a empresa associada
    @JoinColumn => A coluna empresa vai aparecer dentro de produto
    @JsonIgnore ==> configuramos isso quando usamos o FetchType.LAZY
*/
