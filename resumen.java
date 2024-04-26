
package taller;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class resumen extends JFrame {
  String resumenlib="capitulo 08:\n"+
          "     nos muestra como Wade comienza su búsqueda de la primera llave, la de cobre\n"+
          "     como logra entrar en la mazmorra y encuentra una similitud casi absoluta con el libro\n"+
          "     de 'dragones y mazmorras', como cada pasadizo es igual al descrito en el libro\n"+
          "     se muestra además el terror que el siente por enfrentarse al grandioso esqueleto\n"+
          "     viviente que se encontraba en la tumba de los horrores, aparte se demuestra como\n"+
          "     gracias a sus años informándose sobre la cultura pop y jugando todos los videojuegos \n"+
          "     relacionados con la época le ayudo a general una gran habilidad, al punto de dominar\n"+
          "     cada juego, solo gracias a esto se logró defender contra Acererak, el no sabía a que se\n"+
          "     enfrentaba, ni que juego jugaría, por suerte el jugo por mucho tiempo con su gran amigo\n"+
          "     z, de no ser por eso no lo hubiera logrado, aparte llegando al final de la partida se le \n"+
          "     ocurre una hazaña que sin saberlo lo dejaría en ventaja, el solo lo hacía por comodidad\n"+
          "     pero le aseguro la victoria, esto fue cambiar de lugar con el increíble Acererak.";
  
  
  
  JTextArea resum = new JTextArea();
  
  public resumen() {
      setLayout(null);
      setBounds(10, 50, 550, 300);
      setTitle("primer punto");
      //setResizable(false);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      resum.setText(resumenlib);
      resum.setBounds(10, 10, 1500, 1000);
      resum.setFont(new Font ("Monotype Corsiva", Font.ITALIC, 15));
      resum.setForeground(Color.magenta);
      add(resum);
      setVisible(true);
  }

}
