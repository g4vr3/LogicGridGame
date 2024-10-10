package view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    private JPanel panel;
    private JButton[][] buttons;

    // Constructor
    public View() {
        initialize();
    }

    // Inicializar componentes
    private void initialize() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 0, 0));  // Cuadrícula 3x3

        setTitle("Juego de Lógica");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);

        buttons = new JButton[3][3];  // Inicializar el array de botones

        // Insertar botones en el panel
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton();
                panel.add(buttons[row][col]);
            }
        }
    }

    // Método para obtener los botones
    public JButton getButton(int row, int col) {
        return buttons[row][col];
    }

    // Actualizar el estado de un botón (verde o por defecto)
    public void updateButton(int row, int col, boolean state) {
        if (state) {
            buttons[row][col].setBackground(Color.GREEN);
        } else {
            buttons[row][col].setBackground(null);  // Color por defecto
        }
    }

    // Mostrar mensaje al completar
    public void displayWinMessage() {
        JOptionPane.showMessageDialog(panel, "¡Has ganado!");
    }
}
