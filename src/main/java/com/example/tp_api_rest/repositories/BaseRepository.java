package com.example.tp_api_rest.repositories;

import com.example.tp_api_rest.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean //esto ahce q de esta interfaz no se puedan crear instancias
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {


}
