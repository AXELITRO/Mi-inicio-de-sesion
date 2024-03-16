
package Trabajos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class NuevoJFrame extends JFrame implements ActionListener{
private JLabel nombre;
private JButton ext;
public NuevoJFrame(){
    setLayout(null);
    nombre = new JLabel("Inicio de sesión exitoso");
    nombre.setBounds(180 ,50,400, 50);
    nombre.setFont(new Font("Arial",Font.BOLD,30));
    nombre.setForeground(Color.white);
    add(nombre);
    
     ext= new JButton("Exit");
    ext.setBounds(350, 360, 100, 25);
    add(ext);
    ext.addActionListener(this);
}
public void actionPerformed (ActionEvent ae){
    if(ae.getSource()==ext){
        System.exit(0);
    }
}
    public static void main(String[] args) {
        
       
        
    }
    
}
