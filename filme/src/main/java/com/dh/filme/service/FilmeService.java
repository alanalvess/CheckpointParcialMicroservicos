package com.dh.filme.service;

import com.dh.filme.model.Filme;

import java.util.List;

public interface FilmeService {
    void save(Filme filme);
    List<Filme> findAllFilmeByGenero(String genero);
}
