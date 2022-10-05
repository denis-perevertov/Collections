package Behavioral.Interpreter;

public class InterpreterDemo {

    public static void main(String[] args) {

        String equation = "25+20-2+11";
        Evaluate evaluate = new Evaluate();
        Expression expr = evaluate.evaluate(equation);
        System.out.println(expr.interpret());

    }
}

interface Expression {
    int interpret();
}

class Number implements Expression {

    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

class Plus implements Expression {

    Expression left;
    Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}

class Minus implements Expression {

    Expression left;
    Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}

class Multiple implements Expression {

    Expression left;
    Expression right;

    public Multiple(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }

}

class Divide implements Expression {

    Expression left;
    Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }

}

class Evaluate {

    Expression evaluate(String s) {

        int pos = s.length() - 1;
        while(pos > 0) {
            if(Character.isDigit(s.charAt(pos))) {
                pos--;
            }
            else {
                Expression left = evaluate(s.substring(0, pos));
                Expression right = new Number(Integer.valueOf(s.substring(pos+1, s.length())));
                char sign = s.charAt(pos);
                switch(sign) {
                    case '+': return new Plus(left, right);
                    case '-': return new Minus(left, right);
                    //case '*': return new Multiple(left, right);
                    //case '/': return new Divide(left, right);
                    default: return new Plus(left, right);
                }
            }
        }

        int result = Integer.valueOf(s);
        return new Number(result);


    }

}



