package modelo;

import java.util.Scanner;

public class MenuApp {
    Scanner sc = new Scanner(System.in);
    Curso curso = new Curso();
    Profesor profesor = new Profesor();
    Asignacion asignacion = new Asignacion();
    public void menu(){
        System.out.println("Oprima 1 para iniciar");
        int init = sc.nextInt();

        while (init!=0){
            System.out.println("1. Crear profesor \n 2. Ver profesor \n 3.Crear curso \n+" +
                    " 4.Ver curso \n 5.Crear asignacion \n 6.Ver asignacion \n 7.Salir");
            int opc=sc.nextInt();

            switch (opc){
                case 1:
                    profesor.crearProfesor();
                    break;
                case 2:
                    profesor.verProfesor();
                    break;
                case 3:
                    curso.crearCurso();
                    break;
                case 4:
                    curso.verCurso();
                    break;
                case 5:
                    asignacion.crearAsignacion();
                    break;
                case 6:
                    asignacion.profesor=profesor;
                    asignacion.curso=curso;
                    asignacion.verAsignacion();
                    break;
                case 7:
                    System.out.println("Usted va a salir del menu");
                    init=0;
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
        }
    }
}
