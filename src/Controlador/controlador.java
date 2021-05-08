
package Controlador;

import Modelo.Datos;
import Modelo.modelo;
import Vista.Vista;
import Vista.Vista2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class controlador implements ActionListener {
    modelo Modelo;
    Vista vista;
    Object[] fila;   
    modelo p=new modelo();
    Vista2 vista2=new Vista2();
    public controlador(modelo Modelo, Vista vista) {
        this.Modelo = Modelo;
        this.vista = vista;     
        vista.b1.addActionListener(this);
        vista.info.addActionListener(this);
        vista.b11.addActionListener(this);
    }
    public void ver(){
        vista.setVisible(true);
    }
    public void objeto4(int i){
        Object[] fila={
              p.obtener(i).getFavorito(),
              p.obtener(i).getCombo(),
              p.obtener(i).getAsado(),
              p.obtener(i).getHamburguesa(),
              p.obtener(i).getBebidas()
              };
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        vista2.b1.addActionListener(this);
        vista2.b2.addActionListener(this);
        vista2.b3.addActionListener(this);
        vista2.b4.addActionListener(this);
        vista2.b5.addActionListener(this);
        if(vista.b1==ae.getSource()){
            if(ae.getActionCommand().equalsIgnoreCase("Pedir")){
                File factura=new File("Fact.XLS");
               Modelo.crear_archivo(factura);
                try {                  
                    FileWriter escribir=new FileWriter("Fact.XLS");
                    String favorito= vista.b2.getText();
                    String combo= vista.b5.getText();
                    String asado=vista.b7.getText();
                    String hamburguesa=vista.b8.getText();
                    String bebida= vista.b10.getText();
                    String Precio;
                    
                   if(vista.b5.getText().equalsIgnoreCase("Combo Tipico")){
                    vista.l2.setIcon(Modelo.imagen());
                    Precio=String.valueOf(22000);
                    Datos a= new Datos(favorito,combo,asado,hamburguesa,bebida,Precio);
                    p.adicionar(a);
                   }
                   if(vista.b5.getText().equalsIgnoreCase("Combo Light")){
                    vista.l2.setIcon(Modelo.imagen1());
                    Precio=String.valueOf(15000);
                    Datos a= new Datos(favorito,combo,asado,hamburguesa,bebida,Precio);
                    p.adicionar(a);
                   }
                   if(vista.b2.getText().equalsIgnoreCase("Costillas con dorado")){
                    vista.l2.setIcon(Modelo.imagen2());
                    Precio=String.valueOf(26000);
                    Datos a= new Datos(favorito,combo,asado,hamburguesa,bebida,Precio);
                    p.adicionar(a);
                   }
                   if(vista.b2.getText().equalsIgnoreCase("Cordon blue")){
                    vista.l2.setIcon(Modelo.imagen3());
                    Precio=String.valueOf(24000);
                    Datos a= new Datos(favorito,combo,asado,hamburguesa,bebida,Precio);
                    p.adicionar(a);
                   }
                   if(vista.b7.getText().equalsIgnoreCase("Pollo")){
                    vista.l2.setIcon(Modelo.imagen4());
                    Precio=String.valueOf(18500);
                    Datos a= new Datos(favorito,combo,asado,hamburguesa,bebida,Precio);
                    p.adicionar(a);
                   }
                   if(vista.b7.getText().equalsIgnoreCase("Medio pollo")){
                    vista.l2.setIcon(Modelo.imagen5());
                    Precio=String.valueOf(15900);
                    Datos a= new Datos(favorito,combo,asado,hamburguesa,bebida,Precio);
                    p.adicionar(a);
                   }
                  if(vista.b8.getText().equalsIgnoreCase("Hamburguesa BBQ")){
                    vista.l2.setIcon(Modelo.imagen6());
                    Precio=String.valueOf(30000);
                    Datos a= new Datos(favorito,combo,asado,hamburguesa,bebida,Precio);
                    p.adicionar(a);
                   }
                  if(vista.b8.getText().equalsIgnoreCase("Hamburguesa de pollo")){
                    vista.l2.setIcon(Modelo.imagen7());
                    Precio=String.valueOf(28000);
                    Datos a= new Datos(favorito,combo,asado,hamburguesa,bebida,Precio);
                    p.adicionar(a);
                   }
                  if(vista.b10.getText().equalsIgnoreCase("Cocacola")){
                    vista.l2.setIcon(Modelo.imagen8());
                    Precio=String.valueOf(2000);
                    Datos a= new Datos(favorito,combo,asado,hamburguesa,bebida,Precio);
                    p.adicionar(a);
                   }
                  if(vista.b10.getText().equalsIgnoreCase("Seven up")){
                    vista.l2.setIcon(Modelo.imagen9());
                    Precio=String.valueOf(2000);
                    Datos a= new Datos(favorito,combo,asado,hamburguesa,bebida,Precio);
                    p.adicionar(a);
                   }
                    
                    vista.model.setRowCount(0);
                       for(int i=0;i<p.tamaño();i++){
                              Object[] fila={
                              p.obtener(i).getFavorito(),
                              p.obtener(i).getCombo(),
                              p.obtener(i).getAsado(),
                              p.obtener(i).getHamburguesa(),
                              p.obtener(i).getBebidas(),   
                              p.obtener(i).getPrecio()
                      };
                       
                      vista.model.addRow(fila);
                   }
                      for(int i=0; i < vista.table.getColumnCount(); i++) {
                         escribir.write(vista.table.getColumnName(i) + "\t");
                   }
                    escribir.write("\n");

                    for(int i=0; i< vista.table.getRowCount(); i++) {
                        for(int j=0; j < vista.table.getColumnCount(); j++) {
                            escribir.write(vista.table.getValueAt(i,j).toString()+"\t");
                        }
                        escribir.write("\n");
                    }
                    escribir.close(); 
                  
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "no se puede escribir sobre el archivo");
                }    
            }           
        }
         if(vista.info==ae.getSource()){
             if(ae.getActionCommand().equalsIgnoreCase("Menu")){
                 
                 vista2.l6.setIcon(Modelo.imagen10());
                 vista2.l7.setIcon(Modelo.imagen2());
                 vista2.l8.setIcon(Modelo.imagen4());
                 vista2.l9.setIcon(Modelo.imagen6());
                 vista2.l10.setIcon(Modelo.imagen9());

                 vista2.setVisible(true);
                             
             }     
             
         }
          if(vista2.b2==ae.getSource()){
              if(ae.getActionCommand().equalsIgnoreCase("ver")){
                    JOptionPane.showMessageDialog(null, "Combos:\n ♦Combo tipico: Un pollo asado 4 papas saladas 4 arepas gaseosa-22000\n"
                    +"♦Combo ligth: Pollo a la parrilla, papas a la francesa, Arroz, Ensalada y gaseosa particular-15000  ");
               }         
             }
          if(vista2.b1==ae.getSource()){
              if(ae.getActionCommand().equalsIgnoreCase("ver")){
                  JOptionPane.showMessageDialog(null, "♦Costillas con dorado: costillas BBQ con platano-26000 \n "
                  +"♦Cordon Blue italiano: compre Cordon Blue y opcionalmente puede pedir Espagueti con salsa-24000");
              }
          }
          if(vista2.b3==ae.getSource()){
              if(ae.getActionCommand().equalsIgnoreCase("ver")){
                  JOptionPane.showMessageDialog(null, "♦Pollo entero-18500 \n "
                  +"♦Medio pollo-15900");
              }
          }
          if(vista2.b4==ae.getSource()){
              if(ae.getActionCommand().equalsIgnoreCase("ver")){
                  JOptionPane.showMessageDialog(null, "♦Hamburguesa BBQ: Doble carne con queso, con papas , su respectiva salsa, con cebolla, pepinillos y lechuga-30000 \n"
                  +"♦Hamburguesa de pollo: Con pollo apanado, salsa de tomate y mostaza, lechuga, cebolla, tomate y con papas-28000");
              }
          }
          if(vista2.b5==ae.getSource()){
              if(ae.getActionCommand().equalsIgnoreCase("ver")){
                  JOptionPane.showMessageDialog(null, "♦Cocacola-2000\n "
                  +"♦Seven up-2000");
              }
          }
          if(vista.b11==ae.getSource()){
              if(ae.getActionCommand().equalsIgnoreCase("Nuevo")){
                  vista.b2.setText(null);
                  vista.b5.setText(null);
                  vista.b7.setText(null);
                  vista.b8.setText(null);
                  vista.b10.setText(null);
              }
          }
    }
}
