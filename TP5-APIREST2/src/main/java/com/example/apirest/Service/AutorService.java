package com.example.apirest.Service;

import com.example.apirest.Entity.Autor;
import com.example.apirest.Repository.AutorRepository;
import com.example.apirest.Repository.BaseRepository;
import com.example.apirest.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface AutorService extends BaseService<Autor, Long> {



}
