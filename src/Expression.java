
//main class of expression
public abstract class Expression {
    protected String firstOperand;
    protected String secondOperand;
    protected String operation;

    //only these operators are allowed
    static protected String[] validOperators = {"+", "-", "*", "/"};

    protected Expression() {
    }

    public Expression(String expression) {
        String[] temp = expression.split(" ");
        if (temp.length < 3) {
            throw new NumberFormatException("Wrong input of expression!");
        }
        firstOperand = temp[0];
        secondOperand = temp[2];
        operation = temp[1];
        if (!isOperation(operation)) {
            throw new NumberFormatException("Only +, -, /, * operators are allowed!");
        }
    }

    static boolean isOperation(String operation) {
        for (String temp : validOperators) {
            if (operation.equals(temp)) {
                return true;
            }
        }
        return false;
    }
}
