package com.example.persona.services;

import com.example.persona.entities.Libro;
import com.example.persona.entities.Localidad;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiseImpl<Libro,Long> implements LibroService{

    @Autowired
    private LocalidadRepository localidadRepository;

    public LibroServiceImpl(BaseRepository<Libro,Long> baseRepository){
        super(baseRepository);
    }

}
