package modelo;

import java.util.Scanner;

public class Asignacion {
    Scanner sc = new Scanner(System.in);
    private int idAsignacion;
    private String fechaInicio;
    private String fechaFinal;
    Curso curso;
    Profesor profesor;

    public Asignacion (){

    }

    public int getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void  crearAsignacion(){
        System.out.println("Ingrese el id de Asignación");
        idAsignacion=sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el la fecha de inicio");
        fechaInicio=sc.nextLine();
        System.out.println("Ingrese la fecha final");
        fechaFinal= sc.nextLine();
    }

    public void verAsignacion(){
        System.out.println("Id: " + idAsignacion + "\n"+
                "Fecha inicio: " + fechaInicio + "\n"+
                "Fecha Final: " + fechaFinal + "\n"+
                "Nombre Curso: " + curso.getNombreCurso() + "\n"+
                "Nombre profesor: " + profesor.nombre+ "\n"+
                "Apellido del profesor: " + profesor.apellido);
    }

}
