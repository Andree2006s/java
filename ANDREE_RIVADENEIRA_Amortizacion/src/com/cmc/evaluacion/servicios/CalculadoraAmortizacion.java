package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.*;

public class CalculadoraAmortizacion {
    
    public static double calcularCuota(Prestamo prestamo) {
        double monto = prestamo.getMonto();
        double tasaMensual = prestamo.getInteres() / 100 / 12;
        int plazo = prestamo.getPlazo();
        
        if (tasaMensual == 0) {
            return monto / plazo;
        }
        
        double cuota = monto * (tasaMensual * Math.pow(1 + tasaMensual, plazo)) / 
                      (Math.pow(1 + tasaMensual, plazo) - 1);
        
        return cuota;
    }
    
    public static void generarTabla(Prestamo prestamo) {
        prestamo.getCuotas().clear();
        
        double saldoRestante = prestamo.getMonto();
        double tasaMensual = prestamo.getInteres() / 100 / 12;
        double cuotaFija = calcularCuota(prestamo);
        
        for (int i = 1; i <= prestamo.getPlazo(); i++) {
            Cuota cuota = new Cuota(i);
            cuota.setInicio(saldoRestante);
            cuota.setInteres(saldoRestante * tasaMensual);
            cuota.setAbonoCapital(cuotaFija - cuota.getInteres());
            cuota.setCuota(cuotaFija);
            
            saldoRestante -= cuota.getAbonoCapital();
            if (saldoRestante < 0) saldoRestante = 0;
            
            cuota.setSaldo(saldoRestante);
            prestamo.getCuotas().add(cuota);
        }
    }
    
    public static void mostrarTabla(Prestamo prestamo) {
        System.out.println("\n=== TABLA DE AMORTIZACIÓN ===");
        System.out.println("Monto: $" + prestamo.getMonto());
        System.out.println("Plazo: " + prestamo.getPlazo() + " meses");
        System.out.println("Interés: " + prestamo.getInteres() + "% anual");
        System.out.println();
        System.out.printf("%-6s %-10s %-12s %-10s %-12s %-12s%n", 
                         "Cuota", "Valor", "Saldo Inic", "Interés", "Abono Cap", "Saldo Final");
        System.out.println("-----------------------------------------------------------------------");
        
        for (Cuota cuota : prestamo.getCuotas()) {
            System.out.printf("%-6d $%-9.2f $%-11.2f $%-9.2f $%-11.2f $%-11.2f%n",
                             cuota.getNumero(),
                             cuota.getCuota(),
                             cuota.getInicio(),
                             cuota.getInteres(),
                             cuota.getAbonoCapital(),
                             cuota.getSaldo());
        }
        System.out.println();
    }
}