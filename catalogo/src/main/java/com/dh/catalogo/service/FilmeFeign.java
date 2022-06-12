package com.dh.catalogo.service;

import com.dh.catalogo.dto.FilmeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "FILME")
public interface FilmeFeign {
    @RequestMapping(method = RequestMethod.GET, value = "/filme/{genero}")
    List<FilmeDto> findAllFilmeByGenero(@PathVariable String genero);
}
