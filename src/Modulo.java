/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author JUANPABLO
 */
public class Modulo {
    private String lector;
    private String nombre;
    private ArrayList<Grado> grados;

    public Modulo(String lector, String nombre) {
        this.lector = lector;
        this.nombre = nombre;
        this.grados = new ArrayList<>();
    }
    
    

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Grado> getGrados() {
        return grados;
    }

    public void setGrados(ArrayList<Grado> grados) {
        this.grados = grados;
    }
    
    
}
