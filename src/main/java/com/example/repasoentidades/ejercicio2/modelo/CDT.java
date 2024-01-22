package com.example.repasoentidades.ejercicio2.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="cdts")
public class CDT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInversion;
    @Column(nullable = false)
   private LocalDate mesApertura;
    @Column(nullable = false)
   private double interesesMensuales;
    @Column(nullable = false)
   private double valorInversion;
    @Column(length = 5, nullable = false)
   private String estado_cdt;


    @ManyToOne
    @JoinColumn(name = "idCuenta", nullable = false, foreignKey = @ForeignKey(name = "FK_CDTS_cuenta"))
    private Cuenta cuenta;


    //private int
}
