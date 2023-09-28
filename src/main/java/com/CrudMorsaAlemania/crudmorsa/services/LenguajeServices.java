package com.CrudMorsaAlemania.crudmorsa.services;

import com.CrudMorsaAlemania.crudmorsa.models.Lenguajes;
import com.CrudMorsaAlemania.crudmorsa.repository.ILenguajesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LenguajeServices {
    @Autowired
    ILenguajesRepository ilenguajesRepository;

    public List<Lenguajes> getAllLenguajes() {
        return ilenguajesRepository.findAll();
    }


    public Lenguajes crearLengueje(Lenguajes lenguajes) {
        return ilenguajesRepository.save(lenguajes);
    }

    public Lenguajes edidLenguaje(Lenguajes lenguajes, Integer id) {
        Lenguajes lenguajeById = ilenguajesRepository.findById(id).get();
        lenguajeById.setNombre(lenguajes.getNombre());
        lenguajeById.setTipado_fuerte(lenguajes.getTipado_fuerte());
        lenguajeById.setFecha_lanzamiento(lenguajes.getFecha_lanzamiento());
        ilenguajesRepository.save(lenguajeById);
        return lenguajeById;
    }
}
