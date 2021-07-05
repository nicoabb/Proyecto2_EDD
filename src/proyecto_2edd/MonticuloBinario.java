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
    public int height; 


    public MonticuloBinario() {
        height = 0; 
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
    
    public int getfullCount(Nodo root){
       
        if (root == null)
            return 0;    
     return 1 + getfullCount(root.getLeft()) + getfullCount(root.getRight());
    }


 public int getLeaf(Nodo root)
{
    if (root == null)
    return 0;
 
    int res = 0;
    if (root.getLeft() != null && root.getRight() != null)
        
    res++;
 
    res += (getfullCount(root.getLeft()) + getfullCount(root.getRight()));
    return res;
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

    
   
   public void insertar(String name, String tipo, int tamano, int prioridad) {
        if (this.root == null) {
           
            this.root =  new Nodo(name, tipo, tamano, prioridad);
            root.setIndex(0);
            heapify(root);
            
        } else {
            this.insertoprueba(this.root, name, tipo, tamano, prioridad);
            
        }
    }


    
 
     public Nodo find(Nodo n, int key) {
                Nodo result = null;
                if (n == null)
                        return null;
                if (n.getIndex()== key)
                        return n;
                if (n.getLeft() != null)
                        result = find(n.getLeft(), key);
                if (result == null)
                        result = find(n.getRight(), key);
                return result;
        }
            
  
     Nodo ordernar(Nodo node){
         if (node.getParent() == null ){
             
             return node;
         }else{
         System.out.println(node.getParent().getName());
         
             
            if (node.getParent().getPrioridad() > node.getPrioridad()){
                
             System.out.println("Entro");
             
             
             System.out.println(node.getName());
             
           
            
                 
                 return node;
             
             } 
         }
         
         
        
        return null;
     }
     
    public void insertoprueba(Nodo padre, String name,String tipo, int tamano, int prioridad){
    Nodo agg = new Nodo(name, tipo, tamano, prioridad);
  

    int index = getfullCount(root); 
      agg.setIndex(index);
   
   int parentIndex = (int)Math.floor((index-1)/2);
    
    Nodo parent = find(root, parentIndex);
    agg.setParent(parent);
          
    if(index % 2 == 1) { // left
 

        parent.setLeft(agg);
       

    } else { // right

        parent.setRight(agg);

    }
    heapify(agg);

    }
    

    

        
     
     void preOrder(Nodo node) {
        if (node != null) {
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
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
         

        void heapify(Nodo node){
            
            
            Nodo parent = node.getParent(); 
            if(parent == null){
                return;
            }
            if  (parent.getPrioridad() > node.getPrioridad()){
                
                swapNodes(node, parent);
                heapify(node); 
            }
            
        } 
      
        void heapifyDown(Nodo node){
            Nodo izq =  node.getLeft();
            Nodo der = node.getRight();
            Nodo nieto; 
            
            if (izq == null && der == null){
                return;
            }
            if(izq != null & der!= null){
                if(izq.getPrioridad() <= der.getPrioridad()){
                  nieto = izq;  
                }
                 
            else{
                nieto = der;
                
            }
            }else{
                nieto = izq;
            }
          if(nieto.getPrioridad() < node.getPrioridad()){
              swapNodes(node, nieto);
              heapifyDown(node);
                     
          }      
            
        }
        
        
        
     public Nodo swapNodes(Nodo node, Nodo parent){
        
         Nodo aux = new Nodo(node.getName(), node.getTipo(), node.getTamano(), node.getPrioridad());     
         node.setName(parent.getName());
         node.setProridad(parent.getPrioridad());
         node.seTamano(parent.getTamano());
         node.setTipo(parent.getTipo());
         parent.setName(aux.getName());
         parent.setProridad(aux.getPrioridad());
         parent.seTamano(aux.getTamano());
         parent.setTipo(aux.getTipo());
         return node;
     }
     
    Nodo elim_min(){
        Nodo min = getRoot();
        if(min!= null){
            delete(min);
        }
        return min;
    }

    void delete(Nodo min){

        Nodo last = find(root, getfullCount(root)-1);
        if (min != last){
            swapNodesMin(min);
        }

        heapify(min);
        heapifyDown(min);

    }
    public Nodo swapNodesMin(Nodo min){
        Nodo last = find(root, getfullCount(root)-1);
         min.setName(last.getName());
             min.setProridad(last.getPrioridad());
             min.seTamano(last.getTamano());
             min.setTipo(last.getTipo());
       Nodo papa = last.getParent();
       if (papa.getRight()!= null){
           papa.setRight(null);
       } else {
           papa.setLeft(null);
       }


        return min; 
    }
    
    void elim_select(Nodo selec){
        Nodo last = find(root, getfullCount(root)-1); 
        selec.setProridad(last.getPrioridad()+1);
        heapify(selec);
        delete(selec);
    
    }
    
    public Nodo BuscarNombre(Nodo doc, String name){
        Nodo result = null;
                if (doc == null)
                        return null;
                if (doc.getName().equals(name))
                        return doc;
                if (doc.getLeft() != null)
                        result = BuscarNombre(doc.getLeft(), name);
                if (result == null)
                        result = BuscarNombre(doc.getRight(), name);
                return result;
    }
}

   


