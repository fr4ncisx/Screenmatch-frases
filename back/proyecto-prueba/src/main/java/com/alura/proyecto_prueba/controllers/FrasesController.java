package com.alura.proyecto_prueba.controllers;

import com.alura.proyecto_prueba.models.dto.FrasesDTO;
import com.alura.proyecto_prueba.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series/")
public class FrasesController {

  @Autowired
  private FraseService service;

  @GetMapping("/frases")
  public FrasesDTO mostrarFraseAleatoria() {
    return service.getData();
  }
}
