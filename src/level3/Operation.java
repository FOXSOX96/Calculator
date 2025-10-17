package level3;

enum Operation {
    ADD('+') {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MIN('-'){
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MUL('*'){
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIV('/'){
        public double apply(double x, double y) {
            return x / y;
        }
    };

    /*속성*/
    private final char symbol;

    /*생성자*/
    Operation(char symbol) {
        this.symbol = symbol;
    }

    /*기능*/
    public abstract double apply(double x, double y);

    /*입력 받은 연산 기호를 enum으로 변환*/
    public Operation fromSymbol(char ch) {
        for (Operation op : values()) {
            if (op.symbol == ch) return op;
        }
        throw new IllegalArgumentException("지원하지 않는 연산자: " + ch);
    }
}