package Day06;
import java.util.Scanner;

public class Ex2_예금프로그램 { // c s
    public static void main(String[] args) { // m s
        // 3. 입력 [ import java.util.Scanner; ]
        Scanner scanner = new Scanner(System.in);

        // 5. 통장 변수
        int 계좌번호 = 20221227;
        int 비밀번호 = 1234;
        int 예금액 = 0;

        // 2.무한반복
        while (true) { // while s
            // 1.메뉴판
            System.out.println("-------------- Ezen Bank Menu --------------");
            System.out.println(" 1.예금 2.출금 3.잔고확인 4.종료 ");
            System.out.print("====> 선택 : ");
            // * 3 int형[정수형] 으로 입력받은 값을 '메뉴'라는 변수에 저장
            int 메뉴 = scanner.nextInt(); // while문 안에 있기 때문에 무한입력
            // 4. 입력받은 메뉴의 경우의수 판단
            if( 메뉴 == 1 )       { //4-1. 1를 입력했을때 if 1 s
                System.out.println(" >>> 예금 >>> ");
                System.out.print(" >> 계좌번호 : ");
                int 입력계좌 = scanner.nextInt();

                if( 입력계좌 == 계좌번호 ){ // if s // 입력한 계좌번호가 같으면
                    System.out.print(" >> 비밀번호 : ");
                    int 입력비번 = scanner.nextInt();
                    if( 입력비번 == 비밀번호 ){ // if s
                        System.out.print(" >> 예금액 : ");
                        예금액 += scanner.nextInt(); // 입력받은 예금액을 기존 예금액과 더한후에 예금액에 대입
                        // vs 예금액 = 예금액 + scanner.nextInt()
                        System.out.println(" >> 안내 : 예금이 되었습니다.");
                    }//if e
                    else{ // else s
                        System.out.println(" >> 안내 : 계좌비밀번호가 틀렸습니다.");
                    } // else e
                } // if e
                else{ // else s // 입력한 계좌번호가 틀렸을때
                    System.out.println(" >> 안내 : 계좌번호가 일치 하지 않습니다.");
                } // else e
            }  // if 1 end
            else if( 메뉴 == 2 )  {
                System.out.println(" >>> 출금 >>> ");
                System.out.print(" >>> 계좌번호 : ");       int 입력계좌 = scanner.nextInt();
                if( 입력계좌 == 계좌번호){
                    System.out.print(" >>> 비밀번호 : ");   int 입력비번 = scanner.nextInt();
                    if( 입력비번 == 비밀번호 ){
                        System.out.print(" >>> 출금액 : "); int 출금액 = scanner.nextInt();
                        if( 예금액 < 출금액 ){ // 만약에 예금액 보다 출금액이 더 크면 출금 불가능
                            System.out.println(" >> 안내 : 예금액이 부족합니다. ");
                        }else{
                            예금액 -= 출금액;
                            System.out.println(" >> 안내 : 출금이 완료되었습니다. ");
                        }
                    }else{  System.out.println(" >> 안내 : 비밀번호가 다릅니다. ");  }
                }else{   System.out.println(" >> 안내 : 계좌번호가 다릅니다. ");  }
            }  //4-1. 2를 입력했을때
            else if( 메뉴 == 3 )  {
                System.out.println(" >>> 잔고 >>> ");
                System.out.println(" >> 현재 예금액 : " + 예금액 );
            }  //4-1. 3를 입력했을때                                  // break; 무한루프 종료
            else if( 메뉴 == 4 )  { System.out.println(" >>> 종료 >>> "); break; }  //4-1. 4를 입력했을때

        } // while e
    } // m e
} // c e

/*
    요구사항
        1. 기능 : 예금 , 출금 , 잔고확인
        2. 통장 : 1개[ 계좌번호 : 20221227 비밀번호 : 1234 초기예금액 : 0]
    개발순서[ 정해진건 없음 ]
        1. 메뉴판 만들기 출력 [ print ]
        2. 메뉴판 반복적으로 출력해야함 [ while ]
        3. 메뉴 선택 [ scanner ]
        4. 선택받은 메뉴별 기능처리 [ IF ]
        5. 통장 변수 선언
 */
