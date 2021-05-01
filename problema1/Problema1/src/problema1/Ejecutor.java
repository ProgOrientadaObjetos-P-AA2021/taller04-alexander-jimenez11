/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author Alexander
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Alexander Jiménez";
        double calificacion1 = 9.8;
        double calificacion2 = 9.9;
        double calificacion3 = 10.0;
        Estudiante est1 = new Estudiante(nombre, calificacion1, calificacion2,
                calificacion3);
        est1.establecerPromedioCalificaciones();

        System.out.printf("%s\n", est1);

        String nombreEstudiante = "Gimi Medina";
        double nota1 = 9.8;
        double nota2 = 8.8;
        double nota3 = 6.8;
        Estudiante est2 = new Estudiante(nombreEstudiante, nota1, nota2, nota3);
        est2.establecerPromedioCalificaciones();

        System.out.printf("%s\n", est2);
    }

}
