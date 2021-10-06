package com.joseteles.apiseasolutions.controller;

import com.joseteles.apiseasolutions.models.Setor;
import com.joseteles.apiseasolutions.models.Trabalhador;
import com.joseteles.apiseasolutions.services.TrabalhadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/trabalhador")
public class TrabalhadorController {

    @Autowired
    TrabalhadorService trabalhadorService;

    @PostMapping
    public Trabalhador createTrabalhador(@RequestBody Trabalhador trabalhador){
        return trabalhadorService.saveTrabalhador(trabalhador);
    }

    @GetMapping
    public List<Trabalhador> getTrabalhadorList(){
        return trabalhadorService.findAll();
    }

    @GetMapping("/{idTrabalhador}")
    public ResponseEntity<Trabalhador> getTrabalhadorByID(@PathVariable("idTrabalhador") Long idTrabalhador) throws Exception{
        return ResponseEntity.ok(trabalhadorService.getById(idTrabalhador).orElseThrow(() -> new NoSuchElementException("trabalhador não encontrado.")));
    }

    @PutMapping
    public Trabalhador updateTrabalhador(@RequestBody Trabalhador jornadaTrabalhador){
        return trabalhadorService.updateTrabalhador(jornadaTrabalhador);
    }

    @DeleteMapping ("/{idTrabalhador}")
    public ResponseEntity deleteByID(@PathVariable("idTrabalhador") Long idTrabalhador) throws Exception{
        try{
            trabalhadorService.deleteTrabalhador(idTrabalhador);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Trabalhador>) ResponseEntity.ok();
    }
}
