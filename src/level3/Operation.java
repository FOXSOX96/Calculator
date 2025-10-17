package level3;

enum Operation {
    ADD('+') {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MIN('-') {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MUL('*') {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIV('/') {
        public double apply(double x, double y) {
            if (y == 0.0) {
                System.out.println("**에러: 0으로 나눌 수 없습니다!");
            }
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

    /*제네릭T의 Number 오버로드*/
    double applyN(Number a, Number b) {
        return apply(a.doubleValue(), b.doubleValue());
    }
}