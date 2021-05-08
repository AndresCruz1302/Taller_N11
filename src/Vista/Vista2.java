
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista2 extends JFrame implements ActionListener {
    public JPanel p2;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    public JButton b1,b2,b3,b4,b5;
    public Vista2(){
        this.setTitle("Menu");
        setBounds(200, 0, 900, 800);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
         p2=new JPanel();
         p2.setLayout(null);
         
         l1=new JLabel("Promocion");
         l1.setBounds(30, 250, 150, 20);
         
         l2=new JLabel("Combos");
         l2.setBounds(180, 250, 150, 20);
         
         l3=new JLabel("Asado");
         l3.setBounds(340, 250, 150, 20);
         
         l4=new JLabel("Hamburguesa");
         l4.setBounds(510, 250, 150, 20);
         
         l5=new JLabel("Bebidas");
         l5.setBounds(680, 250, 150, 20);
         
         l6=new JLabel();
         l6.setBounds(0, 180, 150, 400);
         
         l7=new JLabel();
         l7.setBounds(150, 180, 150, 400);
         
         l8=new JLabel();
         l8.setBounds(320, 180, 150, 400);
         
         l9=new JLabel();
         l9.setBounds(490, 180, 150, 400);
         
         l10=new JLabel();
         l10.setBounds(650, 180, 150, 400);
         
         b1=new JButton("Ver");
         b1.setBounds(30, 500, 90, 20);
         
         b2=new JButton("Ver");
         b2.setBounds(180, 500, 90, 20);
         b2.addActionListener(this);
         b3=new JButton("Ver");
         b3.setBounds(340, 500, 90, 20);
         
         b4=new JButton("Ver");
         b4.setBounds(510, 500, 90, 20);
         
         b5=new JButton("Ver");
         b5.setBounds(680, 500, 90, 20);
         
          add(p2);
          p2.add(l1);
          p2.add(l2);
          p2.add(l3);
          p2.add(l4);
          p2.add(l5);
          p2.add(l6);
          p2.add(l7);
          p2.add(l8);
          p2.add(l9);
          p2.add(l10);
          p2.add(b1);
          p2.add(b2);
          p2.add(b3);
          p2.add(b4);
          p2.add(b5);

         
         
         
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
}
