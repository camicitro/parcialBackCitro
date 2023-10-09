package com.example.tp_api_rest.services;


import com.example.tp_api_rest.entities.Localidad;

import com.example.tp_api_rest.entities.Persona;
import com.example.tp_api_rest.repositories.BaseRepository;
import com.example.tp_api_rest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Localidad> searchLocalidad(String filtro) throws Exception {
        try {
            List<Localidad> localidades = localidadRepository.searchLocalidad(filtro);
            return localidades;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


    //PAGINACION:
    @Override
    public Page<Localidad> searchLocalidadPaged(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Localidad> localidades = localidadRepository.searchLocalidadPaged(filtro, pageable);
            return localidades;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
