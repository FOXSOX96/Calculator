## ArithmeticCalculator
간단한 자바 콘솔 계산기 프로그램입니다.  
사용자가 Scanner로 두 값을 입력하고 연산 기호를 선택하면 결과를 출력하며, 모든 결과는 resultList에 누적 저장됩니다.
또한 가장 최근에 입력한 두 값보다 큰 결과들을 스트림으로 필터링하여 제공합니다.
---

## 주요 기능

+ \+ , - , * , / 사칙연산 수행 
+ 사용자 입력 검증
    - 문자나 입력 시 재입력 요청
    - 0으로 나누기 방지 처리
+ 계산 반복기능
    - 이전 계산 입력값 참조가능
    - Y/N으로 추가 계산 여부를 질의
+ 모든 입력은 제네릭 T로 처리하되, 내부 연산은 double로 안전하게 수행 
+ 계산 결과를 ArrayList<Double>에 누적 저장
+ 최근 입력값 두 개보다 큰 결과들을 Stream & Lambda로 필터링
+ 게터/세터 및 결과 삭제 기능 업데이트가능

## 프로젝트 구조
+ src
+ └─ level3/
+ ├─ AppChallenge.java         // 실행
+ ├─ ArithmeticCalculator.java // 계산기
+ └─ Operation.java            // 연산자정의 enum (+, -, *, /)

## 실행 방법

1. **IntelliJ IDEA** 또는 터미널에서 프로젝트를 엽니다.
2. `src/level1/CalculatorBasic.java` 파일을 실행합니다.
3. 안내 메시지에 따라 첫 번째 숫자 입력
4. 연산 기호 입력: +, -, *, /
5. 두 번째 숫자 입력
6. 결과가 출력되고, 누적 결과 리스트가 함께 표시
7. 이어서 Y/N으로 추가 계산 여부 선택

---

## 주요 클래스/메서드
### Operation (enum)

+ apply(double x, double y): 실제 연산 수행
+ applyN(Number a, Number b): Number 입력을 double로 변환 후 위 메서드 호출
+ / 0 보호 로직 포함
### ArithmeticCalculator<T extends Number>
+ calculate(T num1, T num2, char symbol): 한 번의 계산 사이클 수행 및 결과 누적
+ setType(): Scanner로 입력 → T 변환 
+ getResultList(): 누적 결과 리스트 반환
+ getbiggerResultList(): 가장 최근 입력 두 값보다 큰 결과들 반환 (Stream 필터 결과)
+ setResultList(List<Double>): 결과 리스트 교체
+ removeResultList(): 리스트의 첫 번째 요소 제거
### 출력 
+ 결과 출력은 DecimalFormat("0.###############")로 정수 계산시 불필요한 .0 제거

---

## 개발 환경

- **Language:** Java 17
- **IDE:** 
  IntelliJ IDEA 2025.2.3 (Ultimate Edition)
  Build #IU-252.26830.84, built on October 2, 2025
  Source revision: ba2aff1f71476
  Runtime version: 21.0.8+9-b1038.72 x86_64 (JCEF 122.1.9)
  VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
  Toolkit: sun.lwawt.macosx.LWCToolkit
  macOS 14.3.1
  GC: G1 Young Generation, G1 Concurrent GC, G1 Old Generation
  Memory: 2048M
  Cores: 12
  Metal Rendering is ON
  Registry:
  ide.experimental.ui=true
  idea.islands.feedback2.enabled=false
  Kotlin: 252.26830.84-IJ

- **Build Tool:** (없음, 단순 실행용)

---
