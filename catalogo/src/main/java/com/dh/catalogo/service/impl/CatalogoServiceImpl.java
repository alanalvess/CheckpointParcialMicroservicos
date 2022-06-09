package com.dh.catalogo.service.impl;

import com.dh.catalogo.service.CatalogoService;
import com.dh.catalogo.service.FilmeFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogoServiceImpl implements CatalogoService {

    @Autowired
    private FilmeFeign filme;

    @Override
    public String getFilme(String genero) {
        return filme.findFilme(genero);
    }
}
