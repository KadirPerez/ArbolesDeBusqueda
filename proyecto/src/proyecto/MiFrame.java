package proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MiFrame extends JFrame {
    private JDialog miDialogo;

    public MiFrame() {
        // Configurar JFrame
        setTitle("Mi JFrame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurar JDialog
        miDialogo = new JDialog(this, "Mi JDialog", true);
        miDialogo.setSize(200, 150);

        // Agregar un WindowListener al JFrame
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent e) {
                // Evitar que el JDialog se cierre al minimizar el JFrame
                if (miDialogo != null) {
                    miDialogo.setVisible(false);
                }
            }
        });

        // Botón en el JDialog para cerrar manualmente
        JButton cerrarDialogoButton = new JButton("Cerrar JDialog");
        cerrarDialogoButton.addActionListener(e -> miDialogo.setVisible(false));
        miDialogo.add(cerrarDialogoButton);

        // Botón en el JFrame para mostrar el JDialog
        JButton mostrarDialogoButton = new JButton("Mostrar JDialog");
        mostrarDialogoButton.addActionListener(e -> miDialogo.setVisible(true));
        add(mostrarDialogoButton, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MiFrame frame = new MiFrame();
            frame.setVisible(true);
        });
    }
}
