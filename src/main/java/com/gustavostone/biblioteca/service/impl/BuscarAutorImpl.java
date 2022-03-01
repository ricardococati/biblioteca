package com.gustavostone.biblioteca.service.impl;

import com.gustavostone.biblioteca.model.Autor;
import com.gustavostone.biblioteca.repository.BuscarAutorRepository;
import com.gustavostone.biblioteca.service.BuscarAutor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BuscarAutorImpl implements BuscarAutor {

    private final BuscarAutorRepository autorRepository;

    @Override
    public List<Autor> buscarTodosAutores() {
        return autorRepository.findAll();
    }
}
