package level2;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        // 생성자 : Calculator 객체 생성
        Calculator c = new Calculator();

        /*반복문을 사용하되, 반복의 종료를 알려주는 'N' 문자를 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기*/
        char repeat = 'Y';

        while (repeat == 'Y' || repeat == ('y')) {
            // 컴파일 에러로 임의로 초기값 입력
            c.calculator(0, 0, ' ');
            System.out.println("더 계산하시겠습니까? (Y / N)");
            repeat = c.scanner.next().charAt(0);
            /*다른 글자 입력시 재입력 요청*/
            while (!(repeat == ('Y') || repeat == ('y') || repeat == ('N') || repeat == ('n'))) {
                System.out.println("Y 또는 N으로 입력해주세요. \n더 계산하시겠습니까? (Y / N)");
                repeat = c.scanner.next().charAt(0);
            }
        }

        /*게터*/
        System.out.println("게터 테스트 : " + c.getResultList());

        /*컬렉션 값 제거 매서드*/
        c.removeResultList();
        System.out.println("컬렉션 1번 값 제거 테스트 : " + c.getResultList());

        /*세터*/
        ArrayList<Double> newList = new ArrayList<Double>();
        newList.add(99.999999);
        newList.add(888.88888);
        newList.add(7777.7777);

        /*세터 확인용도*/
        c.setResultList(newList);
        System.out.println("세터 테스트 : " + c.getResultList());

        /*스캐너종료*/
        c.scanner.close();

    }
}