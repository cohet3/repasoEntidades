package com.example.repasoentidades.ejercicioNautico.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="barcos")
public class Barco {
    @Id
    @Column(length = 9, nullable = false)
    private String matricula;
    @Column(nullable = false)
    private int amarre;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private double cuota;

    @ManyToOne
    @JoinColumn(name = "dni", nullable = false, foreignKey = @ForeignKey(name = "FK_barco_socio"))
    private Socio c1;


}
