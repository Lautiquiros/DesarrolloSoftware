package com.example.apirest.Controller;

import com.example.apirest.Entity.Libro;
import com.example.apirest.Service.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>  {

}
