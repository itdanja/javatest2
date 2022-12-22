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

