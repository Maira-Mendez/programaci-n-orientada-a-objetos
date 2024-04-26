/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class numeros extends JFrame {
    
    private int [] numeros = new int [2];
    private double [] resultados = new double [2];
    private String [] textos = new String [2]; 
    private JTextField [] datos = new JTextField [2];
    private JButton boton;
    private String [] entrada  = new String [2];
    private JLabel [] eti = new JLabel [5]; 
    private JFrame result = new JFrame("TU RESULTADO ES:");
    
    public numeros () throws HeadlessException{
        
        setLayout(null);
        setBounds(350, 100, 400, 200);
        setTitle("segundo punto");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        eti [0]= new JLabel (" y ");
        eti [1] = new JLabel("sumita de cuadrados");
        eti [2] = new JLabel ("raiz de la sumita ");
        eti [3] = new JLabel ();
        eti [4] = new JLabel ();
        
        result.setLayout(null);
        result.setResizable(false);
        result.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        result.setVisible(false);
        result.setBounds(350, 150, 280, 200);
        
        eti[0].setFont(new Font ("Monotype Corsiva", Font.ITALIC, 20));
        eti [1].setFont(new Font ("Monotype Corsiva", Font.ITALIC, 20));
        eti [2].setFont(new Font ("Monotype Corsiva", Font.ITALIC, 20));
        eti [3].setFont(new Font ("Monotype Corsiva", Font.ITALIC, 15));
        eti [4].setFont(new Font ("Monotype Corsiva", Font.ITALIC, 15));
        
        eti[4].setForeground(Color.red);
        eti[3].setForeground(Color.red);
        
        
        datos [0] = new JTextField (1);
        datos [1] = new JTextField (1);
        datos [0].setForeground(Color.BLUE);
        datos [1].setForeground(Color.MAGENTA);
        datos [0].setBackground(Color.lightGray);
        datos [1].setBackground(Color.lightGray);
        
        boton = new JButton ("aceptar");
        boton.setBounds(150, 100, 100, 25);
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada [0]= datos[0].getText();
                entrada [1]= datos[1].getText();
                numeros[0]= Integer.parseInt(entrada[0]);
                numeros[1]= Integer.parseInt(entrada[1]);
                
                if (numeros[0]>numeros[1]){
                    result.remove(eti[4]);
                    result.remove(eti[1]);
                   eti[2].setBounds(65, 60, 900, 25);
                   eti[3].setBounds(65, 100, 150, 15);
                    
                    resultados [0]=raiz(numeros[0], numeros[1]);
                    textos[0]=String.valueOf(resultados[0]);
                    
                    eti[3].setText(textos[0]);
                    
                    result.add(eti[2]);
                    result.add(eti[3]);
                    
                }else if (numeros[0]<numeros[1]){
                    
                    result.remove(eti[2]);
                    result.remove(eti[3]);
                    
                    eti[1].setBounds(60, 60, 900, 25);
                    eti[4].setBounds(110, 100, 150, 15);
                    
                    resultados [1]=cuadrados(numeros[0], numeros[1]);
                    textos[1]=String.valueOf(resultados[1]);
                    
                    eti[4].setText(textos[1]);
                    
                    result.add(eti[1]);
                    result.add(eti[4]);
                    
                }else if (numeros[0]==numeros[1]){
                    
                    eti[1].setBounds(30, 60, 900, 25);
                    eti[4].setBounds(190, 62, 150, 15);
                    eti[2].setBounds(30, 90, 900, 25);
                    eti[3].setBounds(190, 92, 150, 15);
                    
                    resultados[0]=resultados [0]=raiz(numeros[0], numeros[1]);
                    resultados [1]=cuadrados(numeros[0], numeros[1]);
                    
                    textos[0]=String.valueOf(resultados[0]);
                    textos[1]=String.valueOf(resultados[1]);
                    
                    eti[3].setText(textos[0]);
                    eti[4].setText(textos[1]);
                    
                    result.add(eti[1]);
                    result.add(eti[4]);
                    result.add(eti[2]);
                    result.add(eti[3]);
                }
                result.setVisible(true);
            }
            
        });
       add(boton);
       for (int i=0; i<datos.length; i++){
           add(datos[i]);
           
           
        }
       
       datos[0].setBounds(50, 60, 100, 25);
       datos[1].setBounds(250, 60, 100, 25);
       
       add(eti[0]);
       eti[0].setBounds(190, 60, 100, 25);
       setVisible(true);
       
    }
       public double cuadrados(int a, int b){
           return (a*a)+(b*b);

       } 
       
       public double raiz (int a, int b){
           double sum;
           sum=Math.sqrt(a+b);
           return sum;
       }
            
}
