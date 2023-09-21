/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.msof.tarea1grupo3.modelo;

/**
 *
 * @author flopezs
 */
public class Modelo {
    private String codigo;
    private String nombre;
    private Double precio;
    private String elemento;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String Elemento) {
        this.elemento = Elemento;
    }
    
   public String Listado(){
       this.elemento="Activo Fijo: Codigo: "+this.codigo+" Nombre: "
               +this.nombre+" Precio: "+this.precio; 
       return this.elemento;
   }
}
