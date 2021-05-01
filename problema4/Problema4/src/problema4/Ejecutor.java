/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

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
        String nombre = "Alexander Jimenez";
        String banco = "Banco de Machala";
        double valor = 150.00;
        Cheque che1 = new Cheque(nombre, banco, valor);
        che1.establecerComisionBanco();

        System.out.printf("%s\n", che1);

        String nombre2 = "Rosa Medina";
        String banco2 = "Banco de Pichincha";
        double valor2 = 200.20;
        Cheque che2 = new Cheque(nombre2, banco2, valor2);
        che2.establecerComisionBanco();

        System.out.printf("%s\n", che2);
    }

}
