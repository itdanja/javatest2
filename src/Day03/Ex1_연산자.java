package Day03;

public class Ex1_연산자 {  // class s
    public static void main(String[] args) { // main s
        /*  연산자 : 연산[계산] 할때 사용하는 특수문자
            1. 산술연산자
                1. + : 더하기  2. - : 빼기    3. * : 곱하기  4. / : 나누기  5. % : 나머지

            2. 비교연산자 [ 결과가  true or false ]
                1. >  초과   2. <  미만   3. >= 이상   4. <= 이하    5. == 같다  6. !=같지않다/아니다

            3. 논리연산자[ 비교연산자가 2개 이상일때 ]
                 * 주의할점      1<3<5   범위 비교 불가능 =>    1<3 && 3<5
                1. && : and : 그리고 모두 이면서 면서 이고
                    사탕 이면서 초콜릿 먹을래 => 2개 먹기
                2. || : or : 이거나 거나 하나라도 또는
                    사탕 이거나 초콜릿 먹을래 => 1개 혹은 2개 먹기
                3. ! : 부정 : true -> false / false -> true

            4. 대입연산자
                1. =    :오른쪽 데이터를 왼쪽에 대입
                2. +=   :오른쪽 데이터를 왼쪽데이터와 더한후에 왼쪽에 대입
                3. -=   :오른쪽 데이터를 왼쪽데이터와 빼기후에 왼쪽에 대입
                /= *= %=
                    // 연산자 : 1. +더하기   2. =대입   [더하면서 대입 못함 ]
                    // vs 정수 = 정수 + 10
                    // 연산자 다수일때 연산자 처리 우선순위
                        // 1. 정수 + 10       [ 더하기 ]
                        // 2. 정수 = 결과     [ 대입 ]

            5. 증감연산자 [ 1증가 혹은 1감소 ]
                ++ : 1증가    ++변수    : 선위증가   /  변수++ : 후위증가
                -- : 1감소    --변수    : 선위감소  /   변수-- : 후위감소

            6. 삼항연산자 [ 항이 3개 ]
                1. 조건 ? 참 : 거짓      [ 조건이 true이면 참 출력 , false 이면 거짓 출력 ]
                2. 조건1 ? 참1 : 조건2 ? 참2 : 거짓

            * 연결연산자
                1. "문자열"+숫자
                2. "문자열"+"문자열"
                3. "문자열"   +   (숫자+숫자)
                           연결     더하기
            " " : 문자열
            ' ' : 문자

         */

        System.out.println( 3 + 3 );            // 숫자+숫자            더하기연산자
        System.out.println( "a" + 3 );          // 문자+숫자            연결연산자
        System.out.println( "유재석"+10);        // 문자열+숫자         연결연산자
        System.out.println("더하기 : " + 3+3 );    // 문자열+숫자+숫자    연결연산자
        System.out.println("더하기 : " + (3+3) );  // 문자열+ (숫자+숫자)  문자열 + 더한결과
        System.out.println("빼기 : " + ( 5-3 ) );
        System.out.println("곱하기 : " + ( 5*3 ) ) ;
        System.out.println("나누기(몫) : " + ( 5/3 ) ) ;
        System.out.println("나누기(나머지) : " + ( 5%3 ) ) ;

        System.out.println("초과 : " + ( 5>3 ) );     // true 참       // 5가 3보다 초과이다.
        System.out.println("미만 : " + ( 5<3 ) );     // false 거짓    // 5가 3보다 미만이다.
        System.out.println("이상 : " + ( 5>=3 ) );     // true          // 5가 3보다 이상이다.
        System.out.println("이하 : " + ( 5<=3 ) );     // false        // 5가 3보다 이하이다.
        System.out.println("같다 : " + ( 5==3 ) );    // false    // 5가 3과 같다.
        System.out.println("같지않다 : " + ( 5!=3 )); // true   // 5가 3과 다르다.

        System.out.println(" && : " + ( 5>3 && 10 >5 ) ); // true and true => true
        System.out.println(" && : " + ( 5>3 && 10 >15 ));   // true and false => false *

        System.out.println(" || : " + ( 5>3 || 10 >5 ));    // true or true = > true
        System.out.println(" || : " + ( 5>3 || 10 >15));    // true or false => true *
        System.out.println(" ! : " + !( 5>3 ) );             // true -- !:부정 --> false

        int 정수 = 10;    // 오른쪽 10를 왼쪽 변수에 대입한다. => 10
        System.out.println( "정수 : " + 정수 ); // "문자열" + 변수호출
        정수 += 10;       // 오른쪽 10를 왼쪽 변수와 더한후에 왼쪽변수에 저장 => 20
        System.out.println( "정수 : " + 정수 );

        System.out.println( "정수라는변수에 선위증가 : " + (++정수) ); // 20 + 1 => 21
        System.out.println( "정수라는변수에 후위증가 : " + (정수++) ); // 21 + 1 => 21
        System.out.println( "후위증가 확인 : " + 정수 ); // 22

        System.out.println( "정수라는변수에 선위감소 : " + (--정수) );   // 22 - 1 => 21
        System.out.println( "정수하는변수에 후위감소 : " + ( 정수-- ) ); // 21 - 1 => 21
        System.out.println( "후위감소 확인 : " + 정수 ); // 20

        System.out.println( "삼항연산자 : " + ( 정수>=20 ? "참이야" : "거짓이야" ) );

    } // main e
} // class e

/*
    클래스 : 미리 작성된 설계도[ 성질,행위 ]
    객체 : 설계도 기반으로 메모리 할당 된 형태
        1. System   : 시스템[pc] 관련된 기능 제공하는 클래스
            1. out : 출력
                System.out
                1. console 출력
                    1.System.out.println()
                    2.System.out.print()
                    3.System.out.printf()

            2. in : 입력
                System.in
 */
