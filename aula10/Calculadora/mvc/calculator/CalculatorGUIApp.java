package mvc.calculator;

// The System. It integrates the three components.

public class CalculatorGUIApp {

    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();

        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView, theModel);

    }
}