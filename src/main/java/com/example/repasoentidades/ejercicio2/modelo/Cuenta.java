package com.example.repasoentidades.ejercicio2.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="cuentas")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCuenta;
    @Column(length = 60, nullable = false)
    private String estado;
    @Column(nullable = false)
    private double saldo;


    @ManyToOne
    @JoinColumn(name = "dni", nullable = false, foreignKey = @ForeignKey(name = "FK_cuentas_clientes"))
    private Cliente c1;

    //  private String NIF;
}
