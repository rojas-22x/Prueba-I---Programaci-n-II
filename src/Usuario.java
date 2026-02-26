
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class Usuario {
    private String nombre, correo, mensaje; 
    private ArrayList<Usuario> listaUsuarios; 
            
    public Usuario(String nombre, String correo){
      this.nombre = nombre; 
      this.correo = correo; 
    }
    
    //Inicializo ArrayList
    public Usuario(){
        listaUsuarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void addListaUsuarios(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
     @Override
     public String toString(){
         return "Nombre: " + this.nombre + " - Correo: " + this.correo;
     }
    
}
