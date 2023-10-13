package modelo;

import java.util.Scanner;

public class Profesor extends Usuario{

    Scanner sc=new Scanner(System.in);
    private String especialidad;

    public Profesor(){
        super();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void crearProfesor(){
        System.out.println("Ingrese el id del profesor");
        idUsuario=sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el nombre del profesor");
        nombre=sc.nextLine();
        System.out.println("Ingrese el apellido del profesor");
        apellido= sc.nextLine();
        System.out.println("Ingrese la especialidad");
        especialidad=sc.nextLine();
    }

    public void verProfesor(){
        System.out.println("Id: " + idUsuario + "\n"+
                "Nombre: " + nombre + "\n"+
                "Apellido: " + apellido + "\n"+
                "Especialidad: " + especialidad + "\n");
    }
}
