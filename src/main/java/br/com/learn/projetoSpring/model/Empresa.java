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

    @JsonIgnore
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL ) //fetch = FetchType.LAZY
    private List<Produto> produtos = new ArrayList<>();

}

