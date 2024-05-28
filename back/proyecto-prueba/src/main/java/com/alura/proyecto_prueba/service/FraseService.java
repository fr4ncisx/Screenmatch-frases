package com.alura.proyecto_prueba.service;

import com.alura.proyecto_prueba.models.Frases;
import com.alura.proyecto_prueba.models.dto.FrasesDTO;
import com.alura.proyecto_prueba.repository.FraseRepository;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

  @Autowired
  private FraseRepository repository;

  public FrasesDTO getData() {
    Random rnd = new Random();
    Long idAleatorio = rnd.nextLong(1, 11);
    Frases frases = repository.findRandom(idAleatorio);
    return new FrasesDTO(
      frases.getTitulo(),
      frases.getFrase(),
      frases.getPersonaje(),
      frases.getPoster()
    );
  }
}
