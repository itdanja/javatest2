package Day04;

import java.util.Scanner;

public class Q1_회원가입 { // class s
    public static void main(String[] args) { // main s

        // 1. 입력객체 만들자 [ 1개 ]
        Scanner scanner = new Scanner(System.in);
        // 2.
        System.out.println("------------------ 회원가입 창 ------------------");
        System.out.print(" => 아이디[문자15자리내] : ");        String 아이디 = scanner.next();
        // 3.
        System.out.print(" => 비밀번호[숫자4자리] : ");         short 비밀번호 = scanner.nextShort();
        // 4.
        scanner.nextLine(); // 오류 방지
        System.out.print(" => 자기소개[100글자내] : ");        String 자기소개 = scanner.nextLine();
        //5.
        System.out.print(" => 성별[남:true/여:false] : ");     boolean 성별 = scanner.nextBoolean();
        // 6.
        System.out.print(" => 선호 번호[ 100 이하 ] : ");     byte 번호 = scanner.nextByte();
        // 7.
        System.out.print(" => 투자 금액 [ 20억 이하 ] : ");    int 금액 = scanner.nextInt();
        // 8.
        System.out.print(" => 키 [ 소수점1자리 입력 ] ");       float 키 = scanner.nextFloat();
        // 9.
        System.out.print(" => 몸무게 [ 소수점2자리 입력 ] ");   double 몸무게 = scanner.nextDouble();

        System.out.println("====================== 회원가입 정보 ========================");




        System.out.println(" * * 회원가입 해주셔서 감사합니다.  * * ");
        System.out.println("============================================================");



    } // main e
}  // class e
/*
    - 회원가입 만들기
        -입력조건
            - 아이디 [ String ]            15글자 내외
            - 비밀번호 [ short ]            4글자 숫자
            - 자기소개[ String]             띄어쓰기 100글자내외 가능
            - 성별[boolean]                남자:true 여자:false
            - 선언하는 회원번호[byte]       100 이하 숫자만 가능
            - 금액[ int ]                 20억 이내
            - 키 [ float ]               소수점 1자리까지  입력
            - 몸무게 [ double ]           소수점 2자리 까지 입력
        - 출력조건

        --------------- 회원가입 정보 ---------------
        - 아이디         qweqwe
        - 비밀번호       1234
        - 자기소개       안녕하세요 코드 처음입니다.
        - 성별           true
        - 회원번호        15
        - 금액           20000000
        - 키             182.2
        - 몸무게         90.25
        ** 회원가입을 해주셔서 감사합니다.**
        --------------------------------------------


 */