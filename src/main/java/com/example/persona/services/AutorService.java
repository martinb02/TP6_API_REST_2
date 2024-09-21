package com.example.persona.services;

import com.example.persona.entities.Autor;
import com.example.persona.repositories.AutorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService implements BaseService<Autor> {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    @Transactional
    public List<Autor> findAll() throws Exception {
        try {
            return autorRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Autor findById(Long id) throws Exception {
        try {
            Optional<Autor> entityOptional = autorRepository.findById(id);
            return entityOptional.orElseThrow(() -> new Exception("No encontrado"));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Autor save(Autor entity) throws Exception {
        try {
            return autorRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Autor update(Long id, Autor entity) throws Exception {
        try {
            Optional<Autor> entityOptional = autorRepository.findById(id);
            Autor autor = entityOptional.orElseThrow(() -> new Exception("No encontrado"));
            autor.setNombre(entity.getNombre());
            autor.setApellido(entity.getApellido());
            return autorRepository.save(autor);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (autorRepository.existsById(id)) {
                autorRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No encontrado");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
