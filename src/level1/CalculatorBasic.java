package level1;

import java.util.Scanner;

public class CalculatorBasic {

    public static void main(String[] args) {

        /*양의 정수(0 포함)를 입력받기*/
        /*첫번째 숫자*/
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        Scanner scanner = new Scanner(System.in);

        int a;
        System.out.print("첫 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");
        while (true) {
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if (a >= 0) {
                    break; /*올바른 입력 -> 반복 종료*/
                } else {
                    System.out.print("0 또는 양의 정수를 입력해주세요 : "); /*음수 입력시 재입력 요청*/
                }
            } else {
                System.out.print("**에러: 0 또는 양의 정수를 입력해야합니다");
                scanner.next(); /*잘못된 입력 제거*/
            }
        }



        /*두번째 숫자*/
        int b;
        System.out.print("첫 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");
        while (true) {
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                if (b >= 0) {
                    break; /*올바른 입력 -> 반복 종료*/
                } else {
                    System.out.print("0 또는 양의 정수를 입력해주세요 : "); /*음수 입력시 재입력 요청*/
                }
            } else {
                System.out.print("**에러: 0 또는 양의 정수를 입력해야합니다");
                scanner.next(); /*잘못된 입력 제거*/
            }
        }

        /*사칙연산*/
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
        char op; /*사칙연산기호 : foreBasicOperation*/

        System.out.print("사칙연산 기호를 입력하세요: ");
        op = scanner.next().charAt(0);
        /*다른 한 글자 입력시 재입력 요청*/
        while (!(op == ('+') || op == ('-') || op == ('*') || op == ('/'))) {
            System.out.println(" +, -, /, * 로 사칙연산을 입력해주세요 : ");
            op = scanner.next().charAt(0);
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
                    return;
                }
                result = (double) a / (double) b;
                break;
        }
        System.out.println("결과: " + a + " " + op + " " + b + " = " + result);


    }


}