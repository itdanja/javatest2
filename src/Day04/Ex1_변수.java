package Day04;

public class Ex1_변수 { // class s
    public static void main(String[] args) { // main s
        // 1. boolean
        boolean value1 = true;      System.out.println("변수1 호출 : " + value1 );
        // boolean value2 = 10;    // 에러 이유 : boolean 자료형은 true 혹은 false 만 저장가능

        // 2. char  문자[''] vs 문자열[""]
        char value3 = 'A';          System.out.println("변수3 호출 : " + value3 );
        //char value4 = "ABC";        // 에러 이류 : char 자료형은 '' 문자1개만 저장 가능하다.
        // 2-1 String 클래스
        String value5 = "ABC";      System.out.println("변수5 호출 : " + value5 );

        // 3. byte
        byte value6 = 100;          System.out.println("변수6 호출 : " + value6);
        // byte value7 = 789;          // 에러 이유 : byte 자료형은 +-127 까지 저장 가능

        // 4. short
        short value8 = 30000;       System.out.println("변수8 호출 : "+value8);
        // short value9 = 40000;       // 에러 이유 : short 자료형은 +-3만정도 저장 가능

        // 5.*int : 자료형변수에 저장되기전 데이터의 기본자료형
        int value10 = 2000000000;   System.out.println("변수10 호출 : " + value10 );
        // int value11 = 1000000000000;    // 에러 이유 : int자료형은 +-20억정도 저장 가능

        // 6. long  : 입력된정수(int)L
        long value12 = 1000000000000L;      System.out.println("변수12 호출 : " + value12 );
        long value13 = 999999999999999999L; System.out.println("변수13 호출 : " + value13 );
        // 18자리 가능 하다  [ 그 이상 --> 문자열 처리 ]

        // 7. float : [ 소수 7자리 ]
        float value14 = 0.8888888888888888888F;         System.out.println("변수14 호출 : " + value14 );
        // 8. *double : [소수 16자리 ] 자료형변수에 저장되기전 실수 데이터는 double
        double value15 = 0.888888888888888888888888888; System.out.println("변수15 호출 : " + value15);

    } // main e
} // class e

/*
    변수 vs 상수
        - 변수 : 변하는 수[값/데이터]
        - 상수 : 고정된 수[값/데이터]
        - 컴퓨터에서의 의미 : 이름을 할당받은 메모리 공간
        - 변수 사용목적 :
            1. 데이터 저장할려고    2. 누적 계산할려고 등등
        - 변수의 선언 [준비물]
            - 생활속 변수 예시
            1. 시계 구매                        ---> 시계 = 값,데이터
            2. 다이소 선물상자 사이즈 골라요     ---> 상자 크기 형태 [ 자료형 ] 선택
            3. 선물상자에 이름 정하기           ---> 상자 식별이름[ 변수명 ] 정하기
            4. 선물상자에 시계 넣기            ---> 상자에 데이터 넣기 [ 대입 ]
            - 변수의 호출
                5. 선물상자의 상자 열기          ---> 변수 호출
                6. 선물확인
            -
            변수의 초기화/선언 : [자료형][변수명] [대입연산자] [데이터]
                int 정수 = 10;
            변수의 호출 : [변수명]
                System.out.println( 정수 );
            변수의 값 수정 : [변수명] [대입연산자] [ 데이터 ]
                정수 = 20;
            *** 변수명은 중복 불가능하다

        - 1. 자료형 [ 데이터를 저장할수 있는 메모리의 크기 ]
            - 왜?? 메모리 효율적으로쓰자 [ 메모리 증가-->속도감소/금액증가 ]
            - 사탕 포장할려면 작은 상자를 써라
            - 작은 데이터 저장할려면 작은 자료형을 써라
            - JAVA 기본 자료형
                * 자료형 변수에 대입하기전에 작성된
                    정수의 기본타입 : int
                    실수의 기본타입 : double

                논리형
                    boolean : true 혹은 false 저장 가능
                문자형
                    char : 문자 1개 저장 가능              '유'
                    String : 문자열[클래스] 저장 가능      "유재석"
                정수형
                    byte : +-127 저장 가능
                    short : +-32000 정도 저장 가능    [ +-3만 정도 ]
                    *int : +-2000000000 정도 저장 가능 [ +-2억 정도 ]
                    long : 20억 이상 저장 가능
                실수형[소수점]
                    float : 소수점 7자리 저장 가능
                    *double : 소수점 16자리 저장 가능

        - 2. 변수명
            [ 주의 ]
                1. 고유 이름 [ 중복 불가능 ]
                2. 공백 불가 [ 띄어쓰기 하지 말기 ]
                3. 첫번째로 숫자 입력 불가능
                4. $ _ 이외 특수문자 사용 불가능
                5. 키워드[미리 만들어진 단어들] 사용불가
                6. 카멜 표시법[ 낙타 표기법 ] : 권장
                        usernameinfo    ---> userNameInfo
                        database    ---> dataBase
        - 3. 대입연산자
                변수명 = 데이터   [ 오른쪽에서 왼쪽으로 대입 ]
        - 4. 데이터[값]
                자료형크기에 맞는 데이터
 */


















