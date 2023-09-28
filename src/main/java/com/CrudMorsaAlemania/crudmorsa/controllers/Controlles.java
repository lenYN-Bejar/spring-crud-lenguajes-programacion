package com.CrudMorsaAlemania.crudmorsa.controllers;

import com.CrudMorsaAlemania.crudmorsa.models.Lenguajes;
import com.CrudMorsaAlemania.crudmorsa.services.LenguajeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controlles {

    @Autowired
    private LenguajeServices lenguajeServices;
    @GetMapping("/")
    public String holaMundo() {
        return "Hola Mundo";
    }

    @GetMapping("/lenguaje")
    public List<Lenguajes> getLenguajes() {
        return lenguajeServices.getAllLenguajes();
    }

    @PostMapping("/lenguaje")
    public Lenguajes postLenguaje(@RequestBody Lenguajes lenguajes) {
        return lenguajeServices.crearLengueje(lenguajes);
    }
}
