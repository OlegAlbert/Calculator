import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String expression = reader.readLine();
            System.out.println(expression);

        Expression e = new Expression(expression);
        if (e.isArabicExpression()) {
            e.solveArabicExpression();
        }
        else if (e.isRomanExpression()) {
            e.solveRomanExpression();
        }
        else {
            System.out.println("Unknown expression");
        }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
