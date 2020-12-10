public class Expression {
    protected String firstOperand;
    protected String secondOperand;
    protected String operation;

    String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] validOperators = {"+", "-", "*", "/"};


    public Expression(String expression) {
        String[] temp = expression.split(" ");
        firstOperand = temp[0];
        secondOperand = temp[2];
        operation = temp[1];
    }

    boolean isArabicNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean isRomanNumber(String num) {
        for (String temp : romanNumbers) {
            if (num.equals(temp)) {
                return true;
            }
        }
        return false;
    }

    public boolean isOperation(String operation) {
        for (String temp : validOperators) {
            if (operation.equals(temp)) {
                return true;
            }
        }
        return false;
    }

    boolean isArabicExpression() {
        return this.isArabicNumber(firstOperand) && this.isArabicNumber(secondOperand) && this.isOperation(operation);
    }

    boolean isRomanExpression() {
        return this.isRomanNumber(firstOperand) && this.isRomanNumber(secondOperand) && this.isOperation(operation);
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

    public int convertFromRomanToInt(String romanDigit) {
        for (int i = 0; i < romanNumbers.length; i++) {
            if (romanDigit.equals(romanNumbers[i])) {
                return i + 1;
            }
        }
        return 0;
    }

    public void solveRomanExpression() {
        int o1 = this.convertFromRomanToInt(firstOperand);
        int o2 = this.convertFromRomanToInt(secondOperand);
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
