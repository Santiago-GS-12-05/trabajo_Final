package ar.org.centro8.java.curso.proyecto_final_poo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private Integer id;
    private String nombre;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stock;
}
