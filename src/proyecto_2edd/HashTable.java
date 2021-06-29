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
public class HashTable {
    private HashNode tabla[];
    private int size;

    public HashTable( int size) {
        this.size = size;
        this.tabla = new HashNode[size];
        for (int i = 0; i < size; i++) {
            this.tabla[i] = null;
        }
    }
    
    public int hashing(String nombre){   //hacer hashing con el nombre del documento    
       int valor = Math.abs(nombre.hashCode());
       return valor % this.size;
    }
    
    public void Insertar(HashNode doc){//Pasar nodo con todos los atributos 
        
        String nombre = doc.getDocname();
        int posicion = hashing(nombre);
        boolean existe = false;
        
        if (this.tabla[posicion] != null){
            HashNode temp = this.tabla[posicion];
            if (temp.getDocname().equals(nombre)){
                existe = true;
            }
            while(temp.getNext()!=null){    //Para recorrer la lista de nodos de una posición (no debería haber pero por si acaso)
                temp = temp.getNext();
                if (temp.getDocname().equals(nombre)){
                    existe = true;  //si existe no pasa nada porque no se puede insertar dos veces
                }
            }
            if(!existe){
                temp.setNext(doc);
                doc.setPrev(temp);
            }
        }else{
            //HashNode nuevo2 = new HashNode(); //CONSTRUIR EL NODO CON TODOS LOS ATRIBUTOS
            this.tabla[posicion] = doc;
        }
    }
    
    public void Eliminar(HashNode doc){//Pasar nodo con todos los atributos 
        
        String nombre = doc.getDocname();
        int posicion = hashing(nombre);
        
        
        if (this.tabla[posicion] != null){
            HashNode aux = this.tabla[posicion];
            if (aux.getDocname().equals(nombre)){// es el primer nodo en esa posicion
                this.tabla[posicion] = this.tabla[posicion].getNext();
            }
            while (aux.getNext()!=null) {
                aux = aux.getNext();
                if (aux.getDocname().equals(doc.getDocname())){
                    aux.getNext().setPrev(aux.getPrev());
                }
            }
            
        }else{
            //no existe nada en esa posicion
        }
    }
    
    
    
    public HashNode buscar(String nombre){  //Buscar por el nombre del doc
        int posicion = hashing(nombre);
        HashNode temp = this.tabla[posicion];
        boolean existe = false;
        if(temp!=null){
            if(temp.getNext()==null){
                existe = true;
            }else{
                while(temp.getNext() != null && !existe){
                    if(temp.getDocname().equals(nombre)){
                        existe = true;
                    }else{
                        temp = temp.getNext();
                        
                    }
                }
            }
        }
        if(existe){
            return temp;
        }else{
            return null;
        }
    }
    
    public void vaciado(){
        for (int i = 0; i < size; i++) {
            this.tabla[i]=null;
        }
    }
    
    public void imprimir(){//Imprime los nombres de los documentos (podemos hacer que los agregue todos a una lista e imprimirlos por prioridad)
        for (int i = 0; i < size; i++) {
            if(this.tabla[i]!=null){
                System.out.println(this.tabla[i].getDocname());
                if(this.tabla[i].getNext() != null){
                    HashNode temp = this.tabla[i].getNext();
                    while(temp!=null){
                        System.out.println(temp.getDocname());
                        temp = temp.getNext();
                    }
                }
            }
        }
    }
}