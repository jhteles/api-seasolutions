package com.joseteles.apiseasolutions.repository;

import com.joseteles.apiseasolutions.models.Cargo;
import com.joseteles.apiseasolutions.models.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    Cargo findById(long id);
}
