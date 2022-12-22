package Day05;

public class Ex1_제어문 { // class s
    public static void main(String[] args) { // main s

        // 출력,저장[변수],계산[연산],입력,제어
        // 책 추천
            // 1.컴퓨터구조 교재
            // 2.알고리즘 교재

        // IF : 제어문 [ 컴퓨터에게 판단력을 키워주자 ]
            // -경우의수 판단
            // 5살 아이에게 천원주고 밖에 나가서 콜라 사와
            /*
                5살 아이에게 천원주고
                    만약에 집 10m A편의점 콜라가 1000이하면 사와
                    아니면 집 20m B편의점 콜라가 1000이하면 사와
                    없으면 집으로 돌아와

                5살 = 1000
                IF( 5살 == A편의점 ) {
                    IF( 콜라 <= 1000 ) { 구매 }
                    ELSE IF( 5살 == B편의점 ){
                        IF( 콜라 <= 1000) { 구매 }
                        ELSE{ 집으로 가기 }
                    }
                }
             */

        /* IF 사용법
             * 조건 : 비교연산자 or 논리연산자 or TURE/FALSE
             1. IF( 조건 ) 참실행문;
             2. IF( 조건 ) { 참실행문1; 참실행문2; }
             3. IF( 조건 )  참실행문;
                ELSE 거짓실행문;
             4. IF( 조건 ) { 참실행문1; 참실행문2; }
                ELSE{ 거짓실행문1; 거짓실행문; }
             5. IF( 조건1 ) { 참실행문1; }
                ELSE IF( 조건2 ) { 참실행문2; }
                ELSE IF( 조건3 ) { 참실행문3; }
                ELSE { 거짓실행문; }
             6. if중첩

                if( 조건1 ) {
                    if( 조건 ) {  }
                    else{ }
                }else{
                    if( 조건 ) {  }
                    else{ }
                }

             *
         */
        // 1. 조건 결과가 true 이면 다음 있는 코드[ ; ] 1개 실행
        if( 3 > 2 ) System.out.println("3이 2보다 크다.");

        // 2. 조건 결과가 false 이면 다음 있는 코드[ ; ] 1개 실행 안됨.
        if( 3 > 5 ) System.out.println("3이 5보다 크다.");

        // 3. 조건 결과가 true 이면 다음 있는 코드[ ; ] 1개 실행
        if( 3 > 5 ) System.out.println("3이5보다크다.");
        System.out.println("다음코드"); // IF 와 관련 없는 코드

        // 4. 조건 결과가 true 이면 다음 있는 코드[ ; ] 2개 이상일경우 { } 묶자
        if( 3 > 5 ) {
            System.out.println("3이5보다크다.");
            System.out.println("다음코드"); // IF 와 관련 있는 코드
        }

        // 5.
        if( 3 > 5 ) System.out.println("3이 5보다 크다. ");
        else System.out.println(" 3이 5보다 작다. ");

        // 6.
        if( 3>5 ){ // if s
            System.out.println("3이 5보다 크다1");
            System.out.println("다음코드");
        } // if e
        else{ // else s
            System.out.println("3이 5보다 작다1");
            System.out.println("다음코드");
        } // else e

        // 7. 조건이 다수일때
        // if ~ else if ~ else if ~ else if ~ else : 하나의 true/false 가진다.
        // 구매금액에 따라 상품권 10만원 이상이면 만원 , 20만원이상 2만원 , 30만원이상 3만원
        //          고객 20만원 --> 2만원
        // * 다수 조건에 따른 결과가 하나일 경우
        if( 3 > 7) System.out.println("3이 7보다 크다.");
        else if( 3 > 5 ) System.out.println("3이 5보다 크다.");
        else if( 3 > 3 ) System.out.println("3이 3보다 크다. ");
        else if( 3 > 2 ) System.out.println("3이 2보다 크다. ");
        else System.out.println("그외");

        // vs
        // if ~ if ~ if ~ if ~ else : 여러개의 true 가질수도 있다.
        // 구매금액에 따라 상품권 10만원 이상이면 만원 추가로 20만원이상 2만원추가 30만원이상 3만원 =>
        //          고객 20만원 => 3만원
        //  * 다수 조건에 따른 결과가 여러개 일경우
        if( 3 > 7) System.out.println("3이 7보다 크다.");
        if( 3 > 5 ) System.out.println("3이 5보다 크다.");
        if( 3 > 3 ) System.out.println("3이 3보다 크다. ");
        if( 3 > 2 ) System.out.println("3이 2보다 크다. ");
        else System.out.println("그외");

        // 8.
        if( 8 > 5 ){    // if 1 s
            if( 8 > 7 ){
                System.out.println("8은 5보다 크고 7보다 크다.");
            } // if 2 s
            else{
                System.out.println("8은 5보다 크고 7보다 작다.");
            } // else 2 s
        } // if 1 e
        else{ // else 1 s
            if( 8 > 10 ){
                System.out.println("8은 5보다 작고 10보다 크다.");
            } // if 2 s
            else{
                System.out.println("8은 5보다 작고 10보다 작다.");
            } // else 2 s
        } // else 1 e



    } // main e
} // class e

/*

	-출력
		1. System.out.print();	출력
		2. System.out.println(); 	출력후 줄바꿈
		3. System.out.printf();	출력형식[ format ]

	-연산자
		1.산술 연산자	+ - * / %
		2.비교 연산자	>  <  >= <= == !=
		3.논리 연산자	&& || !
		4.대입 연산자	= += -= *= /=
		5.삼항 연산자	조건 ? 참 : 거짓
		6.증감 연산자 	++ --

	-변수
		[변수의 초기화] 	자료형 변수명 = 값
		[변수의 호출] 	변수명
		[변수의 값 변경 ] 	변수명 = 새로운값
		- 자료형/타입
			boolean	: true or false
			char	: 문자1개
			String	: 문자열
			byte	: +-127
			short	: +-3만정도
			int	: +-20억정도
			long	: +-20억이상
			float	: 소수점 7자리
			double	: 소수점 16자리
	- 입력
		[입력 객체]	Scanner scanner = new Scanner(System.in);
		[입력 가져오기]	자료형 변수명 = scanner.next떙떙()
		[ next 메소드 ]
			1. scanner.next()		: String 타입으로 가져오기
			2. scanner.nextLine()	: String 타입으로 가져오기 [ 띄어쓰기 포함 ]
			3. scanner.nexBoolean()	: boolean 타입으로 가져오기
			4. scanner.nextChar()	불가능
			5. scanner.nextByte()	: byte 타입으로 가져오기
			6. scanner.nextShort()	: short 타입으로 가져오기
			7. scanner.nextInt()	: int 타입으로 가져오기
			8. scanner.nextLong()	: long 타입으로 가져오기
			9. scanner.nextFlaot()	: float 타입으로 가져오기
			10. scanner.nextDouble()	: double타입으로 가져오기
 */

