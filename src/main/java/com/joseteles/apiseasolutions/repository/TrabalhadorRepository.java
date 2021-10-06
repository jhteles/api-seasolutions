package com.joseteles.apiseasolutions.repository;

import com.joseteles.apiseasolutions.models.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long> {
    Trabalhador findById(long id);
}
