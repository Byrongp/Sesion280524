    package Controlador;

import Modelo.ModeloPrincipal;
import Vista.VistaProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener {

    ModeloPrincipal modelo;

    public ControladorPrincipal(ModeloPrincipal modelo) {
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modelo.getVista().btnProductos.getActionCommand())) {
            VistaProductos vproductos = new VistaProductos();
            vproductos.setVisible(true);
        } else {
            System.out.println("No ingreso...");

        }
    }
}
