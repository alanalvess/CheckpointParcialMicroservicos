package com.dh.catalogo.service.impl;

import com.dh.catalogo.dto.FilmeDto;
import com.dh.catalogo.service.CatalogoService;
import com.dh.catalogo.service.FilmeFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoServiceImpl implements CatalogoService {

    @Autowired
    private FilmeFeign filme;

    @Override
    public List<FilmeDto> getFilme(String genero) {
        return filme.findAllFilmeByGenero(genero);
    }
}
