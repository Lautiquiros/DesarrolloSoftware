package com.example.apirest.Controller;

import com.example.apirest.Entity.Domicilio;
import com.example.apirest.Service.DomicilioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio,DomicilioServiceImpl>  {


}
