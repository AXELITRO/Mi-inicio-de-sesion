package Trabajos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Interfaz extends JFrame implements ActionListener {

private JLabel usuar,contras,inter;
private JButton comp,ext;
private JTextField usu;
private JPasswordField contra;
private String contraseña=("AXELITRO5000"),usuario = ("AXELITRO"),texto=("");
    
public Interfaz(){
    setLayout(null);
    
     usuar = new JLabel("Usuario:");
    usuar.setBounds(105, 210, 150, 50);
    usuar.setFont(new Font("Arial",Font.BOLD,30));
    usuar.setForeground(Color.white);
    add(usuar);
    
    contras = new JLabel("Contraseña:");
    contras.setBounds(50, 280, 200, 50);
    contras.setFont(new Font("Arial",Font.BOLD,30));
    contras.setForeground(Color.white);
    add(contras);
    
    inter = new JLabel("Inicio de sesion");
    inter.setBounds(185 ,0, 280, 50);
    inter.setFont(new Font("Arial",Font.BOLD,30));
    inter.setForeground(Color.white);
    add(inter);
    
    usu = new JTextField();
    usu.setBounds(230, 225, 200, 25);
    usu.setFont(new Font("Arial",Font.BOLD,25));
    add(usu);
    
    contra = new JPasswordField();
    contra.setBounds(230, 295, 200, 25);
    contra.setFont(new Font("Arial",Font.BOLD,25));
    add(contra);
    
    comp = new JButton("Comprobar");
    comp.setBounds(150, 360, 100, 25);
    add(comp);
    comp.addActionListener(this);
    
    ImageIcon imagen = new ImageIcon("Usuario2.png");
    JLabel a3 = new JLabel();
    a3.setBounds(170, 53, 260, 150);
    a3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(a3.getWidth(),a3.getHeight() , Image.SCALE_SMOOTH)));
    add(a3);
    
    ext= new JButton("Exit");
    ext.setBounds(350, 360, 100, 25);
    add(ext);
    ext.addActionListener(this);
}
public void actionPerformed (ActionEvent ae){
    String usuarioIngresado = usu.getText();
    String contraseñaIngresada = contra.getText();
    if(ae.getSource()==comp){
        if(usuarioIngresado.equals(usuario) && contraseñaIngresada.equals(contraseña)){
          //  inter.setText("Inicio correctamente");
            NuevoJFrame nuevoFrame = new NuevoJFrame();
             nuevoFrame.setVisible(true);
             nuevoFrame.setBounds(0, 0, 700, 600);
             nuevoFrame.getContentPane().setBackground(Color.black);
             nuevoFrame.setLocationRelativeTo(null);
             
        }else{
            inter.setText("Error en los datos");
            usu.setText(texto);
            contra.setText(texto);
        }
    }
    if(ae.getSource()==ext){
        System.exit(0);
    }
}
    public static void main(String[] args) {
        
        Interfaz  v1= new Interfaz();
        v1.setBounds(0, 0, 600, 500);
        v1.setVisible(true);
        v1.setLocationRelativeTo(null);
        v1.getContentPane().setBackground(Color.black);
        v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        v1.setResizable(false);
    }
}
