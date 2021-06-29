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
    private Usuario pFirst;
    private Usuario pLast;
    private int size;
    private String filepath;
    
    public UserList(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
        this.filepath = "";
    }

    public Usuario getpFirst() {
        return pFirst;
    }

    public void setpFirst(Usuario pFirst) {
        this.pFirst = pFirst;
    }

    public Usuario getpLast() {
        return pLast;
    }

    public void setpLast(Usuario pLast) {
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
    
    public void Liberar(Usuario user){
        user.setNombre("");
        user.setPrioridad("");
        user.setpNext(null);
        user.setpPrev(null);
    }
    
    public void Insertar(String nombre, String prioridad){
        Usuario uNew = new Usuario();
        uNew.setNombre(nombre);
        uNew.setPrioridad(prioridad);
        Boolean existe = false;
        
        if(isEmpty()){
            pFirst = uNew;
            pLast = uNew;
        }else{
            Usuario aux = pFirst;
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
        size +=1;
    }
    
    public Usuario Buscar(String nombre){
        Usuario auxfirst = this.getpFirst();
        Usuario auxlast = this.getpLast();
        Usuario temp;
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
    
    public void Eliminar(String nombre){
        Usuario e = Buscar(nombre);
        if(e == pFirst){
            Usuario temp = e.getpNext();
            temp.setpPrev(null);
            pFirst = temp;
            this.Liberar(e);
        }else if(e == pLast){
            Usuario temp = e.getpPrev();
            temp.setpNext(null);
            pLast = temp;
            this.Liberar(e);
        }else{
            Usuario temp1 = e.getpPrev();
            Usuario temp2 = e.getpNext();
            temp1.setpNext(e.getpNext());
            temp2.setpPrev(e.getpPrev());
            this.Liberar(e);
        }
    }
    
    public String Imprimir(UserList list){
        Usuario aux = list.getpFirst();
        String print = "";
        while(aux != null){
            print += (aux.getNombre() + "," + aux.getPrioridad() + "\n");
            aux = aux.getpNext();
        }
        return print;
    }
}
