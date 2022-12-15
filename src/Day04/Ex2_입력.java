package Day04;

import java.util.Scanner;

public class Ex2_입력 { // class s
    public static void main(String[] args) { // class s
        // 1. 입력[Scanner] 객체    [ System.in : 키보드 ]
            // 키보드로부터 입력받은 바이트[값]를 scanner 객체에 저장
        Scanner scanner = new Scanner(System.in);
        // 2. 입력된 데이터를 바이트에서 형변환 해서 호출[scanner.next();] ---> 저장
        System.out.print("문자열 입력   여기에 ->: ");
        String 입력문자열 = scanner.next();
        System.out.println("입력하신 문자열 : " + 입력문자열 );

        // 1.
        System.out.print("문자열[띄어쓰기포함] 입력 : ");
        scanner.nextLine(); // ?????
        String 입력문자열2 = scanner.nextLine();
        System.out.println("입력하신 문자열[띄어쓰기포함] : " + 입력문자열2 );


    } // main e
} //  class e

/*
    1.출력 : System.out.println();
    2.연산 : 6가지 연산자 사용
    3.저장 : 변수 사용
    4.입력
        1. Scanner 클래스 : 입력 관련된 메소드 제공하는 클래스
        2. 사용방법
            1. Scanner 객체 만들기
                Scanner scanner = new Scanner(System.in);
            2. 객체 통해 입력된 데이터를 원하는 자료형 변환
            3. 변수에 저장


    사용자 ---> 키보드 --->
    System.in ----> scanner 객체 저장
                       -> scanner.next()            : 문자열[String]로 꺼내기 [ 공백 포함X]
                       -> scanner.nextLine()        : 문자열[String]로 꺼내기 [ 공백 포함O]
                       -> scanner.nextBoolean()     : 논리형[boolean] 로 꺼내기
                       -> scanner.nextChar()        : 없다.
                       -> scanner.nextByte()        : 정수형[byte] 로 꺼내기
                       -> scanner.nextShort()       : 정수형[byte] 로 꺼내기
                       -> scanner.nextInt()         : 정수형[int] 로 꺼내기
                       -> scanner.nextFloat()       : 실수형[float] 로 꺼내기
                       -> scanner.nextDouble()      : 실수형[double] 로 꺼내기



 */
