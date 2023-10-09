package com.example.tp_api_rest;

import com.example.tp_api_rest.entities.*;
import com.example.tp_api_rest.repositories.AutorRepository;
import com.example.tp_api_rest.repositories.LocalidadRepository;
import com.example.tp_api_rest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class TpApiRestApplication {

	@Autowired
	LocalidadRepository localidadRepository;

	@Autowired
	PersonaRepository personaRepository;

	@Autowired
	AutorRepository autorRepository;
	public static void main(String[] args) {
		SpringApplication.run(TpApiRestApplication.class, args);
		System.out.println("Estoy funcionando!");
	}




}
