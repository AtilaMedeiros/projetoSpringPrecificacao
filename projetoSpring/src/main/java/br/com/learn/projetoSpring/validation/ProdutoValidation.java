package br.com.learn.projetoSpring.validation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoValidation {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    //@NotNull(message = "Preencha o campo corretamente.")
    //@Positive(message = "${validatedValue}' precisa ser positivo.")
    //@DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
    private double precoCompra;

    //@Positive(message = "O Id do aluno precisa ser positivo.")
    private Long empresa_id;


}


/*
*    @NotNull(message = "Prencha o campo corretamente.")
*    @Past(message = "Data '${validatedValue}' é inválida.")
*    private LocalDate dataDeNascimento;
*
*    @NotEmpty(message = "Preencha o campo corretamente.")
*    @CPF(message = "'${validatedValue}' é inválido!")
*    private String cpf;
*
* */
