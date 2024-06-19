package Controlador;

import Modelo.ModeloUsuario;
import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorUsuario implements ActionListener {

    String user = "mpazl";
    String pass = "12345";

    ModeloUsuario modelo;

    public ControladorUsuario(ModeloUsuario modelo) {
        this.modelo = modelo;
    }

    public boolean validarUsuario() {
        if (modelo.getVista().txtUsuario.getText().equals(user)
                && String.valueOf(modelo.getVista().txtPassword.getPassword()).equals(pass)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modelo.getVista().btnIngresar.getActionCommand())) {
            if (validarUsuario()) {
                VistaPrincipal vprincipal = new VistaPrincipal();
                vprincipal.setVisible(true);
                modelo.getVista().dispose();
            } else {
                System.out.println("No ingreso...");
            }
        }
    }
}
