package com.dh.filme.controller;

import com.dh.filme.model.Filme;
import com.dh.filme.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/filme")
public class FilmeController {

    @Autowired
    private FilmeService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Filme filme){
        service.save(filme);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{genero}")
    public List<Filme> find(@PathVariable String genero){
        return service.findAllFilmeByGenero(genero);
    }
}
