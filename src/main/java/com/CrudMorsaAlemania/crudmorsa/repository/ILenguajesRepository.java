package com.CrudMorsaAlemania.crudmorsa.repository;

import com.CrudMorsaAlemania.crudmorsa.models.Lenguajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ILenguajesRepository extends JpaRepository<Lenguajes, Integer> {
}
