package com.example.agro.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Productor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String cuit;

    @OneToOne(mappedBy = "productor", cascade = CascadeType.ALL)
    private PerfilProductor perfil;

    @OneToMany(mappedBy = "productor", cascade = CascadeType.ALL)
    private List<Campo> campos = new ArrayList<>();
}