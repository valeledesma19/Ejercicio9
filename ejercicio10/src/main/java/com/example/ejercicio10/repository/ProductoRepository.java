package com.example.ejercicio10.repository;

import com.example.ejercicio10.models.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
}