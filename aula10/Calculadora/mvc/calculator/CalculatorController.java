package mvc.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        // Tell the View that whenever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class

        this.theView.addCalculateListener(new CalculateListener());

        // Show yourself!
        theView.setVisible(true);
    }

    class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered

            try {

                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.calculate(firstNumber, secondNumber);

                theView.setCalcSolution(theModel.getResult());

            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers");

            }

        }

    }

}
