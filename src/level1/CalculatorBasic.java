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
        System.out.print("두 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");
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
        int result = 0;
        double dResult = result; /*나눗셈에서만 실수사용*/
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
                dResult = (double) a / (double) b;
                break;
        }
        if (op == '/') {
            System.out.println("결과: " + a + " " + op + " " + b + " = " + dResult);
        } else {
            System.out.println("결과: " + a + " " + op + " " + b + " = " + result);
        }

        /*반복문을 사용하되, 반복의 종료를 알려주는 'N' 문자를 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기*/


        char repeat;
        System.out.println("더 계산하시겠습니까? (Y / N)");

        repeat = scanner.next().charAt(0);
        /*다른 글자 입력시 재입력 요청*/
        while (!(repeat == ('Y') || repeat == ('y') || repeat == ('N') || repeat == ('n'))) {
            System.out.println("Y 또는 N으로 입력해주세요. \n더 계산하시겠습니까? (Y / N)");
            repeat = scanner.next().charAt(0);
        }
        if (repeat == 'N' || repeat == ('n')) {
            return;
        } else {
            while (true) {


                /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ반복계산실시ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/


                System.out.println("첫 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");
                System.out.println("이전 입력값: " + a );

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
                System.out.println("두 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");
                System.out.println("이전 입력값: " + b );
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
                System.out.println("사칙연산 기호를 입력하세요: ");
                System.out.println("이전 입력값: " + op );
                op = scanner.next().charAt(0);
                /*다른 한 글자 입력시 재입력 요청*/
                while (!(op == ('+') || op == ('-') || op == ('*') || op == ('/'))) {
                    System.out.println(" +, -, /, * 로 사칙연산을 입력해주세요 : ");
                    op = scanner.next().charAt(0);
                }

                /* 연산 */
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
                        dResult = (double) a / (double) b;
                        break;
                }
                if (op == '/') {
                    System.out.println("결과: " + a + " " + op + " " + b + " = " + dResult);
                } else {
                    System.out.println("결과: " + a + " " + op + " " + b + " = " + result);
                }

                System.out.println("더 계산하시겠습니까? (Y / N)");

                repeat = scanner.next().charAt(0);
                /*다른 글자 입력시 재입력 요청*/
                while (!(repeat == ('Y') || repeat == ('y') || repeat == ('N') || repeat == ('n'))) {
                    System.out.println("Y 또는 N으로 입력해주세요. \n더 계산하시겠습니까? (Y / N)");
                    repeat = scanner.next().charAt(0);
                }
                if (repeat == 'N' || repeat == ('n')) {
                    return;
                }

            }
        }

    }


}