/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perros;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class PerrosService {
    
    Scanner leer = new Scanner(System.in);
    
    
    
    public Perros crearperro(Perros p){
        
        System.out.println("ingrese el nombre del perro");
        p.setNombre(leer.next());
        System.out.println("ingrese el apodo del perro");
        p.setApodo(leer.next());
        System.out.println("ingrese el raza del perro");
        p.setRaza(leer.next());
        System.out.println("ingrese el edad del perro");
        p.setEdad(leer.nextInt());
        
        return p;
    }
    
    
    
}
