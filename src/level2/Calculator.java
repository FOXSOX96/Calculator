package level2;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator {

    // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
    public Scanner scanner = new Scanner(System.in);
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private ArrayList<Double> resultList = new ArrayList<>();

    /**
     * 두 개의 양의 정수(또는 0)를 입력받아 사칙연산(+, -, *, /)을 수행하는 메서드
     * @param a : 첫 번째 양의 정수(또는 0)
     * @param b : 두 번째 양의 정수(또는 0)
     * @param op : 사칙연산 (operation)
     * @return result: 입력시 결과값 생성
     */
    /*양의 정수(0 포함)를 입력받기*/
    public double calculator(int a, int b, char op) {

        /*첫번째 숫자*/
        System.out.println("첫 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");

        while (true) {
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if (a >= 0) {
                    break; /*올바른 입력 -> 반복 종료*/
                } else {
                    System.out.println("0 또는 양의 정수를 입력해주세요 : "); /*음수 입력시 재입력 요청*/
                }
            } else {
                System.out.println("**에러: 0 또는 양의 정수를 입력해야합니다");
                scanner.next(); /*잘못된 입력 제거*/
            }
        }

        /*사칙연산*/
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
        /*사칙연산기호 : foreBasicOperation*/
        System.out.println("사칙연산 기호를 입력하세요: ");

        op = scanner.next().charAt(0);
        /*다른 한 글자 입력시 재입력 요청*/
        while (!(op == ('+') || op == ('-') || op == ('*') || op == ('/'))) {
            System.out.println(" +, -, /, * 로 사칙연산을 입력해주세요 : ");
            op = scanner.next().charAt(0);
        }

        /*두번째 숫자*/
        System.out.println("두 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");

        while (true) {
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                if (b >= 0) {
                    break; /*올바른 입력 -> 반복 종료*/
                } else {
                    System.out.println("0 또는 양의 정수를 입력해주세요 : "); /*음수 입력시 재입력 요청*/
                }
            } else {
                System.out.println("**에러: 0 또는 양의 정수를 입력해야합니다");
                scanner.next(); /*잘못된 입력 제거*/
            }
        }

        /* 연산 */

        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("**에러: 0으로 나눌 수 없습니다!");
                }
                result = (double) a / (double) b;
                break;
        }
        /* 2/2처럼 나누어떨어질 때 1.0으로 표기되는 문제해결*/
        /* 정수 계산에 소수점.0으로 표기되는 문제해결*/
        DecimalFormat df = new DecimalFormat("#.#################");
        System.out.println("결과: " + a + " " + op + " " + b + " = " + df.format(result));
        resultList.add(result);

        System.out.print("결과값 리스트 : ");
        for (double r : resultList) {
        System.out.print("[" + df.format(r) + "] ");
        }
        System.out.println();

        return result;
    }


}



