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
public class Profesor {

    private String cedula;
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;

    public Profesor(String cedu, String nom, String apelli, double sueldbas) {
        nombre = nom;
        apellido = apelli;
        sueldoBasico = sueldbas;
        cedula = cedu;

    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public void establecerSueldoBasico(double n) {
        sueldoBasico = n;
    }

    public void establecerSueldoTotal() {
        sueldoTotal = (sueldoBasico * 20) / 100 + sueldoBasico;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nPROFESOR DEL INSTITUTO\nCedula: %s\n"
                + "Nombre: %s\nApellido: %s\nSueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n", obtenerCedula(), obtenerNombre(),
                obtenerApellido(), obtenerSueldoBasico(), obtenerSueldoTotal());
        return cadena;
    }

}
