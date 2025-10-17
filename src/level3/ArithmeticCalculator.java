package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {

    public Class<T> type;

    public ArithmeticCalculator(Class<T> type) {
        this.type = type;
    }

    // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
    public Scanner scanner = new Scanner(System.in);
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private ArrayList<Double> resultList = new ArrayList<>();
    private List<Double> biggerResultList = new ArrayList<>();

    /**
     * 두 개의 양의 정수(또는 0)를 입력받아 사칙연산(+, -, *, /)을 수행하는 메서드
     *
     * @param num1   : 첫 번째 양의 정수(또는 0)
     * @param num2   : 두 번째 양의 정수(또는 0)
     * @param symbol : 사칙연산 (operation)
     * @return result: 입력시 결과값 생성
     */
    /*양의 정수(0 포함)를 입력받기*/
    public double calculate(T num1, T num2, char symbol) {

        /*첫번째 숫자*/
        System.out.println("첫 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");
        num1 = setType();

        /*사칙연산*/
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
        /*사칙연산기호 : foreBasicOperation*/
        System.out.println("사칙연산 기호를 입력하세요: ");

        symbol = scanner.next().charAt(0);
        /*다른 한 글자 입력시 재입력 요청*/
        while (!(symbol == ('+') || symbol == ('-') || symbol == ('*') || symbol == ('/'))) {
            System.out.println(" +, -, /, * 로 사칙연산을 입력해주세요 : ");
            symbol = scanner.next().charAt(0);
        }

        /*두번째 숫자*/
        System.out.println("두 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");
        num2 = setType();

        /* 연산 */

        double result = 0.0;
        switch (symbol) {
            case '+':
                result = Operation.ADD.applyN(num1, num2);
                break;
            case '-':
                result = Operation.MIN.applyN(num1, num2);
                break;
            case '*':
                result = Operation.MUL.applyN(num1, num2);
                break;
            case '/':
                result = Operation.DIV.applyN(num1, num2);
                break;
        }

        /* Infinity, NaN 예외 처리 */
        if (Double.isInfinite(result)) {
            System.out.println("**에러: 결과가 너무 커서 Infinity(무한대)로 표시됩니다.");
        } else if (Double.isNaN(result)) {
            System.out.println("**에러: 계산 결과가 유효하지 않습니다 (예: 0/0).");
        }

        /* 2/2처럼 나누어떨어질 때 1.0으로 표기되는 문제해결*/
        /* 정수 계산에 소수점.0으로 표기되는 문제해결*/
        DecimalFormat df = new DecimalFormat("0.###############");
        System.out.println("결과: " + df.format(num1) + " " + symbol + " " + df.format(num2) + " = " + df.format(result));

        /*ArrayList 컬렉션*/
        resultList.add(result);
        System.out.print("결과값 리스트 : ");
        for (double r : resultList) {
            System.out.print("[" + df.format(r) + "] ");
        }
        System.out.println();

        /*최근 입력값보다 큰 출력값*/
        T biggerNum1 = num1;
        T biggerNum2 = num2;
        this.biggerResultList = resultList.stream()
                .filter(x -> x > biggerNum1.doubleValue() && x > biggerNum2.doubleValue())
                .collect(Collectors.toList());



        return result;
    }

    /*타입 셋 메서드*/
    public T setType() {
        double value;
        value = scanner.nextDouble();
        return fromNumber(value);
    }

    private T fromNumber(double v) {
        /*생성자에서 받은 객체의 실제 타입으로 분기)*/
        if (type == Integer.class) return (T) Integer.valueOf((int) v);
        if (type == Long.class) return (T) Long.valueOf((long) v);
        if (type == Double.class) return (T) Double.valueOf(v);
        if (type == Float.class) return (T) Float.valueOf((float) v);
        throw new IllegalArgumentException("지원하지 않는 숫자 타입: " + type.getClass().getName());
    }

    /*게터*/
    public ArrayList<Double> getResultList() {
        return resultList;
    }

    /*게터: 최근 입력값보다 큰 출력값*/
    public List<Double> getbiggerResultList() {
        return biggerResultList;
    }

    /*세터*/
    public void setResultList(ArrayList<Double> resultList) {
        this.resultList = resultList;
    }

    /*컬렉션 값 제거 매서드*/
    public void removeResultList() {
        if (resultList.isEmpty()) {
            System.out.println("**에러: 삭제할 결과값이 없습니다. (리스트가 비어 있음)");
            return;
        }
        resultList.remove(0);
        System.out.println("리스트의 첫 번째 결과값이 제거되었습니다.");
    }
}