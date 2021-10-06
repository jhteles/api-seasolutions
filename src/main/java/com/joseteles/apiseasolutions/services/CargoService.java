package com.joseteles.apiseasolutions.services;

import com.joseteles.apiseasolutions.models.Cargo;
import com.joseteles.apiseasolutions.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {

    CargoRepository cargoRepository;

    @Autowired
    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public Cargo saveCargo(Cargo cargo){
        return cargoRepository.save(cargo);
    }

    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    public Optional<Cargo> getById(Long idCargo) {
        return cargoRepository.findById(idCargo);
    }

    public Cargo updateCargo(Cargo cargo){
        return cargoRepository.save(cargo);
    }

    public void deleteCargo(Long idCargo) {
        cargoRepository.deleteById(idCargo);
    }
}