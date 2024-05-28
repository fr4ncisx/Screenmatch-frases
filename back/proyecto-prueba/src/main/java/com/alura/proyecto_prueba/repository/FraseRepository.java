package com.alura.proyecto_prueba.repository;

import com.alura.proyecto_prueba.models.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frases, Long> {
  @Query("SELECT f FROM Frases f WHERE f.id = :idAleatorio")
  public Frases findRandom(Long idAleatorio);
}
