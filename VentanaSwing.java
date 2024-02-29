import javax.swing.*;
import java.awt.event.*;

public class VentanaSwing {
    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Ventana de Ejemplo");
        
        // Crear un botón
        JButton button = new JButton("Saludar");
        
        // Agregar un ActionListener al botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje de saludo en una ventana emergente
                JOptionPane.showMessageDialog(frame, "¡Hola, mundo!");
            }
        });
        
        // Agregar el botón al contenido de la ventana
        frame.getContentPane().add(button);
        
        // Configurar el tamaño de la ventana
        frame.setSize(300, 200);
        
        // Hacer visible la ventana
        frame.setVisible(true);
        
        // Configurar la operación de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
