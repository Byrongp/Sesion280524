package Controlador;

import Modelo.ModeloProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorProductos implements ActionListener {

    ModeloProductos modelo;
    ArrayList<ModeloProductos> baseDatos = new ArrayList<>();

    public ControladorProductos(ModeloProductos modelo) {
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(modelo.getVista().btnAgregar.getActionCommand())) {
            agregarProducto();
        } else if (e.getActionCommand().equals(modelo.getVista().btnBuscar.getActionCommand())) {
            buscarProducto();
        }
    }    
    
    public void agregarProducto(){
        try {
            ModeloProductos producto = new ModeloProductos();
            producto.setCodigo(Integer.parseInt(modelo.getVista().txtCodigo.getText()));
            producto.setNombre(modelo.getVista().txtNombre.getText());
            producto.setCantidad(Integer.parseInt(modelo.getVista().txtCantidad.getText()));
            producto.setPrecio(Double.parseDouble(modelo.getVista().txtPrecio.getText()));
            baseDatos.add(producto);
            JOptionPane.showMessageDialog(null, "Producto agregado con exito", "Agregar productos", JOptionPane.INFORMATION_MESSAGE);
            limpiarTextos();
        } catch (NumberFormatException ex ){    
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros enteros en el codigo o decimales en los precios", "Solamente numeros", JOptionPane.ERROR_MESSAGE);
            modelo.getVista().txtCodigo.setText("0");
            modelo.getVista().txtCantidad.setText("0");
            modelo.getVista().txtPrecio.setText("0");
        }
        

        }    
    
    public void buscarProducto(){
        for(int i = 0; i < baseDatos.size();i++){
            if(baseDatos.get(i).getCodigo() == Integer.parseInt(modelo.getVista().lookCodigo.getText()));
            modelo.getVista().lookNombre.setText(baseDatos.get(i).getNombre());
            modelo.getVista().lookCantidad.setText(String.valueOf(baseDatos.get(i).getCantidad()));
            modelo.getVista().lookPrecio.setText(String.valueOf(baseDatos.get(i).getPrecio()));
        }
    }
    
    public void limpiarTextos(){    
        modelo.getVista().txtCodigo.setText("");
        modelo.getVista().txtNombre.setText("");
        modelo.getVista().txtCantidad.setText("");
        modelo.getVista().txtPrecio.setText("");
    }
    
    public void mostrarMensaje(String mensaje, String titulo, int tipoMensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);
    }
}
