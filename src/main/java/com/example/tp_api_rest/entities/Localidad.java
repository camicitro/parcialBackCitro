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
@Table(name ="Localidad")
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;

   }
