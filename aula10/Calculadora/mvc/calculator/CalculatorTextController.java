package mvc.calculator;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorTextController {

    private CalculatorTextView theView;
    private CalculatorModel theModel;

    public CalculatorTextController(CalculatorTextView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        // The controller observes the view for changes
        // -- usually action triggered by the user
        theView.addCalculateObserver(new CalculateObserver());

        theView.run();
    }

    class CalculateObserver implements Observer {

        public void update() {

            int firstNumber = theView.getTheFirstNumber();
            int secondNumber = theView.getTheSecondNumber();

            theModel.calculate(firstNumber, secondNumber);

            theView.setTheResult(theModel.getResult());
            theView.displayResult();

        }

    }    

}
