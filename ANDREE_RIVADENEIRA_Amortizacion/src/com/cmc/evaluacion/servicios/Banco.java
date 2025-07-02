package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;
import java.util.ArrayList;
import java.util.HashMap;

public class Banco {
    private ArrayList<Cliente> clientes;
    private HashMap<String, ArrayList<Prestamo>> prestamos;
    
    public Banco() {
        this.clientes = new ArrayList<>();
        this.prestamos = new HashMap<>();
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public void registrarCliente(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.getCedula().equals(cliente.getCedula())) {
                System.out.println("Error: Cliente con cédula " + cliente.getCedula() + " ya está registrado");
                return;
            }
        }
        clientes.add(cliente);
        prestamos.put(cliente.getCedula(), new ArrayList<>());
        System.out.println("Cliente registrado exitosamente: " + cliente.getNombre() + " " + cliente.getApellido());
    }
    
    public void asignarPrestamo(String cedula, Prestamo prestamo) {
        if (prestamos.containsKey(cedula)) {
            prestamos.get(cedula).add(prestamo);
            System.out.println("Préstamo asignado al cliente con cédula: " + cedula);
        } else {
            System.out.println("Error: Cliente con cédula " + cedula + " no encontrado");
        }
    }
    
    public ArrayList<Prestamo> buscarPrestamos(String cedula) {
        return prestamos.getOrDefault(cedula, new ArrayList<>());
    }
}