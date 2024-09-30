package com.example.apirest.Controller;

import com.example.apirest.Entity.Localidad;
import com.example.apirest.Service.LocalidadServiceImpl;
import com.example.apirest.Service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>  {


}
