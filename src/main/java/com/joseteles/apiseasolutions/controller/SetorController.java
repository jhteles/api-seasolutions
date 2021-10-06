package com.joseteles.apiseasolutions.controller;

import com.joseteles.apiseasolutions.models.Cargo;
import com.joseteles.apiseasolutions.models.Setor;
import com.joseteles.apiseasolutions.services.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/setor")
public class SetorController {

    @Autowired
    SetorService setorService;

    @PostMapping
    public Setor createSetor(@RequestBody Setor setor){
        return setorService.saveSetor(setor);
    }

    @GetMapping
    public List<Setor> getSetorList(){
        return setorService.findAll();
    }

    @GetMapping("/{idSetor}")
    public ResponseEntity<Setor> getSetorByID(@PathVariable("idSetor") Long idSetor) throws Exception{
        return ResponseEntity.ok(setorService.getById(idSetor).orElseThrow(() -> new NoSuchElementException("setor não encontrado.")));
    }

    @PutMapping
    public Setor updateSetor(@RequestBody Setor jornadaSetor){
        return setorService.updateSetor(jornadaSetor);
    }

    @DeleteMapping ("/{idSetor}")
    public ResponseEntity deleteByID(@PathVariable("idSetor") Long idSetor) throws Exception{
        try{
            setorService.deleteSetor(idSetor);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Setor>) ResponseEntity.ok();
    }
}
