package mvc.calculator;

import java.util.Scanner;

public class CalculatorTextView {

    private Scanner scanner;

    private int theFirstNumber;
    private int theSecondNumber;
    private int theResult;

    private Observer calcObserver;

    public CalculatorTextView() {
        System.out.println("Welcome to Calculator\n - You are in text mode");
        scanner = new Scanner(System.in);        
    }    

    // Getters and setters

    public int getTheFirstNumber() {
        return theFirstNumber;
    }

    public void setTheFirstNumber(int theFirstNumber) {
        this.theFirstNumber = theFirstNumber;
    }

    public int getTheSecondNumber() {
        return theSecondNumber;
    }

    public void setTheSecondNumber(int theSecondNumber) {
        this.theSecondNumber = theSecondNumber;
    }

    public int getTheResult() {
        return theResult;
    }

    public void setTheResult(int theResult) {
        this.theResult = theResult;
    }

    public void addCalculateObserver(Observer observer) {
        calcObserver = observer;
    }

    // Main loop for text-based interaction

    public void run() {
        while (true) {
            readFirstNumber();
            readSecondNumber();
            calcObserver.update();
        }
    }    

    public void readFirstNumber() {
        System.out.print("Enter first integer: ");
        setTheFirstNumber(scanner.nextInt());
    }

    public void readSecondNumber() {
        System.out.print("Enter second integer: ");
        setTheSecondNumber(scanner.nextInt());
    }      

    public void displayResult() {
        System.out.println("Result: " + theResult);
    }

    protected void finalize() {  
        scanner.close();
    }  
}
