/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author GERALDINO_COMP111
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          JOptionPane.showMessageDialog(null, "Welcome to the Scientific Calculator!");

        while (true) {
            String[] options = {
                "Basic Operations", "Trigonometric Functions", "Logarithms and Exponentiation", 
                "Square Roots and Factorial", "Conversion (Radians <-> Degrees)", "Exit"
            };

            int choice = JOptionPane.showOptionDialog(null, "Choose a category:",
                    "Scientific Calculator", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                    null, options, options[0]);

            // Exit condition
            if (choice == 5) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                break;
            }

            try {
                String input = JOptionPane.showInputDialog(null, "Enter your expression:");

                if (input == null || input.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Input cannot be empty. Please try again.");
                    continue;
                }

                double result = 0;
                switch (choice) {
                    case 0: // Basic Operations (Add, Subtract, Multiply, Divide)
                        result = evaluateBasicExpression(input);
                        break;
                    case 1: // Trigonometric Functions
                        result = evaluateTrigonometricFunctions(input);
                        break;
                    case 2: // Logarithms and Exponentiation
                        result = evaluateLogarithmsAndExponentiation(input);
                        break;
                    case 3: // Square Roots and Factorials
                        result = evaluateSquareRootAndFactorial(input);
                        break;
                    case 4: // Conversion (Radians <-> Degrees)
                        result = evaluateConversion(input);
                        break;
                }

                JOptionPane.showMessageDialog(null, "The result is: " + result);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }

    // Basic arithmetic operations
    private static double evaluateBasicExpression(String expression) throws Exception {
        String[] tokens = expression.split(" ");
        if (tokens.length != 3) throw new Exception("Invalid expression. Format should be operand operator operand.");

        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[2]);
        String operator = tokens[1];

        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) throw new Exception("Cannot divide by zero.");
                return operand1 / operand2;
            default:
                throw new Exception("Unknown operator.");
        }
    }

    // Trigonometric functions (sin, cos, tan) - radians by default
    private static double evaluateTrigonometricFunctions(String expression) throws Exception {
        String[] tokens = expression.split("\\(");
        String function = tokens[0].toLowerCase();

        if (!expression.contains(")")) {
            throw new Exception("Invalid expression. Function should have an argument in parentheses.");
        }

        String argumentStr = tokens[1].replace(")", "").trim();
        double argument = Double.parseDouble(argumentStr);

        switch (function) {
            case "sin":
                return Math.sin(argument);
            case "cos":
                return Math.cos(argument);
            case "tan":
                return Math.tan(argument);
            default:
                throw new Exception("Unknown function.");
        }
    }

    // Logarithms and Exponentiation
    private static double evaluateLogarithmsAndExponentiation(String expression) throws Exception {
        if (expression.contains("log10")) {
            String[] tokens = expression.split("\\(");
            String argumentStr = tokens[1].replace(")", "").trim();
            double argument = Double.parseDouble(argumentStr);
            return Math.log10(argument);
        } else if (expression.contains("log")) {
            String[] tokens = expression.split("\\(");
            String argumentStr = tokens[1].replace(")", "").trim();
            double argument = Double.parseDouble(argumentStr);
            return Math.log(argument);
        } else if (expression.contains("^")) {
            String[] tokens = expression.split("\\^");
            double base = Double.parseDouble(tokens[0].trim());
            double exponent = Double.parseDouble(tokens[1].trim());
            return Math.pow(base, exponent);
        } else {
            throw new Exception("Invalid logarithmic or exponentiation expression.");
        }
    }

    // Square Root and Factorial
    private static double evaluateSquareRootAndFactorial(String expression) throws Exception {
        if (expression.contains("sqrt")) {
            String[] tokens = expression.split("\\(");
            String argumentStr = tokens[1].replace(")", "").trim();
            double argument = Double.parseDouble(argumentStr);
            return Math.sqrt(argument);
        } else if (expression.contains("!")) {
            String numberStr = expression.replace("!", "").trim();
            int number = Integer.parseInt(numberStr);
            return factorial(number);
        } else {
            throw new Exception("Invalid square root or factorial expression.");
        }
    }

    // Factorial calculation
    private static double factorial(int number) {
        if (number == 0) return 1;
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Conversion between Radians and Degrees
    private static double evaluateConversion(String input) throws Exception {
        if (input.toLowerCase().contains("rad")) {
            String[] tokens = input.split("\\*");
            double radians = Double.parseDouble(tokens[0].trim());
            return radians * 180 / Math.PI;
        } else if (input.toLowerCase().contains("deg")) {
            String[] tokens = input.split("\\*");
            double degrees = Double.parseDouble(tokens[0].trim());
            return degrees * Math.PI / 180;
        } else {
            throw new Exception("Invalid conversion expression.");
        }
    }
}