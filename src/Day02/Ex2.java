package Day02; // 패키지명

public class Ex2 { // class s
    public static void main(String[] args) { // main s
        // 1. 출력함수1[println] : 출력후 줄바꿈 , sout+tab
        System.out.println(" 1.출력후 줄바꿈 됩니다.");
        // 2. 출력함수2[print] : 출력 ,
        System.out.print(" 2.출력만 합니다.");
        // 3. 출력함수3[printf] : f -> format -> 형식 -> 꾸며서 출력
        System.out.printf(" 3. %s 입니다." , "형식출력");
        // 4. 제어문자 [ 기능이 있는 특수문자 ]
            // \ : 엔터위에 원화기호
        // 1. \n : 줄바꿈처리
        System.out.println("안녕\n하하하\n줄바꿈");
        // 2. \t : 들여쓰기[tab기능]
        System.out.println("안녕\t하하하\t탭기능");
    } // main e
}// class e
