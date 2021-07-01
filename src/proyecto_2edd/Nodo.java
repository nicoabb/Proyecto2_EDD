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
    private String name;
    private String tipo;
    private int tamano;
    public Nodo(String name, String tipo, int tamano){
        this.tamano = tamano;
        this.name = name;
        this.tipo = tipo;
        this.left = null;
        this.right = null;
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
