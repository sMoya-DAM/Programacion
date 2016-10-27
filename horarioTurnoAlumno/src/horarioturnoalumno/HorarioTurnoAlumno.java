package horarioturnoalumno;

import java.util.Scanner;

public class HorarioTurnoAlumno {

    public static void main(String[] args) {
        //DECLARACIÓN DE VARIABLES:
        int curso;
        int contadorAlumnos;
        String turno = new String();
        
        /*
            - Con Scanner se leen los datos de un determinado origen. 
              IMPOTANTE: Para usar Scanner necesitamos importar java.util.Scanner
        
            - System.out se refiere a la pantalla, con System.out.println(); se imprime un mensjae en la pantalla.
        */
        
        Scanner entrada = new Scanner(System.in);        
        System.out.println("¿De qué curso eres?");
        curso = entrada.nextInt();        
        System.out.println("¿De qué turno eres?");
        turno = entrada.next();
        
        if (curso == 1) {
            System.out.println("Eres de Primero: aulas 7 y 8");
            if (turno.equals("manana")) {
                System.out.println("y entras a las 8.");
            }
            else {
                System.out.println("y entras a las 15.");
            }
        }
        else{
            System.out.println("Eres de segundo: aulas 3 y 4");
            if (turno.equals("manana")) {
                System.out.println("y entras a las 8.");
            }
            else {
                System.out.println("y entras a las 15.");
            }
        }
        
    }
    
}
