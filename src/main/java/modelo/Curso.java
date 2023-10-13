package modelo;

import java.util.Scanner;

public class Curso {
    Scanner sc = new Scanner(System.in);
    private int idCurso;
    private String nombreCurso;
    private int duracion;
    private String programa;

    public Curso(){

    }

    public Curso(String programa){
        this.programa=programa;
    }


    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void crearCurso(){
        System.out.println("Ingrese el id del curso");
        idCurso=sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el nombre del curso");
        nombreCurso=sc.nextLine();
        System.out.println("Ingrese la duración del curso");
        duracion= sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el programa del curso");
        programa=sc.nextLine();
    }

    public void verCurso(){
        System.out.println("Id: " + idCurso + "\n"+
                "Nombre: " + nombreCurso + "\n"+
                "Duración: " + duracion + "\n"+
                "Programa: " + programa + "\n");
    }


}
