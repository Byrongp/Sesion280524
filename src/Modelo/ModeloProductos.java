package Modelo;

import Vista.VistaProductos;

public class ModeloProductos {

    private int codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    private VistaProductos vista;

    public ModeloProductos() {

    }

    public ModeloProductos(VistaProductos vista) {
        this.vista = vista;

    }

    public VistaProductos getVista() {
        return vista;
    }

    public void setVista(VistaProductos vista) {
        this.vista = vista;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
