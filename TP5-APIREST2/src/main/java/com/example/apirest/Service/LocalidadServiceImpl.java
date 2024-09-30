package com.example.apirest.Service;

import com.example.apirest.Entity.Localidad;
import com.example.apirest.Entity.Persona;
import com.example.apirest.Repository.BaseRepository;
import com.example.apirest.Repository.LocalidadRepository;
import com.example.apirest.Repository.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository personaRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository){
        super(baseRepository);
    }
}
