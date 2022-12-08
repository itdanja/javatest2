package Day02;

public class Q1 {   // class s
    public static void main(String[] args) { // main s
        System.out.println("\\");
        System.out.println(" \" ");
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
            //   \: 엔터 위에       | : shift + \
    } // main e
} // class e
/*
    문제1
    \    /\
     )  ( ')
    (  /  )
     \(__)|

     주의할점 :
        \ 출력이 불가능하다 [이유 : 제어문자에서 사용되는 특수문자
            -해결방안-> \\
        " 출력이 불가능하다 [이유 : " " 문자열 구분 특수문자 ]
            -해결방안-> \"

 */
