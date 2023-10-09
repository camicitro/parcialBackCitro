package com.example.tp_api_rest.services;

import com.example.tp_api_rest.entities.Autor;
import com.example.tp_api_rest.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AutorService extends BaseService<Autor, Long>{


    List<Autor> searchAutor(String filtro) throws Exception;

    //paginacion:
    Page<Autor> searchAutorPaged(String filtro, Pageable pageable) throws Exception;


}
