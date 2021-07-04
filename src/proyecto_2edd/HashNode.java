/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2edd;

/**
 *
 * @author cbcbe
 */
public class HashNode {
    private HashNode next;
    private HashNode prev;
    private String username;
    private String prioridad;
    private String docname;
    private String docsize;
    private String doctype;

    public HashNode(String username, String prioridad, String docname, String docsize, String doctype) {
        this.next = null;
        this.prev = null;
        this.username = username;
        this.prioridad = prioridad;
        this.docname = docname;
        this.docsize = docsize;
        this.doctype = doctype;
    }

    public HashNode getPrev() {
        return prev;
    }

    public void setPrev(HashNode prev) {
        this.prev = prev;
    }
     
    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getDocsize() {
        return docsize;
    }

    public void setDocsize(String docsize) {
        this.docsize = docsize;
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }
  
}
