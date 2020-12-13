
// class for Roman expressions
public class RomanExpression extends Expression {


    //constructor of RomanExpression
    public RomanExpression(String expression) {
        String[] temp = expression.split(" ");
        if (temp.length < 3) {
            throw new NumberFormatException("Wrong input of expression!");
        }
        RomanNumeral first = new RomanNumeral(temp[0]);
        RomanNumeral second = new RomanNumeral(temp[2]);
        if (first.toInt() > 10 || second.toInt() > 10 || first.toInt() < 0 || second.toInt() < 0) {
            throw new NumberFormatException("Operators must be less then 10 and more then 0!");
        }
        firstOperand = first.toString();
        secondOperand = second.toString();
        if (isOperation(temp[1])) {
            operation = temp[1];
        }
        else {
            throw new NumberFormatException("Only +, -, /, * operators are allowed!");
        }
    }

    //method for solving Roman expression and printing out the result
    public void solveRomanExpression() {
        int o1 = (new RomanNumeral(this.firstOperand).toInt());
        int o2 = (new RomanNumeral(this.secondOperand).toInt());
        switch (operation) {
            case "+":
                System.out.println(RomanNumeral.toString(o1 + o2));
                break;
            case "-":
                System.out.println(RomanNumeral.toString(o1 - o2));
                break;
            case "/":
                System.out.println(RomanNumeral.toString(o1 / o2));
                break;
            case "*":
                System.out.println(RomanNumeral.toString(o1 * o2));
                break;
            default:
                System.out.println("Unknown error!");
                break;
        }
    }


}
