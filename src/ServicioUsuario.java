
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author laboratorio
 */
public class ServicioUsuario {

    private UsuarioDAOArchivo datos = null;

    public void guardar(Usuario usuario) throws IOException {
        datos = new UsuarioDAOArchivo("datos.txt");
        datos.setRegistro(usuario.getNombre() + ", " + usuario.getCorreo());
        usuario.setMensaje(datos.guardarRegistro());
    }

    public void listarUsuarios(Usuario usuario) throws IOException {
        datos = new UsuarioDAOArchivo("datos.txt");
        datos.listarRegistros();

        for (String registro : datos.getListaRegistros()) {
            
            String[] partes = registro.split(", ");
            String nombre = partes[0].trim();
            String correo = partes[1].trim();
            Usuario us = new Usuario(nombre, correo);
            usuario.addListaUsuarios(us);

            //Agrego la persona nueva que se viene del objeto persona
            //usuario.addListaUsuarios(us);
        }
    }
}
