package Clases;

import java.time.LocalDate;

public class Producto {
    private long id;
    private String nombre;
    private LocalDate fechaCreacion;
    private String descripcion;

    public void insertarProducto() {
        System.out.println("Producto añadido");
    }
}
