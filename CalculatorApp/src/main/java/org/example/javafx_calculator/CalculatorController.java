import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController{
    private Calculator calculator = new Calculator();
    private StringBuilder currentInput = new StringBuilder();
    private boolean isOperatorSet = false;
    private boolean isDecimalAdded = false;

    @FXML
    private TextField text;

    @FXML
    private void onClickBut1() { appendDigit("1"); }
    @FXML
    private void onClickBut2() { appendDigit("2"); }
    @FXML
    private void onClickBut3() { appendDigit("3"); }
    @FXML
    private void onClickBut4() { appendDigit("4"); }
    @FXML
    private void onClickBut5() { appendDigit("5"); }
    @FXML
    private void onClickBut6() { appendDigit("6"); }
    @FXML
    private void onClickBut7() { appendDigit("7"); }
    @FXML
    private void onClickBut8() { appendDigit("8"); }
    @FXML
    private void onClickBut9() { appendDigit("9"); }
    @FXML
    private void onClickBut0() { appendDigit("0"); }

    private void appendDigit(String digit) {
        if (isOperatorSet) {
            currentInput.setLength(0);
            isOperatorSet = false;
        }
        currentInput.append(digit);
        text.setText(currentInput.toString());
    }

    @FXML
    private void onPlusClick() { setOperator('+'); }
    @FXML
    private void onMinusClick() { setOperator('-'); }
    @FXML
    private void onMultiplyClick() { setOperator('*'); }
    @FXML
    private void onDivideClick() { setOperator('/'); }

    private void setOperator(char operator) {
        calculator.setOperand1(Double.parseDouble(currentInput.toString()));
        calculator.setOperator(operator);
        isOperatorSet = true;
        isDecimalAdded = false;
    }

    @FXML
    private void onEqualClick() {
        calculator.setOperand2(Double.parseDouble(currentInput.toString()));
        calculator.calculate();
        if (calculator.isError()) {
            text.setText("Error: Division by Zero");
        } else {
            text.setText(String.valueOf(calculator.getResult()));
        }
        currentInput.setLength(0);
        isDecimalAdded = false;
    }

    @FXML
    private void onClearClick() {
        calculator.reset();
        currentInput.setLength(0);
        text.clear();
        text.setText("0");
        isDecimalAdded = false;
    }
}

