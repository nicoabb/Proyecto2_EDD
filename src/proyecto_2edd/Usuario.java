/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2edd;

/**
 *
 * @author Nicolás Briceño
 */
public class Usuario {
    private String nombre;
    private String prioridad;
    private Usuario pNext;
    private Usuario pPrev;
    
    
    public Usuario(){
        this.nombre = "";
        this.prioridad = "";
        this.pNext = null;
        this.pPrev = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Usuario getpNext() {
        return pNext;
    }

    public void setpNext(Usuario pNext) {
        this.pNext = pNext;
    }

    public Usuario getpPrev() {
        return pPrev;
    }

    public void setpPrev(Usuario pPrev) {
        this.pPrev = pPrev;
    }
}
