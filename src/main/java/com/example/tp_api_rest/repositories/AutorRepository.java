package com.example.tp_api_rest.repositories;

import com.example.tp_api_rest.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.tp_api_rest.entities.Autor;

import java.util.List;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long>{

    //buscar por nombre o apellido de autor con JPQL usando parametros indexados:
    @Query(value = "SELECT a FROM Autor a WHERE a.nombre LIKE %:filtro% OR a.apellido LIKE %:filtro% ")
    List<Autor> searchAutor(@Param("filtro") String filtro);




    //PAGINACION:
    //buscar por nombre o apellido de autor con JPQL usando nativas:
    @Query(
            value = "SELECT * FROM Autor WHERE Autor.nombre LIKE %:filtro% OR Autor.apellido LIKE %:filtro% ",
            countQuery =  "SELECT count(*) FROM Autor",  //esto se agrega pq en las nativas no es automatica la paginacion
            nativeQuery = true
    )
    Page<Autor> searchAutorPaged(@Param("filtro") String filtro, Pageable pageable);

}
