package com.example.tp_api_rest.services;


import com.example.tp_api_rest.entities.Localidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long>{

    List<Localidad> searchLocalidad(String filtro) throws Exception;

    //PAGINACION:
    Page<Localidad> searchLocalidadPaged(String filtro, Pageable pageable) throws Exception;


}
