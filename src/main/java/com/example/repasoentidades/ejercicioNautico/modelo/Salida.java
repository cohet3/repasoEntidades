package com.example.repasoentidades.ejercicioNautico.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="salidas")
public class Salida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalida;
    @Column( nullable = false)
    private LocalDate fechaSalida;
    @Column(nullable = false)
    private LocalTime horaSalida;
    @Column(length = 120, nullable = false)
    private String destino;

    @ManyToOne
    @JoinColumn(name = "matricula", nullable = false, foreignKey = @ForeignKey(name = "FK_salidas_barcos"))
    private Barco barco;

    @ManyToOne
    @JoinColumn(name = "dni", nullable = false, foreignKey = @ForeignKey(name = "FK_salidas_patrones"))
    private Patron patron;

}
