package com.dh.catalogo.controller;

import com.dh.catalogo.dto.FilmeDto;
import com.dh.catalogo.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    private CatalogoService service;

    @GetMapping("/{genero}")
    public List<FilmeDto> findAllFilmeByGenero(@PathVariable String genero){
        return service.getFilme(genero);
    }
}
