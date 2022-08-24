package br.com.learn.projetoSpring.validation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaValidation {


    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    //@Positive(message = "O Id do aluno precisa ser positivo.")
    private Long regime_id;




}
