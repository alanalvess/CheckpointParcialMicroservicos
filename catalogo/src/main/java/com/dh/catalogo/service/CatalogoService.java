package com.dh.catalogo.service;

import com.dh.catalogo.dto.FilmeDto;

import java.util.List;

public interface CatalogoService {
    List<FilmeDto> getFilme(String genero);
}
