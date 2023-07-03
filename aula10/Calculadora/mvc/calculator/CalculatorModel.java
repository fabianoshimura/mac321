package mvc.calculator;

// The Model performs all the calculations needed
// and that's all! It doesn't know the View exists

public class CalculatorModel {

    // Holds the value of the result of the operation
    // entered in the view

    private int result;

    // Adds two integers
    public void calculate(int firstNumber, int secondNumber) {
        result = firstNumber + secondNumber;
    }

    // Retrieves result of last operation
    public int getResult() {
        return result;
    }

}