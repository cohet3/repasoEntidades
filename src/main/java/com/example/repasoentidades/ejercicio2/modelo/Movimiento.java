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
@Table(name="movimientos")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovimiento;
    @Column(length = 60, nullable = false)
    private LocalDate fecha;
    @Column(length = 60, nullable = false)
    private String tipoMovimiento;
    @Column(nullable = false)
    private double cantidad;


    @ManyToOne
    @JoinColumn(name = "idCuenta", nullable = false, foreignKey = @ForeignKey(name = "FK_movimientos_clientes"))
    private Cuenta idCuenta;
}
