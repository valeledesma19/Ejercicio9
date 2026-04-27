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
public class Campo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Double hectareasTotales;

    @ManyToOne
    @JoinColumn(name = "productor_id")
    private Productor productor;

    @OneToMany(mappedBy = "campo", cascade = CascadeType.ALL)
    private List<Lote> lotes = new ArrayList<>();
}
