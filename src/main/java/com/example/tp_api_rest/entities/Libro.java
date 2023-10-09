package com.example.tp_api_rest.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Table(name ="Libro")
public class Libro extends Base {

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    @Column(name = "titulo")
    private String titulo;

    //relacion libro a autor
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;

    public void agregarAutor (Autor autor){
        autores.add(autor);
    }
    public void mostrarAutores(){
        for (Autor autor: autores){
            System.out.println("Apellido: " + autor.getApellido() + ", Nombre: " + autor.getNombre() );
        }
    }

}
