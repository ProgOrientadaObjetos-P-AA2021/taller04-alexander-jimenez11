/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author Alexander
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cedula = "0705936219";
        String nombre = "Luis";
        String apellido = "Jiménez";
        double sueldoBasico = 400.00;

        Profesor profe = new Profesor(cedula, nombre, apellido, sueldoBasico);

        profe.establecerSueldoTotal();

        System.out.printf("%s\n", profe);

        String cedula2 = "0701583874";
        String nombre2 = "Rosa";
        String apellido2 = "Medina";
        double sueldoBasico2 = 1200.00;

        Profesor profe2 = new Profesor(cedula2, nombre2, apellido2,
                sueldoBasico2);

        profe2.establecerSueldoTotal();

        System.out.printf("%s\n", profe2);

    }
}
