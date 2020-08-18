// CSCI 132 Project 1
// Susan McCartney
//July 6, 2020

package Project1;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    // FIELDS
    private double answer;
    private Scanner scannedInput = new Scanner(System.in);

    // change the modifiers to make the field belong to the class a whole,
    // accessible from main(), and a constant so it can’t be reassigned.
    public String usageInstructions = "Valid operations are: \n"
            + " + \t add \n - \t subtract \n * \t multiply \n / \t divide \n"
            + " c \t clear  \n neg \t negate \n % \t percent \n"
            + " ^ \t raise to power of next value entered \n inv \t invert the current value \n"
            + " rand \t radomize current value by a fractional amount \n"
            + " round \t round to number of places given next \n" + " = \t print answer \n ? \t Help \n q \t Quit \n";

    // make pi to a defined constant double
    final double ROUGHLY_PI = 3.14159;

    // CONSTRUCTORS
    Calculator() {
        this.answer = 0;
    };

    // METHODS
    // prompt user for a double and check before returning
    public double getUserNum() {
        boolean validNumber = false;
        double userVal = 0;

        System.out.print("Enter number\n>>> ");

        while (validNumber == false) {
            if (scannedInput.hasNext("pi")) {
                // make this a constant instead of 3.1: ROUGLY_PI to five decimal places
                userVal = ROUGHLY_PI;
                scannedInput.next();
                validNumber = true;
            } else if (scannedInput.hasNextDouble()) {
                userVal = scannedInput.nextDouble();
                validNumber = true;
            } else {
                System.out.print("That's not a number. \nEnter a valid number\n>>> ");
                scannedInput.next();
            }
        }
        return userVal;
    }

    // prompt user for operation and check before returning
    public String getUserOp() {
        String op;

        System.out.print("Enter operation\n>>> ");
        op = scannedInput.next();
        while (!(this.checkUserOp(op))) {
            op = scannedInput.next();
        }
        return op;
    }

    // private helper method for getUserInput()
    private boolean checkUserOp(String op) {
        if (op.equals("+") || op.equals("-") || op.equals("=") || op.equals("?") || op.equals("Q") || op.equals("q")
                || op.equals("*") || op.equals("/") || op.equals("c") || op.equals("C") || op.equals("neg")
                || op.equals("%") || op.equals("^") || op.equals("inv") || op.equals("rand") || op.equals("round")) {
            return true;
        } else {
            System.out.print("Invalid Entry. Enter '?' for help." + "\nEnter a valid operation \n>>> ");
            return false;
        }
    }

    public double calculateAnswer(String op, double num) {
        switch (op) {
            case "+":
                // add the current answer by the user number
                add(num);
                break;
            case "-":
                // subtract the current answer by the user number
                subtract(num);
                break;
            case "*":
                // multiply the current answer by the user number
                multiply(num);
                break;
            case "/":
                // divide the current answer by the user number
                divide(num);
                break;
            case "c":
            case "C":
                // clear the current answer and return the result (0)
                clear(num);
                break;
            case "neg":
                // negate the current answer
                negate(num);
                break;
            case "%":
                // convert the current answer to a percentage
                percent(num);
                break;
            case "^":
                // raise current answer to the user number
                power(num);
                break;
            case "inv":
                // invert the current answer (n ====> 1/n)
                inv(num);
                break;
            case "rand":
                // add or subtract some random decimal amount between 0 and 1
                rand(num);
                break;
            case "round":
                // round to a given number of decimal places
                roundTo(num);
                break;
            case "=":
                // print out the answer
                printAnswer();
                break;
            case "?":
                System.out.println(this.usageInstructions);
                break;
            default:
                System.out.println("Invalid Operator");
        }
        return this.answer;
    }

    // take the answer and add by the user's number choice
    public double add(double operand) {
        this.answer += operand;
        return this.answer;
    }

    // take the answer and subtract by the user's number choice
    public double subtract(double operand) {
        this.answer -= operand;
        return this.answer;
    }

    // take the answer and multiply by the user's number choice
    public double multiply(double operand) {
        this.answer *= operand;
        return this.answer;
    }

    // take the answer and divide it by the user's number choice
    public double divide(double operand) {
        this.answer /= operand;
        return this.answer;
    }

    // take the answer and clear it to make the answer equal 0.0
    public double clear(double operand) {
        this.answer = 0.0;
        return this.answer;
    }

    // take the answer and put a negative in front of it
    public double negate(double operand) {
        this.answer = -this.answer;
        return this.answer;
    }

    // take the answer and divide it by 100 to get a decimal and then multiply
    // by 100 to get the percent
    public double percent(double operand) {
        this.answer = (this.answer / 100) * 100;
        return this.answer;
    }

    // take the number and turn it into a decimal of it's inverted form,

    // unfortunately fractions aren't an outcome in java yet, only decimals
    public double inv(double operand) {
        if (this.answer == 0) {
            return 0;
        } else {
            this.answer = 1 / operand;
            return this.answer;
        }
    }

    // take the answer and raise it to a power of the user's choice, this is done
    // using the += sign NOT the *= sign
    public double power(double operand) {
        for (int i = 1; i < operand; i++) { // How to do powers in java
            this.answer += operand;
        }
        return this.answer;
    }

    // random number choice between 0.1 and 1.0 and then add or subtract from
    // the orginal answer
    public double rand(double operand) { // how to use random in java
        Random rand = new Random();
        this.answer += rand.nextDouble();
        this.answer -= rand.nextDouble();
        return this.answer;
    }

    // take the answer and round it to the number of specified decimal places
    // if number does not have any decimals then add 0's after the decimal point
    public double roundTo(double operand) {
        if (this.answer != 0) {
            this.answer = roundTo(operand);
        } else {
            this.answer = operand + 0.0000000;
        }
        return this.answer;
    }

    public double getAnswer() {
        return this.answer;
    }

    public void printAnswer() {
        // https://www.fileformat.info/info/unicode/block/box_drawing/list.htm
        // https://www.homeandlearn.co.uk/java/java_formatted_strings.html

        // right justify the output inside a unicode box drawing
        // use the format given in the example and move the answer 25 spaces to
        // the right to line up the format as in the example
        System.out.printf("┌──────────────────────────┐ \n│ %25f│ \n└──────────────────────────┘\n", this.answer);
    }
}
