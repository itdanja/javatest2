// 주석 : 실행안됨 [ 설명달기 , 학습 , 협업 , 기록 등 ]
// 한줄 주석
/* 여러줄 주석 */
package Day02; // 현재 클래스가 속한 패키지명 표시
// 패키지 : 폴더
public class Ex1 { // class start
// public : 공개용 클래스 [ 누구나 사용 가능한 ]
    // class : 클래스 선언시 사용되는 키워드
        // Ex1 : 클래스 이름 [ 아무거나 ]
            //1. 띄어쓰기 불가능[ Ex 1 ]  ,
            //2. 첫글자는 대문자[ ex1 ] , 첫글자 영문 [ 1Ex ]
            //3. 특정특수문자 외 불가능
        // {  }  : 클래스 시작 , 끝 알림
            // - 클래스안에서만 코드 작성
    // 1. main함수 [ m 입력후 tab ]
    public static void main(String[] args) { // main start
        // public : 공개용 함수 [ 누구나 사용 가능한 ]
            // static : 우선적으로 실행되는 함수
                // void : 함수 종료시 반환[리턴] 없다.
                    // main : 코드를 읽어주는 미리 만들어진 함수
        // 2. 출력함수 [ sout 입력후 tab ]
        System.out.println("안녕하세요 자바 입니다.");
        System.out.println("하하하하하하하하하");
        System.out.print("ㅋㅋㅋㅋㅋㅋㅋㅋ");
        System.out.print("그래 안녕");
        System.out.printf("그래요 안녕하세요");
        // System : 시스템 클래스 - 시스템 입출력 관련된 기능 제공
            // out : 출력         , in : 입력
                // println("출력하는싶은말") : console 출력 후 줄바꿈 해주는 함수
                    // ; : 코드의 끝마침 알림 [ 일처리 명령 ]
    } // main start
} // class end

/*
     ** 자바는 100% 클래스 언어
     ** 자바는 100% 객체지향 언어
     * 키워드 : 미리 만들어진 단어
     *
     *      사람[키보드]--------입력-------> 컴퓨터
     *      사람[키보드]<-------출력-------- 컴퓨터
     *
 */
