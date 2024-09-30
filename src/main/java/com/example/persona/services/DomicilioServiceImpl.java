package com.example.persona.services;

import com.example.persona.entities.Domicilio;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiseImpl<Domicilio,Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio,Long> baseRepository){
        super(baseRepository);
    }
}
