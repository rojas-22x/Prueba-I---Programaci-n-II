
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author laboratorio
 */
public class UsuarioDAOArchivo {

    private String nombreArchivo, registro;
    private ArrayList<String> listaRegistros;

    public UsuarioDAOArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        listaRegistros = new ArrayList<>();
    }

    //constructor en blanco
    public UsuarioDAOArchivo() {

    }

    public String guardarRegistro() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.nombreArchivo, true))) {
            //Llamo al objeto, append y le pasa el registro
            bw.append(this.registro);
            
            bw.newLine();
        }
        return "--- Registro almacenado correctamente ---";
    }

    public void listarRegistros() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(this.nombreArchivo))) {
            
            while ((this.registro = br.readLine()) != null) {

                //Almaceno en lista de registro que le pertenece a acceso a datos
                this.listaRegistros.add(registro);

            }
        }
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public ArrayList<String> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(String registro) {
        this.listaRegistros.add(registro);
    }
}
