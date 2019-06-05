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
public class Estudiante {
    private String nombre;
    private ArrayList<Modulo> materias;
    private ArrayList<Grado> notas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<Modulo>();
        this.notas = new ArrayList<Grado>();
    }
    
    public boolean inscribirMaterias(String nombre, ArrayList<Modulo> modulos){
        for (int i = 0; i < modulos.size(); i++) {
            if(modulos.get(i).getNombre().equals(nombre))
                this.materias.add(modulos.get(i));
                
            return true;
        }
        return false;
    }
    
    public void agregarNotas(int nota, String nombre){
        for (int i = 0; i < this.materias.size(); i++) {
            if(this.materias.get(i).getNombre().equals(nombre)){
                this.notas.add(new Grado(nota,this.materias.get(i)));
                this.materias.get(i).getGrados().add(new Grado(nota,this.materias.get(i)));
            }
            
        }
        
    }
    
    public double notaObtenida(String Materia){
        double x = 0;
        int k = 0;
        for (int i = 0; i < this.materias.size(); i++) {
            if(this.materias.get(i).getNombre().equals(Materia)){
                for (int j = 0; j < this.materias.get(i).getGrados().size(); j++) {
                x += this.materias.get(i).getGrados().get(j).getMarca();
                
                k++;
            }
            }
        }
        x = x/k;
        return x;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Modulo> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Modulo> materias) {
        this.materias = materias;
    }

    public ArrayList<Grado> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Grado> notas) {
        this.notas = notas;
    }
    
    
    
    
    
    
    
}
