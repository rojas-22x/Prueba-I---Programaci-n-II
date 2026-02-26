
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author laboratorio
 */
public class App {

    private static ServicioUsuario lg = new ServicioUsuario();
    private static Usuario usuario = new Usuario();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre: ");
            usuario.setNombre(sc.nextLine());
            System.out.print("Ingrese su correo electronico: ");
            usuario.setCorreo(sc.nextLine());

            lg.guardar(usuario);
            System.out.println(usuario.getMensaje());
            lg.listarUsuarios(usuario);
            
            //Mostrar lista de usuarios
            for (Usuario u : usuario.getListaUsuarios()) {
                System.out.println(u);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            //for each para recorrer e imprimir suprimidas de las clases que no se cerraron como clasep
            for (Throwable sup : e.getSuppressed()) {
                System.out.println(sup.getMessage());
            }
            
        } 
        //Exception general
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
