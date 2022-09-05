package br.com.learn.projetoSpring.controller;

import br.com.learn.projetoSpring.exception.NameEmpresaNullException;
import br.com.learn.projetoSpring.exception.RegimeEmpresaNullException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

//ResponseEntityExceptionHandler é uma classe base para @ControllerAdviceclasses que desejam fornecer tratamento de exceção
// centralizado em todos os @RequestMappingmétodos por meio de @ExceptionHandlermétodos.

//get any error from endpoint
@ControllerAdvice
public class EmpresaControllerAdvice extends ResponseEntityExceptionHandler {

    //Quando acontecer um erro, chama EmpresaNullExceptin
    @ExceptionHandler(NameEmpresaNullException.class)
    public ResponseEntity<Object> capturaErroNullName(){

        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Favor informe no body da requisição o campo nome");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);

    }

    @ExceptionHandler(RegimeEmpresaNullException.class)
    public ResponseEntity<Object> capturaErroNullRegime() {
        Map<String, Object> messageErro = new HashMap<String, Object>();
        messageErro.put("message", "Favor informe no body a requisição o campo regime_id");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messageErro);


    }

}
