package level1;

import level2.Calculator;
import java.util.Scanner;

public class App {


    // main() — 프로그램 시작점
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 생성자 : Calculator 객체 생성
            Calculator c = new Calculator();
            // 컴파일 에러로 임의로 초기값 입력
            c.calculator(0, 0, ' ');
        }

    }

