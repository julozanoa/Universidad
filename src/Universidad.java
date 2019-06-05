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
public class Universidad {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Modulo> modulos;

    public Universidad() {
        this.estudiantes = new ArrayList<Estudiante>();
        this.modulos = new ArrayList<Modulo>();
        
    }
    
    public boolean añadirEstudiantes(String nombre){
        for (int i = 0; i < this.estudiantes.size(); i++) {
            if(this.estudiantes.get(i).equals(nombre)){
                return false;
            }
        }
        this.estudiantes.add(new Estudiante(nombre));
        return true;
    }
    
    public boolean añadirModulos(String nombre, String lector){
        for (int i = 0; i < this.modulos.size(); i++) {
            if(this.modulos.get(i).getNombre().equals(nombre)&& this.modulos.get(i).getLector().equals(lector)){
                return false;
            }
        }
        this.modulos.add(new Modulo(lector,nombre));
        return true;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }
    
    
    
    
}
