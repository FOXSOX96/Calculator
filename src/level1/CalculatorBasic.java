package level1;

import java.util.Scanner;

public class CalculatorBasic {

    public static void main(String[] args) {

        /*양의 정수(0 포함)를 입력받기*/
        /*첫번째 숫자*/
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        Scanner scanner = new Scanner(System.in);

        int a;

        try {
            System.out.print("첫 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");
            a = scanner.nextInt();

            /*음수 입력시 재입력 요청*/
            while (a < 0) {
                System.out.println("0 또는 양의 정수를 입력해주세요 : ");
                a = scanner.nextInt();
            }
            /*문자, 실수 입력으로 에러나면 다시 알려주기*/
        } catch (Exception e) {
            System.out.println("0 또는 양의 정수를 입력해주세요");
        }

        /*두번째 숫자*/
        int b;

        try {
            System.out.print("두 번째 숫자를 입력하세요 (0 또는 양의 정수) : ");
            b = scanner.nextInt();

            /*음수 입력시 재입력 요청*/
            while (b < 0) {
                System.out.println("0 또는 양의 정수를 입력해주세요 : ");
                b = scanner.nextInt();
            }
            /*문자, 실수 입력으로 에러나면 다시 알려주기*/
        } catch (Exception e) {
            System.out.println("0 또는 양의 정수를 입력해주세요");
        }


    }


}



