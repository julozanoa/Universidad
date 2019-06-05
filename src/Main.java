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
public class Main {
    public static void main(String[] args) {
        
        Universidad u = new Universidad();
        Scanner s = s = new Scanner(System.in);
        
        System.out.println("Cuantos Estudiantes desea añadir?");
        String neS = s.nextLine();
        int ne = Integer.parseInt(neS);
        for (int i = 0; i < ne; i++) {
            System.out.println("Ingrese nombre del estudiante");
            String n = s.nextLine();
            u.añadirEstudiantes(n);
        }
        System.out.println("Cuantas materias desea añadir?");
        String eS = s.nextLine();
        int e = Integer.parseInt(eS);
        for (int i = 0; i < e; i++) {
            System.out.println("Ingrese nombre de la materia");
            String nm = s.nextLine();
            System.out.println("Ingrese nombre del profesor");
            String pm = s.nextLine();
            u.añadirModulos(nm, pm);
        }
       
        System.out.println("A cuantos estudiantes desea inscribirle materias?");
        String ne2S = s.nextLine();
        int ne2 = Integer.parseInt(ne2S);
        for (int i = 0; i < ne2; i++){
            System.out.println("Ingrese nombre del estudiante al que desea inscribirle materias");
            String ne3= s.nextLine();
            for (int j = 0; j < u.getEstudiantes().size(); j++) {
                if(u.getEstudiantes().get(j).getNombre().equals(ne3)){
                    System.out.println("Cuantas materias desea inscribirle a "+u.getEstudiantes().get(j).getNombre());
                    String nm2S = s.nextLine();
                    int nm2 = Integer.parseInt(nm2S);
                    for (int k = 0; k < nm2; k++) {
                        System.out.println("Ingrese nombre de la materia");
                        String m2 = s.nextLine();
                        u.getEstudiantes().get(j).inscribirMaterias(m2,u.getModulos());
                        System.out.println("Cuantas notas desea añadirle a"+u.getEstudiantes().get(j).getNombre()+" en "+m2);
                        String cmnS=s.nextLine();
                        int cmn = Integer.parseInt(cmnS);
                        for (int l = 0; l < cmn; l++) {
                            System.out.println("que nota desea añadir?");
                            int n = s.nextInt();
                            u.getEstudiantes().get(j).agregarNotas(nm2, m2);
                        }
                    }
                    
                }
            }
        }       
    }
}
