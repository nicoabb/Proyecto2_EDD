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
/**
 *
 * @author gabriellasuarez
 */
import java.awt.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author gabriellasuarez
 */
    

public class Constructor_Grafico extends JPanel 
{
    private MonticuloBinario arbol;
    private HashMap posicionNodos = null;
    private HashMap subtreeSizes = null;
    private boolean verificar = true;
    private int padre = 20, hijo = 30;
    private Dimension vacio = new Dimension(0,0);
    private FontMetrics fm = null;
    
    
   
    public Constructor_Grafico(MonticuloBinario arbol) 
    {
          this.arbol = arbol;
          this.setBackground(Color.WHITE);
          posicionNodos = new HashMap();
          subtreeSizes = new HashMap();
          verificar = true;      
    }


  
    private void calcularPosiciones() 
    {
         posicionNodos.clear();
         subtreeSizes.clear();
         Nodo raiz = this.arbol.getRoot();
         if (raiz != null) 
         {
             calcularTamañoSubarbol(raiz);
             calcularPosicion(raiz, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
         }
    }
    
 
    private Dimension calcularTamañoSubarbol(Nodo n) 
    {
          if (n == null) 
              return new Dimension(0,0);
 
          Dimension izquierdo = calcularTamañoSubarbol(n.getLeft());
          Dimension derecho = calcularTamañoSubarbol(n.getRight());
          
          int altura = fm.getHeight() + padre + Math.max(izquierdo.height, derecho.height);
          int ancho = derecho.width +  hijo + derecho.width;
          
          Dimension d = new Dimension(ancho, altura);
          subtreeSizes.put(n, d);
          
          return d;
    }
    
    
   
    private void calcularPosicion(Nodo n, int izq, int der, int borde) 
    {
      if (n == null) 
          return;
      
      Dimension izquierdo = (Dimension) subtreeSizes.get(n.getLeft());
      if (izquierdo == null) 
          izquierdo = vacio;
      
      Dimension derecho = (Dimension) subtreeSizes.get(n.getRight());
      if (derecho == null) 
          derecho = vacio;
      
      int center = 0;
      
      if (der != Integer.MAX_VALUE)
          center = der - derecho.width - hijo/2;
      else if (izq != Integer.MAX_VALUE)
          center = izq + izquierdo.width + hijo/2;
      int width = fm.stringWidth(n.getName()+"");
 
      posicionNodos.put(n,new Rectangle(center - width/2 - 3, borde, width + 6, fm.getHeight()));
      
      calcularPosicion(n.getLeft(), Integer.MAX_VALUE, center - hijo/2, borde + fm.getHeight() + padre);
      calcularPosicion(n.getRight(), center + hijo/2, Integer.MAX_VALUE, borde + fm.getHeight() + padre);
    }
  
    private void dibujarArbol(Graphics2D g, Nodo n, int puntox, int puntoy, int yoffs) 
    {
     if (n == null) 
         return;
     
     Rectangle r = (Rectangle) posicionNodos.get(n);
    
         g.setColor(Color.black);
     
     g.draw(r);
     g.drawString(n.getName()+"", r.x + 3, r.y + yoffs);
   
     if (puntox != Integer.MAX_VALUE)
       
     g.drawLine(puntox, puntoy, (int)(r.x + r.width/2), r.y);
     
     dibujarArbol(g, n.getLeft(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
     dibujarArbol(g, n.getRight(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
     
   }
    

  
   public void paint(Graphics g) 
   {
         super.paint(g);
         fm = g.getFontMetrics();

         if (verificar == true) 
         {
           calcularPosiciones();
           verificar = false;
         }
         
         Graphics2D g2d = (Graphics2D) g;
         g2d.translate(getWidth() / 4, padre);
         dibujarArbol(g2d, this.arbol.getRoot(), Integer.MAX_VALUE, 2000, 
                  fm.getLeading() + fm.getAscent());
         fm = null;
   }
   
 }
