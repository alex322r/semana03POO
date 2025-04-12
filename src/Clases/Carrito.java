/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;



/**
 *
 * @author alexis
 */
public class Carrito {
    
    private Producto producto = new Producto();
    private Producto[] productos = new Producto[10];
    
    public void agregarProducto(Producto p) {
        
        producto.setCodigo(p.getCodigo());
        producto.setNombre(p.getNombre());
        producto.setPrecio(p.getPrecio());
        
        if(p.getStock() == 0)
            producto.setStock(1);
        else
            producto.setStock(p.getStock());
        
        
        
    }
    
    public void agregarProducto(Producto[] p) {
        
    }
}
