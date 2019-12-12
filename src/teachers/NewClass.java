package teachers;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewClass  implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "B1 clicked");
    }  
   
}
class class2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "B2 clicked");
    }    
}
class Frame extends JFrame{
    public Frame(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 400);
    GridLayout gl = new GridLayout(3,2);
    setLayout(gl);    
    JButton b1 = new JButton("B1");
    JButton b2 = new JButton("B2");
    JButton b3 = new JButton("B3");
    add(b1);
    add(b2);
    add(b3);
    NewClass c = new NewClass();
    class2 c2 = new class2();
    b1.addActionListener(c);    
    b2.addActionListener(c2);
    
    b3.addFocusListener(new java.awt.event.FocusAdapter(){
        public void FocusGained(java.awt.event.FocusEvent e){
            formFocusGained(e);
        }
    }
    );}
    public void formFocusGained(java.awt.event.FocusEvent e){
          JOptionPane.showMessageDialog(null, "B3 is Focused");
    
    }
}
