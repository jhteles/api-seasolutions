package com.joseteles.apiseasolutions.services;

import com.joseteles.apiseasolutions.models.Trabalhador;
import com.joseteles.apiseasolutions.repository.TrabalhadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrabalhadorService {

    TrabalhadorRepository trabalhadorRepository;

    @Autowired
    public TrabalhadorService(TrabalhadorRepository trabalhadorRepository) {
        this.trabalhadorRepository = trabalhadorRepository;
    }

    public Trabalhador saveTrabalhador(Trabalhador trabalhador){
        return trabalhadorRepository.save(trabalhador);
    }

    public List<Trabalhador> findAll() {
        return trabalhadorRepository.findAll();
    }

    public Optional<Trabalhador> getById(Long idTrabalhador) {
        return trabalhadorRepository.findById(idTrabalhador);
    }

    public Trabalhador updateTrabalhador(Trabalhador trabalhador){
        return trabalhadorRepository.save(trabalhador);
    }

    public void deleteTrabalhador(Long idTrabalhador) {
        trabalhadorRepository.deleteById(idTrabalhador);
    }
}
