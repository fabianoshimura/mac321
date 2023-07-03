package mvc.calculator;

// The System. It integrates the three components.

public class CalculatorTextApp {

    public static void main(String[] args) {

        CalculatorTextView theView = new CalculatorTextView();

        CalculatorModel theModel = new CalculatorModel();

        CalculatorTextController theController = new CalculatorTextController(theView, theModel);

    }
}