
package Modelo;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class modelo {
      File file=new File("/Factura.docx");
      ArrayList<Datos>model;
      public void crear_archivo(File file){
          if(file.exists()){
              System.out.println("existe");
          }else
          {
              try {
              file.createNewFile();
              } catch (IOException ex) {
                      JOptionPane.showMessageDialog(null,"Error al crear el archivo");
              }
          }
          System.out.println(file.getAbsolutePath());
         
      }
        
        public modelo(){
             model=new ArrayList<Datos>();
        }
        public void adicionar(Datos a){
            model.add(a);
        }
        public Datos obtener(int posicion){
            return model.get(posicion);
        }
        public int tamaño(){
            return model.size();
        }
        public void remover(int indice){
            model.remove(indice);
        }
          
     public Icon imagen(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("Tipico.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
     public Icon imagen1(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("Combo2.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
     public Icon imagen2(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("Costillas.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
     public Icon imagen3(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("Cordon blue.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
     public Icon imagen4(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("Pollo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
     public Icon imagen5(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("medio pollo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
     public Icon imagen6(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("Hamburguesa.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
     public Icon imagen7(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("Hamburguesa de pollo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
     public Icon imagen8(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("Cocacola.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
     public Icon imagen9(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("Seven up.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
    public Icon imagen10(){
         ImageIcon imagen=new ImageIcon(new ImageIcon("Tipico.png").getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT));
         return imagen; 
         
     }
}
