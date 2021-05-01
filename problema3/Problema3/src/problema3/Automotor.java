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
public class Automotor {

    private String cedulaPropietario;
    private String marcaVehiculo;
    private int añoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String cedula, String marca, int año, double valorVehi) {
        cedulaPropietario = cedula;
        marcaVehiculo = marca;
        añoFabricacion = año;
        valorVehiculo = valorVehi;

    }

    public void establecerCedulaPropietario(String n) {
        cedulaPropietario = n;
    }

    public void establecerMarcaVehiculo(String n) {
        marcaVehiculo = n;
    }

    public void establecerAñoFabricacion(int n) {
        añoFabricacion = n;
    }

    public void establecerValorVehiculo(double n) {
        valorVehiculo = n;
    }

    public void establecerValorMatricula() {
        valorMatricula = (valorVehiculo * 0.002) * (2021 - añoFabricacion);
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public String obtenerCedulaPropietario() {
        return cedulaPropietario;
    }

    public int obtenerAñoFabricacion() {
        return añoFabricacion;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nDATOS Y VALORES DEL AUTOMOTOR\n"
                + "Cedula: %s\nMarca: %s\nAño de fabricacion: %d\nValor del "
                + "vehiculo: %.2f\nValor de la matricula: %.2f\n",
                obtenerCedulaPropietario(), obtenerMarcaVehiculo(),
                obtenerAñoFabricacion(), obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
}
