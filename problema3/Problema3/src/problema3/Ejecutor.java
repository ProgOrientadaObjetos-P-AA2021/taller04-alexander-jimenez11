/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

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
        String cedula = "070593621-9";
        String marca = "Chevrolet";
        int año = 2010;
        double valor = 10500.00;
        Automotor auto1 = new Automotor(cedula, marca, año, valor);
        auto1.establecerValorMatricula();

        System.out.printf("%s\n", auto1);

        String cedula2 = "070158387-4";
        String marca2 = "Lamborghini";
        int año2 = 2020;
        double valor2 = 350000.00;
        Automotor auto2 = new Automotor(cedula2, marca2, año2, valor2);
        auto2.establecerValorMatricula();

        System.out.printf("%s\n", auto2);
    }

}
