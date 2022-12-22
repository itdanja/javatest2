package Day05;

import java.util.Scanner;
// java.util 패키지에서 Scanner 클래스 가져오기


public class Q1_IF문제 { // class s
    public static void main(String[] args) { // m s

        //  * 입력객체 만들기
            // Scanner 클래스 사용시 클래스 위에 import 하자
        Scanner scanner = new Scanner(System.in);
        /* ------------------------ 1 ----------------------------*/
            // 1. [출력] 입력 전 입력받을 내용을 안내해주기
        System.out.print("문제1 : ");
            // 2. [입력/저장] scanner 객체로 int형으로 입력받은 값 가져와서 문제1 변수에 저장
        int 문제1 = scanner.nextInt();
            // 3. [제어] 만약에 입력값이 나누기 2 했을때 나머지가 0 이면 짝수 아니면 홀수
        if( 문제1 % 2 == 0 ) System.out.println("짝수입니다.");
        else System.out.println("홀수입니다.");
        /* ---------------------- 2 ------------------------------*/

        // * 현재 같은 { } 안에 scanner 객체가 있으면 또 작성할 필요가 없다.
        System.out.print("문제2 : ");
        int 문제2 = scanner.nextInt();
        if( 문제2 % 7 == 0 ) System.out.println("7배수입니다.");
        else System.out.println("7배수가 아닙니다.");
        /* ---------------------- 3 ------------------------------*/
        System.out.print("국어 : "); int 국어 = scanner.nextInt();
        System.out.print("영어 : "); int 영어 = scanner.nextInt();
        System.out.print("수학 : "); int 수학 = scanner.nextInt();
        int 평균 =( 국어+영어+수학 ) / 3;
        if( 평균 >= 80 ){             // 조건1
                                        // 조건1 true
            if( 국어>=90 ) System.out.println("[합격] 국어 우수 ");
            else if( 영어>=90 ) System.out.println("[합격] 영어 우수 ");
            else if( 수학>=90 ) System.out.println("[합격] 수학 우수 ");

        }else if( 평균 >= 70 ){       // 조건2
            System.out.println("[합격]");// 조건2 true
        }else {                      // 그외
            System.out.println("[불합격]"); // false
        }

    } // m s
} // class e
/*
    [ 삼항연산자 X ]
    문제1 : 입력받은 값이 홀수 이면 '홀수입니다' 아니면 '짝수입니다'
    문제2 : 입력받은 값이 7배수이면 '7배수입니다' 아니면 '7배수 아닙니다'
    문제3 : 국어 영어 수학 3개 점수를 입력받아
        평균이 80점이상 이면서
            국어가 90점이상이면 '[합격] 국어 우수'
            영어가 90점이상이면 '[합격] 영어 우수 '
            수학가 90점이상이면 '[합격] 수학 우수'
        평균이 70점이상이면   '합격'
        아니면  '불합격'
    문제4 : 2개의 정수를 입력받아 가장 큰수 출력
        입력 예) 3 5       출력 예 ) 3 이 가장 큽니다.
    문제5 : 3개의 정수를 입력받아 가장 큰수 출력
        입력 예) 3 5 2      출력 예 ) 5 이 가장 큽니다.
    문제6 : 4개의 정수를 입력받아 가장 큰수 출력
        입력 예) 3 5 2 8     출력 예 ) 8 이 가장 큽니다.
    문제7 : 3개의 정수를 입력받아 오름차순으로 출력
        입력 예) 3 5 2      출력 예 ) 2 3 5
    문제8 : 4개의 정수를 입력받아 내림차순 출력
        입력 예) 3 5 2 8     출력 예 ) 8 5 3 2

 */
