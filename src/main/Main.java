package main;

import controller.Controller;
import model.Model;
import view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        @SuppressWarnings("unused")
        Controller controller = new Controller(view, model);
        
        view.setVisible(true);  // Mostrar la ventana del juego
    }
}
