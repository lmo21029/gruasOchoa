/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Giuseppelaptop
 */
public class Usuario {
    String nombre;
    String contrasena;
    String fecha_registro;
    int id;
    
    public Usuario(String nombre,String contrasena,String fecha_registro ) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.fecha_registro = fecha_registro;        
    }
    
    
}
