package com.dh.catalogo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "FILME")
public interface FilmeFeign {
    @RequestMapping(method = RequestMethod.GET, value = "/catalogo/{genero}")
    String findFilme(@PathVariable String genero);
}
