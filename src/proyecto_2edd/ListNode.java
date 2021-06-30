/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2edd;

/**
 *
 * @author Nicolás Briceño y Christian Behrens
 */
public class ListNode {
    private String nombre;
    private String prioridad;
    private ListNode pNext;
    private ListNode pPrev;
    private UserList docs;
    private String size;
    private String type;
    
    
    public ListNode(String nombre, String prioridad){//Nodo para los usuarios
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.pNext = null;
        this.pPrev = null;
        this.docs = new UserList();
    }

    public ListNode(String nombre, String size, String type) {//nodo para los docs de c/ usuario
        this.nombre = nombre;
        this.pNext = null;
        this.pPrev = null;
        this.size = size;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public UserList getDocs() {
        return docs;
    }

    public void setDocs(UserList docs) {
        this.docs = docs;
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

    public ListNode getpNext() {
        return pNext;
    }

    public void setpNext(ListNode pNext) {
        this.pNext = pNext;
    }

    public ListNode getpPrev() {
        return pPrev;
    }

    public void setpPrev(ListNode pPrev) {
        this.pPrev = pPrev;
    }
}
