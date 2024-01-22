package com.example.repasoentidades.ejercicio2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="cuenta_ahorro")
public class CuentaAhorro extends Cuenta{
    @Id
    private int idCuenta;
    @Column(nullable = false)
    private double interesMensual;

    @OneToOne
    @JoinColumn(name = "id_cuenta", nullable = false, foreignKey = @ForeignKey(name = "FK_cuenta_ahorro_cuenta"))
    private Cuenta cuenta;

}
