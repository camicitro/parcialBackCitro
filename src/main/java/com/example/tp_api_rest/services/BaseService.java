package com.example.tp_api_rest.services;

import com.example.tp_api_rest.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;


public interface BaseService<E extends Base, ID extends Serializable> {

    //hacemos ID extends Serializable en vez de colocar Long para poder usar estas bases en cualquier proyecto, aun cuando no tengan un id de tipo Long
    public List<E> findAll() throws Exception;

    //para paginacion:
    public Page<E> findAll(Pageable pageable) throws Exception;

    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;





}
