/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacion;

/**
 *
 * @author alexis
 */

import Clases.Carrito;
import Clases.Producto;

public class App {
    public static void main(String[] args) {
        
        Producto producto = new Producto("12","alex", 125, 1);
        
        Carrito carrito = new Carrito();
        
        carrito.agregarProducto(producto);
        
        
        
    }
    
}
