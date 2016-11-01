
package javaapplication15;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Empleado e1 = new Empleado("123", "V", 0);
        Empleado e2 = new Empleado("456", "I", 30);
        Sucursal s = new Sucursal("Bogotá");
        //Ingresando Empleado
        if(!s.ingresarEmp(e1)) System.out.println("Error");
        if(!s.ingresarEmp(e2)) System.out.println("Error");
        
        //Buscar Empleado
        Empleado e = s.buscarEmpleado("123");
        if(e != null) System.out.println(e);
        else System.out.println("No existe");
        
        //Listar todos
        ArrayList<Empleado> emp = s.listarTodosEmpleados();
        for (Empleado emp1 : emp) {
            System.out.println(emp1);
        }
    }
}
