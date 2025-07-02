package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Prestamo {
    private double monto;
    private int plazo;
    private double interes;
    private ArrayList<Cuota> cuotas;
    
    public Prestamo(double monto, int plazo, double interes) {
        this.monto = monto;
        this.plazo = plazo;
        this.interes = interes;
        this.cuotas = new ArrayList<>();
    }
    
    // Getters y Setters
    public double getMonto() {
        return monto;
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public int getPlazo() {
        return plazo;
    }
    
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    public double getInteres() {
        return interes;
    }
    
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }
    
    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
    
    public void mostrarPrestamo() {
        System.out.println("Préstamo - Monto: $" + monto + ", Plazo: " + plazo + " meses, Interés: " + interes + "%");
    }
}
