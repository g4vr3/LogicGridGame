package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.View;

public class Controller {
	private View view;
	private Model model;

	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;

		addListeners(); // Añadir listeners a los botones
		updateView(); // Actualizar vista según estado actual del modelo
	}

	private void addListeners() {
		// Recorrer botones
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				// Variables de fila y columna actuales para utilizar en el ActionListener
				int currentRow = row;
				int currentCol = col;
				// ActionListener al pulsar
				view.getButton(row, col).addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						model.toggleState(currentRow, currentCol); // Actualizar el estado de los botones en modelo
						updateView(); // Actualizar la vista
						if (isGameCompleted()) {
							view.displayWinMessage(); // Mostrar mensaje final
							// Resetear juego
							model.resetStates(); // Resetear los estados del modelo
							updateView(); // Sincronizar la vista con el modelo reseteado
						}
					}
				});
			}
		}
	}

	// Actualizar la vista según el estado actual del modelo
	private void updateView() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				boolean state = model.getState(row, col);
				view.updateButton(row, col, state);
			}
		}
	}

	// Comprobar si el juego ha sido completado
	private boolean isGameCompleted() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				// Si hay un solo botón en estado falso, finalizará el bucle y retornará que
				// completado = false
				if (!model.getState(row, col)) {
					return false;
				}
			}
		}
		return true; // Todos los botones están en estado verdadero, por lo que está completado
	}
}
