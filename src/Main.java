import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter an expression like a + b where a and b - operands (can be Roman numerals), \nand " +
                    "(+, -, /, *) - operators; there are must be spaces between operators and operand:");
            String expression = reader.readLine();

            //the program checks the first character of the expression and determines its type (Roman or Arabic)
            if (expression.length() == 0) {
                throw new NumberFormatException("Wrong input of expression!");
            }
            if (ArabicExpression.isArabicDigit(expression.substring(0, 1))) {
                ArabicExpression e = new ArabicExpression(expression);
                e.solveArabicExpression();
            }
            else if (RomanNumeral.isRomanNumber(expression.substring(0, 1))) {
                RomanExpression e = new RomanExpression(expression);
                e.solveRomanExpression();
            }
            else {
                throw new NumberFormatException("Wrong input of expression!");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
