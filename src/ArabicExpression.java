
//class for Arabic expressions
public class ArabicExpression extends Expression {

    public ArabicExpression(String expression) {
        super(expression);
        if (!isArabicDigit(firstOperand) || !isArabicDigit(secondOperand)) {
            throw new NumberFormatException("Wrong input of expression!");
        }
        if (Integer.parseInt(firstOperand) > 10 || Integer.parseInt(secondOperand) > 10 ||
            Integer.parseInt(firstOperand) < 0  || Integer.parseInt(secondOperand) < 0) {
            throw new NumberFormatException("Operands must be less then 10 and more then 0!");
        }
    }

    static boolean isArabicDigit(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void solveArabicExpression() {
        int o1 = Integer.parseInt(firstOperand);
        int o2 = Integer.parseInt(secondOperand);
        switch (operation) {
            case "+":
                System.out.println(o1 + o2);
                break;
            case "-":
                System.out.println(o1 - o2);
                break;
            case "/":
                System.out.println(o1 / o2);
                break;
            case "*":
                System.out.println(o1 * o2);
                break;
            default:
                System.out.println("Unknown error!");
                break;
        }
    }
}
