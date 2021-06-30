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
public class UserList {
    private ListNode pFirst;
    private ListNode pLast;
    private int size;
    private String filepath;
    
    
    public UserList(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
        this.filepath = "";
    }

    public ListNode getpFirst() {
        return pFirst;
    }

    public void setpFirst(ListNode pFirst) {
        this.pFirst = pFirst;
    }

    public ListNode getpLast() {
        return pLast;
    }

    public void setpLast(ListNode pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
    
    public boolean isEmpty(){
        return pFirst == null;
    }
    
    public void Liberar(ListNode user){
        user.setNombre("");
        user.setPrioridad("");
        user.setpNext(null);
        user.setpPrev(null);
    }
    
    public void Insertar(String nombre, String prioridad){
        ListNode uNew = new ListNode(nombre, prioridad);
        Boolean existe = false;
        
        if(isEmpty()){
            pFirst = uNew;
            pLast = uNew;
        }else{
            ListNode aux = pFirst;
            if (aux.getNombre().equals(nombre)){//revisa el nombre del primer elemento
                existe = true;
            }
            while(aux.getpNext()!=null){ //recorre lista buscando el nombre
                aux = aux.getpNext();
                if(aux.getNombre().equals(nombre)){
                    existe = true;
                }
            }
                    
            if (!existe){
                //si no existe el nombre, inserta el nuevo usuario al final
                aux.setpNext(uNew);
                uNew.setpPrev(aux);
                pLast = uNew;
                }
        }
        size ++;
    }
    
    public void Insertar(String username, String docname, String size, String type){//INSERTAR PARA DOCUMENTOS
        ListNode uNew = new ListNode(docname, size, type);
        Boolean existe = false;
        
        ListNode user = Buscar(username);
        
        if (user!=null){
            
            UserList list = user.getDocs();
            if(list.isEmpty()){
                list.setpFirst(uNew);
                list.setpLast(uNew);
            }else{
                ListNode aux = list.getpFirst();
                if (aux.getNombre().equals(docname)){//revisa el nombre del primer elemento
                    existe = true;
                }
                while(aux.getpNext()!=null){ //recorre lista buscando el nombre
                    aux = aux.getpNext();
                    if(aux.getNombre().equals(docname)){
                        existe = true;
                    }
                }

                if (!existe){
                    //si no existe el nombre, inserta el nuevo doc al final
                    aux.setpNext(uNew);
                    uNew.setpPrev(aux);
                    list.setpLast(uNew);
                    }
            }
            int listsize = list.getSize();
            list.setSize(listsize++);
        }else{
           //no existe el usuario 
        }
    }
    
    public ListNode Buscar(String nombre){
        ListNode auxfirst = this.getpFirst();
        ListNode auxlast = this.getpLast();
        ListNode temp;
        while(auxfirst != null && auxlast != null){
            if(nombre.equals(auxfirst.getNombre())){
                temp = auxfirst;
                return temp;
            }
            if(nombre.equals(auxlast.getNombre())){
                temp = auxlast;
                return temp;
            }
            auxfirst = auxfirst.getpNext();
            auxlast = auxlast.getpPrev();
        }
        return null;
    }
    
    public void Eliminar(String nombre){ //ELIMINAR PARA USUARIOS
        ListNode e = Buscar(nombre);
        if(e == pFirst){
            ListNode temp = e.getpNext();
            temp.setpPrev(null);
            pFirst = temp;
            this.Liberar(e);
        }else if(e == pLast){
            ListNode temp = e.getpPrev();
            temp.setpNext(null);
            pLast = temp;
            this.Liberar(e);
        }else{
            ListNode temp1 = e.getpPrev();
            ListNode temp2 = e.getpNext();
            temp1.setpNext(e.getpNext());
            temp2.setpPrev(e.getpPrev());
            this.Liberar(e);
        }
    }
    
    public void Eliminar(String username, String docname){//ELIMINAR PARA DOCUMENTOS
        
        ListNode user = Buscar(username);
        if (user!=null){
            UserList list = user.getDocs();
            ListNode e = list.Buscar(docname);
            if(e == pFirst){
                ListNode temp = e.getpNext();
                temp.setpPrev(null);
                pFirst = temp;
                this.Liberar(e);
            }else if(e == pLast){
                ListNode temp = e.getpPrev();
                temp.setpNext(null);
                pLast = temp;
                this.Liberar(e);
            }else{
                ListNode temp1 = e.getpPrev();
                ListNode temp2 = e.getpNext();
                temp1.setpNext(e.getpNext());
                temp2.setpPrev(e.getpPrev());
                this.Liberar(e);
            }
        }
    }
    
    public String imprimirDocs(ListNode user){
        String print = "Documentos:\n";
        if (user!=null){
            UserList list = user.getDocs();
            ListNode aux = list.getpFirst();
            while(aux != null){
            print += ("Nombre: "+aux.getNombre() + " / Tamaño: " + aux.getSize()+ " / Tipo: " +aux.getType()+"\n");
            aux = aux.getpNext();
            }
        }
        return print;
    }
    
    public String Imprimir(){
        ListNode aux = pFirst;
        String print = "Usuarios:\n";
        while(aux != null){
            print += ("\nUsername: "+ aux.getNombre() + "  / Prioridad: " + aux.getPrioridad() + "\n");
            print += imprimirDocs(aux);
            aux = aux.getpNext();
        }
        return print;
    }
}
