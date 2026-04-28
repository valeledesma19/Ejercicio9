package com.example.ejercicio10.controllers;

import com.example.ejercicio10.models.Producto;
import com.example.ejercicio10.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoRepository productoRepository;

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    @GetMapping
    public Iterable<Producto> listarProductos() {
        return productoRepository.findAll();
    }
}
