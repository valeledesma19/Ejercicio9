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
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private Double superficie;

    @ManyToOne
    @JoinColumn(name = "campo_id")
    private Campo campo;

    @ManyToOne
    @JoinColumn(name = "suelo_id")
    private Suelo suelo;

    @OneToMany(mappedBy = "lote", cascade = CascadeType.ALL)
    private List<Siembra> siembras = new ArrayList<>();
}