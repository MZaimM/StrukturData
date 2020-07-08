package pendahuluanmod9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;

public class Pendahuluanmod9 extends JFrame implements ActionListener{
    //membuat object text field
    JTextField text = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    //membuat objek JLabel
    JLabel label = new JLabel("Masukkan Angka Pertama");
    JLabel label1 = new JLabel("Masukkan Angka Kedua");
    JLabel label2 = new JLabel("Hasil");
    //membuat tombol
    Button b1 = new Button("+");
    Button b2 = new Button("-");
    Button b3 = new Button("/");
    Button b4 = new Button("*");

    Pendahuluanmod9() {
        setTitle("Terserah");
        setLocation(200, 100);
        setSize(200, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void objek() {
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.cyan);
        getContentPane().add(text);
        getContentPane().add(text2);
        getContentPane().add(text3);
        getContentPane().add(label);
        getContentPane().add(label1);
        getContentPane().add(label2);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        label.setBounds(20, 20, 150, 20);
        text.setBounds(20, 40, 150, 20);
        label1.setBounds(20, 60, 150, 20);
        text2.setBounds(20, 80, 150, 20);
        label2.setBounds(20, 100, 150, 20);
        text3.setBounds(20, 120, 150, 20);
        b1.setBounds(20, 150, 30, 20);
        b2.setBounds(80, 150, 30, 20);
        b3.setBounds(140, 150, 30, 20);
        b4.setBounds(80, 180, 30, 20);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        int i = (int) Double.parseDouble(text.getText());
        int j = (int) Double.parseDouble(text2.getText());
        
        if (e.getSource() == b1) {
            text3.setText(String.valueOf(i+j));
        }
        
        if (e.getSource() == b2) {
            text3.setText(String.valueOf(i-j));
        }
        
        if (e.getSource() == b3) {
            text3.setText(String.valueOf(i/j));
        }
        
        if (e.getSource() == b4) {
            text3.setText(String.valueOf(i*j));
        }
        
    }
    public static void main(String[] args) {
        Pendahuluanmod9 zz = new Pendahuluanmod9();
        zz.objek();
    }
}