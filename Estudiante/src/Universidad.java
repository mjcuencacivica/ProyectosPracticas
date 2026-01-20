package Estudiante.src;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    
    private String nombre;
    private List<Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiantes(Estudiante e){
        estudiantes.add(e);
    }

    public void mostrarEstudiantes(){
        System.out.println("Universidad: " + nombre + ".\nAlumnos matriculados: ");
        for(Estudiante e:estudiantes){
            e.mostrarDatos();
        }

    }
}
