package com.joseteles.apiseasolutions.services;

import com.joseteles.apiseasolutions.models.Setor;
import com.joseteles.apiseasolutions.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SetorService {

    SetorRepository setorRepository;

    @Autowired
    public SetorService(SetorRepository setorRepository) {
        this.setorRepository = setorRepository;
    }

    public Setor saveSetor(Setor setor){
        return setorRepository.save(setor);
    }

    public List<Setor> findAll() {
        return setorRepository.findAll();
    }

    public Optional<Setor> getById(Long idSetor) {
        return setorRepository.findById(idSetor);
    }

    public Setor updateSetor(Setor setor){
        return setorRepository.save(setor);
    }

    public void deleteSetor(Long idSetor) {
        setorRepository.deleteById(idSetor);
    }
}
