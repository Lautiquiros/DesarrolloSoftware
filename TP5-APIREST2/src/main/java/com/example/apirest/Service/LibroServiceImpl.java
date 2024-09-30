package com.example.apirest.Service;

import com.example.apirest.Entity.Libro;
import com.example.apirest.Entity.Persona;
import com.example.apirest.Repository.BaseRepository;
import com.example.apirest.Repository.LibroRepository;
import com.example.apirest.Repository.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService{

    @Autowired
    private LibroRepository personaRepository;

    public LibroServiceImpl(BaseRepository<Libro,Long> baseRepository){
        super(baseRepository);
    }
}
