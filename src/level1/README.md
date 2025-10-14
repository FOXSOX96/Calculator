## CalculatorBasic
간단한 자바 콘솔 계산기 프로그램입니다.  
사용자로부터 두 개의 양의 정수를 입력받아 사칙연산(+, -, *, /)을 수행합니다.

---

## 실행 방법

1. **IntelliJ IDEA** 또는 터미널에서 프로젝트를 엽니다.
2. `src/level1/CalculatorBasic.java` 파일을 실행합니다.
3. 콘솔에 표시되는 안내에 따라 숫자와 연산자를 입력합니다.

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

## 주요 기능
- 0 또는 양의 정수 간의 사칙연산 지원 (`+, -, *, /`)
- 사용자 입력 검증
    - 0 또는 양의 정수만 허용
    - 문자나 실수 입력 시 재입력 요청
    - 0으로 나누기 방지 처리
- 계산 반복기능 
   - 이전 계산 입력값 참조가능

---
