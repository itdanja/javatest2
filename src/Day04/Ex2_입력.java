package Day04;

import java.util.Scanner;

public class Ex2_입력 { // class s
    public static void main(String[] args) { // class s
        // 1. 입력[Scanner] 객체    [ System.in : 키보드 ]
            // 키보드로부터 입력받은 바이트[값]를 scanner 객체에 저장
        Scanner scanner = new Scanner(System.in);
        // 2. 입력된 데이터를 바이트에서 형변환 해서 호출[scanner.next();] ---> 저장

        // 1.
        System.out.print("문자열[next] 입력 : ");
        String 입력문자열 = scanner.next();
        System.out.println("입력된 데이터1 : " + 입력문자열 );

        // 2.
        System.out.print("문자열[ nextLine 띄어쓰기포함] 입력 : ");
        scanner.nextLine(); // scanner.nextLine(); 오류 방지
        String 입력문자열2 = scanner.nextLine();
        System.out.println("입력된 데이터2 : " + 입력문자열2 );

        // 3.  // true 혹은 false 만 입력 가능 / 아니면 오류 발생
        System.out.print("논리 입력 : ");       boolean 입력논리 =  scanner.nextBoolean();
        System.out.println("입력된 논리값 : " + 입력논리 );

        // 4. // +-127 입력가능 / 아니면 오류 발생
        System.out.print("바이트 입력 : ");      byte 입력바이트 = scanner.nextByte();
        System.out.println("입력된 바이트값 : " + 입력바이트 );

        // 5.  // +- 3만정도 입력가능 / 아니면 오류 발생
        System.out.print("쇼트 입력 : ");       short 입력쇼트 = scanner.nextShort();
        System.out.println("입력된 쇼트값 : " + 입력쇼트 );

        // 6. +- 20억 정도 입력가능 / 아니면 오류 발생
        System.out.print("인트 입력 : ");       int 입력인트 = scanner.nextInt();
        System.out.println("입력된 인트값 : " + 입력인트 );

        // 7.
        System.out.print("롱 입력 : ");        long 입력롱 = scanner.nextLong();
        System.out.println("입력된 롱값 : " + 입력롱 );

        // 8.
        System.out.print("플롯 입력 : ");       float 입력플롯 = scanner.nextFloat();
        System.out.println("입력된 플롯값 : " + 입력플롯 );

        // 9.
        System.out.print("더블 입력 : ");       double 입력더블 = scanner.nextDouble();
        System.out.println("입력된 더블값 : " + 입력더블 );

    } // main e
} //  class e

/*
    1.출력 : System.out.println();
    2.연산 : 6가지 연산자 사용
    3.저장 : 변수 사용
    4.입력
        1. Scanner 클래스 : 입력 관련된 메소드 제공하는 클래스
        2. 사용방법
            1. Scanner 객체 만들기 [ main함수 안에서 한번만 선언 ]
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
                       -> scanner.nextShort()       : 정수형[short] 로 꺼내기
                       -> scanner.nextInt()         : 정수형[int] 로 꺼내기
                       -> scanner.nextLong()        : 정수형[long] 로 꺼내기
                       -> scanner.nextFloat()       : 실수형[float] 로 꺼내기
                       -> scanner.nextDouble()      : 실수형[double] 로 꺼내기



 */
