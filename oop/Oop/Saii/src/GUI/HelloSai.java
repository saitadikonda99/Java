package GUI;
import javax.swing.*;
public class HelloSai {
    public static void main(String[] args) {
    JFrame F = new javax.swing.JFrame ();

    JButton B = new javax.swing.JButton ("click");

    B.setBounds ( 200 , 300 , 400 , 500 );
    F.add(B);
    F.setSize ( 400, 300 );
    F.setVisible ( true );

    }
}
