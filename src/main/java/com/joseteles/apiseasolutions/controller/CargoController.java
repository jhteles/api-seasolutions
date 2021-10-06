package com.joseteles.apiseasolutions.controller;

import com.joseteles.apiseasolutions.models.Cargo;
import com.joseteles.apiseasolutions.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/cargo")
public class CargoController {

    @Autowired
    CargoService cargoService;

    @PostMapping
    public Cargo createCargo(@RequestBody Cargo cargo){
        return cargoService.saveCargo(cargo);
    }

    @GetMapping
    public List<Cargo> getCargoList(){
        return cargoService.findAll();
    }

    @GetMapping("/{idCargo}")
    public ResponseEntity<Cargo> getCargoByID(@PathVariable("idCargo") Long idCargo) throws Exception{
        return ResponseEntity.ok(cargoService.getById(idCargo).orElseThrow(() -> new NoSuchElementException("cargo não encontrado.")));
    }

    @PutMapping
    public Cargo updateCargo(@RequestBody Cargo jornadaCargo){
        return cargoService.updateCargo(jornadaCargo);
    }

    @DeleteMapping ("/{idCargo}")
    public ResponseEntity deleteByID(@PathVariable("idCargo") Long idCargo) throws Exception{
        try{
            cargoService.deleteCargo(idCargo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Cargo>) ResponseEntity.ok();
    }
}

