package com.dh.catalogo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    private String urlStream;
}
