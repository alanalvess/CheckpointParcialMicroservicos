package com.dh.filme.service.impl;

import com.dh.filme.model.Filme;
import com.dh.filme.repository.FilmeRepository;
import com.dh.filme.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeServiceImpl implements FilmeService {

    @Autowired
    private FilmeRepository repository;

    @Override
    public void save(Filme filme) {
        repository.save(filme);
    }

    @Override
    public List<Filme> findAllFilmeByGenero(String genero) {
        return repository.findAllFilmeByGenero(genero);
    }
}
