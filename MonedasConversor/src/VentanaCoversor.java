import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaCoversor extends JFrame {
    public VentanaCoversor() {
        this.setSize(500,700);
        this.setMinimumSize(new Dimension(200, 200));
        //this.setLocation(1000, 300);
        //this.setBounds(1000, 300, 500, 700);
        this.setLocationRelativeTo(null);
        this.setTitle("Conversor de Monedas");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        IniciarInterfaz();
    }

    
  
    private void IniciarInterfaz() {
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(null);
        this.getContentPane().add(panel1);

        JLabel etiquetaSaludo = new JLabel("Bienvenidos al Conversor de Monedas", SwingConstants.CENTER);
        etiquetaSaludo.setBounds(5, 10, 500, 50);
        etiquetaSaludo.setForeground(Color.BLACK);
        etiquetaSaludo.setFont(new Font("arial", Font.BOLD, 21));

        ImageIcon imagenMonedas = new ImageIcon("MonedasConversor.jpg");
        JLabel etiquetaImagen = new JLabel();
        etiquetaImagen.setBounds(100, 60, 300, 200);
        etiquetaImagen.setIcon(new ImageIcon(imagenMonedas.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_SMOOTH)));
        panel1.add(etiquetaImagen);
        panel1.add(etiquetaSaludo);
        
    
    }
}
