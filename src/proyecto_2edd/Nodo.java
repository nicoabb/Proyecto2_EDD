/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2edd;

/**
 *
 * @author Gabriella
 */
public class Nodo {
     private int height;
    private Nodo left;
    private Nodo right;
    private Nodo parent;
    private String name;
    private String tipo;
    private int tamano;
    private int prioridad; 
    private int index; 
    public Nodo(String name, String tipo, int tamano, int prioridad){
        this.tamano = tamano;
        this.name = name;
        this.tipo = tipo;
        this.left = null;
        this.right = null;
        this.prioridad = prioridad; 
        this.height = 1;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
      /**
     * @return the prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }

     /**
     * @param height the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }
      /**
     * @return the prioridad
     */
    public int getIndex() {
        return index;
    }
    /**
     * @param height the prioridad to set
     */
    public void setProridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the left
     */
    public Nodo getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(Nodo left) {
        this.left = left;
    }
 /**
     * @return the parent
     */
    public Nodo getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(Nodo parent) {
        this.parent = parent;
    }
    /**
     * @return the right
     */
    public Nodo getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(Nodo right) {
        this.right = right;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void seTamano(int tamano) {
        this.tamano = tamano;
    }
   
}
