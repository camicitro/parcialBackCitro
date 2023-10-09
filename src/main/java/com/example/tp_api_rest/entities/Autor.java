package com.example.tp_api_rest.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Autor")
@Getter
@Setter
public class Autor extends Base {

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "biografia", length = 1500)
    private String biografia;


    }
