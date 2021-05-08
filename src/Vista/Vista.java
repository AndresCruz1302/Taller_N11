
package Vista;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class Vista extends JFrame{
    public JPanel p1;
    public JLabel l1,l2,l3, l4,l5,l6,l7,l8,l9;
    public JTextArea t1, t2,b2,b5,b7,b8,b10;
    public JButton b1, info, b11;
    public Image image;
    public JTable table;
    public DefaultTableModel model;
    public JScrollPane pane;
    public Vista() throws MalformedURLException, IOException{
        this.setTitle("Asadero");
        setBounds(200, 0, 900, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p1=new JPanel();
        p1.setLayout(null);
        
        b11=new JButton("Nuevo");
        b11.setBounds(650, 160, 150, 20);
        
        l3=new JLabel("Demostracion");
        l3.setBounds(300, 80, 100, 20);
       
        l2=new JLabel();
        l2.setBounds(300, -50, 500, 500);
        
        l4=new JLabel("Pedido (elija solo uno)");
        l4.setBounds(20, 20, 150, 20);
        
        l5=new JLabel("Promociones");
        l5.setBounds(20, 40, 100, 20);
        
        l6=new JLabel("Combos");
        l6.setBounds(20, 140, 100, 20);
        
        l7=new JLabel("asado");
        l7.setBounds(20, 240, 100, 20);
        
        l8=new JLabel("Hamburguesas");
        l8.setBounds(20, 340, 100, 20);
        
        l9=new JLabel("Bebidas");
        l9.setBounds(20, 440, 100, 20);
        
        
        b1=new JButton("Pedir");
        b1.setBounds(650,80 , 150, 20);
        
        info=new JButton("Menu");
        info.setBounds(650,120 , 150, 20);
        
      b2=new JTextArea();
      b2.setBounds(20,60 , 200, 20);
      
      b5=new JTextArea();
      b5.setBounds(20,180 , 200, 20);
          
      b7=new JTextArea();
      b7.setBounds(20,280 , 200, 20);
      
      b8=new JTextArea();
      b8.setBounds(20,360 , 200, 20);
      
      
      b10=new JTextArea();
      b10.setBounds(20,460 , 200, 20);
      
        pane=new JScrollPane();
        pane.setBounds(300, 400, 500, 300);
        
        model=new DefaultTableModel();
        
        table=new JTable();
        pane.setViewportView(table);
        model.addColumn("Promocion");
        model.addColumn("Combo");
        model.addColumn("Asado");
        model.addColumn("Hamburguesa");
        model.addColumn("bebida");
        model.addColumn("Precio");
        table.setModel(model);
        
      
               
        
        add(p1);
        p1.add(pane);
        p1.add(l3);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(l4);
        p1.add(b1);
        p1.add(b2);
        p1.add(b5);
        p1.add(b7);
        p1.add(b8);
        p1.add(b10);
        p1.add(b11);
        p1.add(l2);
        p1.add(info);
        
    }
    
}
