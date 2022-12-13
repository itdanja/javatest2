package Day03;

public class Ex2_연산자문제 { // class s
    public static void main(String[] args) { // main s

        System.out.println(" 3753 홀수인가? : " + ( 3753%2 == 1 ? "홀수입니다." : "짝수입니다." ));
        System.out.println(" 2056 짝수인가? : " + ( 2056%2 == 0 ? "짝수입니다." : "홀수입니다." ));
        System.out.println(" 4872 7배수인가? : "+ ( 4872%7 == 0 ? "7배수 O " : "7배수 X"));
        System.out.println(" 7792 3배수인가 ? : " + (7792%3 == 0 ? "3배수 O " : "3배수 X "));
        System.out.println(" 문제5 : " + ( 78%7==0 || 78%3==0 ? "true" : "false" ) );
        System.out.println(" 문제6 : " + ( 102%2 == 0 && 102%2==0 ? "true" : "false" ) );
        System.out.println(" 문제7 : " +  ( ( 30*20 ) * 10 / 2 ) );
        System.out.println(" 문제8 : "+"총점 : "+(30+70+80) +"  / 평균 : "+ ( 30+70+80)/3 );
        System.out.println(" 문제9 반영비율점수 : " + ( (  80*0.3 ) + (75*0.3) + ( 90*0.4) ) );
        // 10. 중첩 삼항연산자
            // 나이가  65세 이상이면 '노년' 50세이상이면 '장년' 30세이상이면 '중년 '19이상이면 '청년' 그외 '청소년'
            // 나이가 45 일때 해당하는 연령 단어 출력하기
        System.out.println(" 문제10  : " +
                ( 45 >= 65 ? "노년" :                             // 조건1 ? 참1 :
                        45 >= 50 ? "장년" :                           // 조건2 ? 참2 :
                                45 >= 30 ? "중년" :                       // 조건3 ? 참3 :
                                        45 >= 19 ? "청년" : "청소년" ) );    // 조건4 ? 참4 : 거짓

        // 11. [금액] 356789 지폐별 개수 출력
            // 출력 예시 : 십만원 : 3장  만원 : 5장  천원 : 6장  백원 : 7개

    } // main e
} // class e
/*
    1.산술연산자 :   +더하기 -빼기 *곱하기 /나누기 %나머지
    2.비교연산자 : >초과 <미만 >=이상 <=이하 ==같다 !=같지않다.
    3.논리연산자 : &&이면서 ||이거나 !부정
    4.대입연산자 : =대입 +=더한후대입 -=빼기후대입
    5.증감연산자 : ++1증가 --1감소
    6.삼항연산자 : 조건 ? 참 : 거짓
        // 홀수 / 짝수 공식 :  값에 나누기 2를 했을때 나머지가 0이면 값은 짝수 1이면 홀수
        // 배수 공식 : 어떤 값에 어떤 수를 나누기 했을때 나머지가 0이면 값은 그 수의 배수

    문제 [ 변수 사용금지 ]
        1. 3753 홀수이면 '홀수입니다 출력' 아니면 '짝수 입니다' 출력
        2. 2056 짝수이면 '짝수입니다 출력' 아니면 '홀수 입니다' 출력
        3. 4872 7배수이면 '7배수입니다 출력' 아니면 '7배수가 아닙니다'출력
        4. 7792 3배수이면 '3배수입니다 출력' 아니면 3배수가 아닙니다'출력
        5. 78 숫자가 7배수 이거나 3배수이면 'true' 아니면 'false' 출력
        6. 102숫자가 짝수 이면서 2배수이면 'true' 아니면 'false' 출력
        // 7. 사다리꼴 넓이 구하기 [ 넓이 공식 : (윗변 * 밑변 )  * 높이 / 2 ]
            // 윗변 30  밑변 20 높이 10 일때 사다리꼴 넓이 출력하기
        // 8. 총점과 평균 구하기
            // 국어 30 영어 70 수학 80
        // 9. 가중치 계산하기
            // 중간고사 80 기말고사 75 수행평가 90  // [ 가중치 : 중간고사 30% 기말고사 30% 수행평가 40% 반영 ]
            // 가중치가 적용된 3과목 점수 구하기
        // 10. 중첩 삼항연산자
            // 나이가  65세 이상이면 '노년' 50세이상이면 '장년' 30세이상이면 '중년 '19이상이면 '청년' 그외 '청소년'
            // 나이가 45 일때 해당하는 연령 단어 출력하기
        // 11. [금액] 356789 지폐별 개수 출력
            // 출력 예시 : 십만원 : 3장  만원 : 5장  천원 : 6장  백원 : 7개



 */
