package com.cmc.evaluacion.entidades;

public class Cuota {
    private int numero;
    private double cuota;
    private double inicio;
    private double interes;
    private double abonoCapital;
    private double saldo;
    
    public Cuota(int numero) {
        this.numero = numero;
    }
    
    // Getters y Setters
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public double getCuota() {
        return cuota;
    }
    
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
    
    public double getInicio() {
        return inicio;
    }
    
    public void setInicio(double inicio) {
        this.inicio = inicio;
    }
    
    public double getInteres() {
        return interes;
    }
    
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public double getAbonoCapital() {
        return abonoCapital;
    }
    
    public void setAbonoCapital(double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void mostrarPrestamo() {
        System.out.printf("Cuota %d: Cuota=%.2f, Inicio=%.2f, Interés=%.2f, Abono Capital=%.2f, Saldo=%.2f%n",
                         numero, cuota, inicio, interes, abonoCapital, saldo);
    }
}