package br.com.learn.projetoSpring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_regimes")
public class RegimeTributario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome_regime", nullable = false)
    private String nome;

    @Column(name = "taxa_regime", nullable = false)
    private double taxa;

}
