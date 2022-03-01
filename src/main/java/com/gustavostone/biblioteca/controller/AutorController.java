package com.gustavostone.biblioteca.controller;

import com.gustavostone.biblioteca.model.Autor;
import com.gustavostone.biblioteca.service.BuscarAutor;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/autor")
@Api(value = "api/v1/autor", consumes = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class AutorController {

    private final BuscarAutor service;

    @GetMapping
    public ResponseEntity<List<Autor>> buscarTodos() throws Exception {
        List<Autor> autorList = service.buscarTodosAutores();
        return ResponseEntity.ok(autorList);
    }

}
