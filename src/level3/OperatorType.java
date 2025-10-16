package level3;

public enum OperatorType {
    /*속성*/
    ADD('+'), MIN('-'), MUL('*'), DIV('/'), MOD('%');
    private final char operator;

    /*생성자*/
    OperatorType(char operator) {
        this.operator = operator;
    }

    /*기능*/
    public char getOperator() {
        return operator;
    }

}

