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
import javax.swing.JOptionPane;

/**
 *
 * @author gabriellasuarez
 */
public class MonticuloBinario {

    private Nodo root;

    public MonticuloBinario() {
        this.root = null;
    }

    /**
     * @return the root
     */
    public Nodo getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(Nodo root) {
        this.root = root;
    }

    public int height(Nodo n) {
        if (n == null) {
            return 0;
        }
        return n.getHeight();
    }

    public void updateHeight(Nodo n) {
        try {
            if (n.getLeft() != null && n.getRight() != null) {
                n.setHeight(1 + Math.max(this.height(n.getLeft()), this.height(n.getRight())));
            } else if (n.getLeft() == null) {
                n.setHeight(1 + height(n.getRight()));
            } else if (n.getRight() == null) {
                n.setHeight(1 + height(n.getLeft()));
            }
            

        } catch (Exception e) {

        }
    }

    public int getBalance(Nodo n) {
        return (n == null) ? 0 : height(n.getRight()) - height(n.getLeft());
    }

    public Nodo rightRotate(Nodo x) {
        try {
            Nodo y = x.getLeft();
            Nodo z = y.getRight();
            y.setRight(x);
            x.setLeft(z);
            if (this.root == x) {
                this.setRoot(y);
            }
            updateHeight(x);
            updateHeight(y);
            updateHeight(z);
            return y;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
            return null;
        }
    }

    public Nodo lefttRotate(Nodo x) {
        try {
            Nodo y = x.getRight();
            Nodo z = y.getLeft();
            y.setLeft(x);
            x.setRight(z);
            if (this.root == x) {
                this.setRoot(y);
            }
            updateHeight(x);
            updateHeight(y);
            updateHeight(z);
            return y;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
            return null;
        }
    }

    public Nodo rebalance(Nodo z) {
        updateHeight(z);
        int balance = this.getBalance(z);
        if (balance > 1) {
            if (height(z.getRight().getRight()) > height(z.getRight().getLeft())) {
                z = this.lefttRotate(z);
            } else {
                z.setRight(this.rightRotate(z.getRight()));
                z = this.lefttRotate(z);
            }
        } else if (balance < -1) {
            if (height(z.getLeft().getLeft()) > height(z.getLeft().getRight())) {
                z = this.rightRotate(z);
            } else {
                z.setLeft(this.lefttRotate(z.getLeft()));
                z = this.rightRotate(z);
            }
        }

        return z;
    }

    public Nodo insert(Nodo nodo, String name, String tipo, int tamano) {
        if (this.root == null) {
            this.root = new Nodo(name, tipo, tamano);
           
        } else if (nodo == null) {
            Nodo h = new Nodo(name, tipo, tamano);
            
            return h;
        } else if (nodo.getTamano() > tamano) {
            nodo.setLeft(insert(nodo.getLeft(), name, tipo, tamano));
        } else if (nodo.getTamano() < tamano) {
            nodo.setRight(insert(nodo.getRight(), name, tipo, tamano));
        }
        return rebalance(nodo);
    }

    static Nodo imprimir(Nodo node)
    {
       Nodo current = node;
 
        /* loop down to find the leftmost leaf */
        while (current.getLeft() != null)
            current = current.getLeft();
        
        JOptionPane.showMessageDialog(null, "Se ha impreso " + current.getName() + " con éxito.");
        return current; 
        
    }
         

   

}
