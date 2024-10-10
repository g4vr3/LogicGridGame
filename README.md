# Logic Grid Game

## Description
Logic Grid Game is a simple puzzle game implemented in Java. The goal of the game is to turn all the grid buttons green by toggling their states. However, clicking a button also toggles the state of its adjacent buttons (up, down, left, and right). Can you find the correct sequence of moves to turn all the buttons green?

## Game Rules
The game consists of a 3x3 grid of buttons.
Each button has two states:
- Green: represents an "on" state.
- Default (no color): represents an "off" state.

Clicking any button toggles its state between "on" and "off".  
Clicking a button also toggles the state of its adjacent buttons (above, below, left, and right).  
The objective is to turn all buttons green to win the game.

## How to Play
1. Run the game (instructions below).
2. A 3x3 grid of buttons will be displayed.
3. Click on any button to toggle its state and its neighbors' states.
4. The game ends when all buttons are turned green.
5. Upon completing the game, a victory message will be displayed, and the board will reset for a new round.

## Requirements
- Java 8 or higher
- Maven (optional, for build management)

## Project Structure
The project follows the Model-View-Controller (MVC) architecture to separate concerns and ensure maintainability:

- **Model (Model.java)**: Handles the game logic, including the current state of the buttons and toggling behavior.
- **View (View.java)**: Manages the user interface (the 3x3 grid of buttons) and displays updates.
- **Controller (Controller.java)**: Acts as the intermediary between the model and the view, handling user input and updating the game state.

## Class Overview
- **Main.java**: Entry point of the program.
- **Model.java**: Manages the state of the grid and handles the logic for toggling button states.
- **View.java**: Renders the game grid and provides the user interface.
- **Controller.java**: Handles user input, updates the model, and syncs the view with the game state.

## Future Improvements
Some possible improvements to enhance the game:
- Add difficulty levels with larger grids.
- Include a timer to challenge players.
- Implement a scoring system based on the number of moves.

## Contribution
Feel free to fork this repository, report issues, or suggest improvements via pull requests. Contributions are always welcome!
