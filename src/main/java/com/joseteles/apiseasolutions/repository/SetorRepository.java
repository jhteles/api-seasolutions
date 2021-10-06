package com.joseteles.apiseasolutions.repository;

import com.joseteles.apiseasolutions.models.Setor;
import com.joseteles.apiseasolutions.models.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SetorRepository extends JpaRepository<Setor, Long> {
    Setor findById(long id);
}
