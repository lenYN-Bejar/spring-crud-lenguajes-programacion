package com.CrudMorsaAlemania.crudmorsa.models;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "lenguajes")
public class Lenguajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String nombre;
    private Boolean tipado_fuerte;
    private Date fecha_lanzamiento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTipado_fuerte() {
        return tipado_fuerte;
    }

    public void setTipado_fuerte(Boolean tipado_fuerte) {
        this.tipado_fuerte = tipado_fuerte;
    }

    public Date getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(Date fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }
}
