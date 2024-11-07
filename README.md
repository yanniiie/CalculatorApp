# CalculatorApp

A simple calculator application built with JavaFX following the Model-View-Controller (MVC) design pattern. This calculator supports basic arithmetic operations: addition, subtraction, multiplication, and division.

## Features
- Basic arithmetic operations: addition, subtraction, multiplication, division.
- Error handling for division by zero.
- Clear button to reset the calculator for a new operation.
- Intuitive and user-friendly interface.

## Project Structure
The project is structured as follows:
- **Calculator.java**: Implements the core calculation logic, handling operations and error conditions.
- **CalculatorController.java**: The controller class that manages user interactions, connects the model (Calculator.java) and the view (CalculatorView.fxml).
- **Main.java**: The main application class that sets up the JavaFX stage and loads the FXML layout.
- **hello-view.fxml**: Defines the graphical user interface layout for the calculator.


## Getting Started

### Prerequisites
- Java JDK 11 or higher.
- JavaFX SDK.

### Running the Application
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/CalculatorApp.git
    ```
2. Open the project in your IDE (e.g., IntelliJ IDEA, Eclipse).
3. Configure JavaFX SDK:
   - Set the JavaFX library path in your project settings.
4. Run the `Main` class to launch the calculator.

### Usage
1. **Enter Numbers**: Click the number buttons to enter a value.
2. **Operators**: Choose an operator (+, -, *, /).
3. **Equals**: Click `=` to calculate the result.
4. **Clear**: Press `C` to reset the display for a new calculation.

## Screenshots
![Calculator Screenshot](https://github.com/user-attachments/assets/15ecc915-d3e6-4470-9321-e68be122f136)


## Contributing
Feel free to fork the repository and submit pull requests to improve the application.

