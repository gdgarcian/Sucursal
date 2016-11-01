package javaapplication15;

import java.util.*;


public class Empresa {
    
    private String nombre;
    private TreeMap <String,Sucursal> sucursal;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.sucursal = new TreeMap<>();
    }

    Empleado emp = new Empleado(nombre, nombre, 30);
        
    public ArrayList<Sucursal> listarTodosEmpleados(){
        ArrayList<Sucursal> sucursales = new ArrayList<>();       
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        for (Sucursal s : this.sucursal.values()) 
            sucursales.add(s);
            for (Empleado e : this.emp.values()) 
                empleados.add(e);
                return empleados;             
        return sucursales;    
            
    }
    
}
