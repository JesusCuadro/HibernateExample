
package view;

import controllers.usuarioController;

public class usuarioView {
    public static void main(String[] args) {
        
//        String usuario = new usuarioController().createUsuario("Santiago", "Mendez", "Bogota");
        String usuario = new usuarioController().deleteUsuario(4);

                
        System.out.println(usuario);
    }
}
