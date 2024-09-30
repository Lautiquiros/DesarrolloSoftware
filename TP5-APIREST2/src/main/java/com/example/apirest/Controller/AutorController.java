package com.example.apirest.Controller;

import com.example.apirest.Entity.Autor;
import com.example.apirest.Service.AutorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api/autores")
public class AutorController extends BaseControllerImpl<Autor,AutorServiceImpl> {



}
