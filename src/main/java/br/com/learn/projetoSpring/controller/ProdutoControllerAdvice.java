package br.com.learn.projetoSpring.controller;

import br.com.learn.projetoSpring.exception.NameEmpresaNullException;
import br.com.learn.projetoSpring.exception.NameProdutoNullException;
import br.com.learn.projetoSpring.exception.ProdutoPrecoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@ControllerAdvice
public class ProdutoControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NameProdutoNullException.class)
    public ResponseEntity<Object> getNullException() {
        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Favor informe no body da requisição o campo nome");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    @ExceptionHandler(ProdutoPrecoException.class)
    public ResponseEntity<Object> getPrecoException(){
        Map<String, Object> body = new HashMap<String, Object>();
            body.put("message", "O valor não pode ser menor que zero");

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);

    }

}

