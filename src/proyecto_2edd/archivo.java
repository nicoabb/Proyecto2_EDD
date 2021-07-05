/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2edd;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolás Briceño
 */
public class archivo {
    
    public void readcsv(UserList list, String path){
        try{
            //Se lee el archivo
            byte[] allinfo = Files.readAllBytes(Paths.get(path));
            String info = new String(allinfo);
            String[] datos = info.split("\n");
            
            //Se separa la informacion
            for (String dato : datos) {
                String[] user = dato.split(",");
                list.Insertar(user[0],user[1]);
            }
        
        }catch(ArrayIndexOutOfBoundsException | IOException e){
            JOptionPane.showMessageDialog(null, "Verifique el archivo csv ingresado.","ALERTA", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }
    
    public void writecsv(UserList list){
        try{
            String infotxt = "";
            ListNode aux = list.getpFirst();
            while(aux != null){
                infotxt += (aux.getNombre() + "," + aux.getPrioridad() + "\n");
                aux = aux.getpNext();
            }
            PrintWriter write;
            write = new PrintWriter(list.getFilepath());
            write.print(infotxt);
            write.close();
            
        }catch(IOException e){
            
        }
    }
    
}
