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
public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheque(String nombre, String banco, double valor) {
        nombreCliente = nombre;
        nombreBanco = banco;
        valorCheque = valor;

    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public void establecerNombreBanco(String n) {
        nombreBanco = n;
    }

    public void establecerValor(double n) {
        valorCheque = n;
    }

    public void establecerComisionBanco() {
        comisionBanco = (valorCheque * 0.003);
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nENTIDAD FINANCIERA\n"
                + "Nombre: %s\nNombre del Banco: %s\nValor del cheque: %.2f\n"
                + "Comision del banco: %.2f\n", obtenerNombreCliente(),
                obtenerNombreBanco(), obtenerValorCheque(),
                obtenerComisionBanco());
        return cadena;
    }

}
