package model;

public class Model {
    private boolean[][] states; // true = verde, false = color por defecto

    public Model() {
        states = new boolean[3][3]; // Se inicializa a false
    }

    // Devuelve el estado del botón en la posición (fila, columna)
    public boolean getState(int row, int col) {
        return states[row][col];
    }

    // Cambia el estado del botón y los adyacentes
    public void toggleState(int row, int col) {
        // Cambiar el estado del botón clicado
        states[row][col] = !states[row][col];

        // Cambiar el estado de los adyacentes
        if (row > 0)
            states[row - 1][col] = !states[row - 1][col]; // Arriba
        if (row < 2)
            states[row + 1][col] = !states[row + 1][col]; // Abajo
        if (col > 0)
            states[row][col - 1] = !states[row][col - 1]; // Izquierda
        if (col < 2)
            states[row][col + 1] = !states[row][col + 1]; // Derecha
    }

    // Resetear los estados de todos los botones a false
    public void resetStates() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                states[row][col] = false; // Resetear al color por defecto
            }
        }
    }
}
