package com.example.tp_api_rest.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Table(name ="Domicilio")
public class Domicilio extends Base {

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    //relacion domicilio a localidad
    @ManyToOne(optional = false) //este optional false indica que la localidad no puede ser nula a la hora de crear un domicilio
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

}
