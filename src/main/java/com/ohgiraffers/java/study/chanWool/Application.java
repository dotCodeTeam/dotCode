package com.ohgiraffers.java.study.chanWool;
public class Application {
    public static void main(String[] args) {

        /*  Basic
            길이가 10인 배열을 선언하고 1부터 10까지의 값을
            반복문을 이용하여 순서대로 배열 인덱스에 넣은 후
            그 값을 출력하세요.

            예) 1 2 3 4 5 6 7 8 9 10
         */
        System.out.println("======= Basic ========");
        System.out.print(" ");
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        /*===================================================================*/

        /*  Normal
            길이가 10인 배열을 선언하고 1부터 10까지의 값을
            반복문을 이용하여 순서대로 배열 인덱스에 넣은 후
            그 값을 출력하세요.

            (단, 다른 클래스 파일을 생성해 해당 기능을 하는
            메소드를 만들어 그 객체를 불러와 결과를 출력하세요.)

            예) 1 2 3 4 5 6 7 8 9 10
         */

        System.out.println("======= Normal =======");
        System.out.print(" ");

        ArrMethod normal = new ArrMethod();
        normal.arrMethod();
        System.out.println();

        /*===================================================================*/

        /*  Hard
            길이를 입력받아 배열을 선언하고 1부터 입력받은
            정수까지의 값을 반복문을 이용하여 순서대로 배열
            인덱스에 넣은 후 그 값을 출력하세요.

            (단, 다른 클래스 파일을 생성해 해당 기능을 하는
            메소드를 만들어 그 객체를 불러와 결과를 출력하세요.)

            예) 1 2 3 4 5 6 7 8 9 10
         */

        System.out.println("======== Hard ========");
        ArrMethod hard = new ArrMethod();                       // 객체생성

        boolean isTrue = true;                                  // 예외처리를 하기위한 boolean 값 선언

        do {
            int index = hard.inputNum();                        // 입력받은 index값 선언 후 초기화 메소드

            int[] iarr = new int[index];                        // 입력받은 index 값만큼의 배열 생성
            int[] resultArr = hard.indexLength(iarr);           // 그 배열에 1부터 입력받은 값을 각 index 값에 추가

            if ( resultArr != null ) {
                isTrue = false;             // 해당 if절 조건이 true면 isTrue 변수에 false 값을 대입 > while 조건문 검사
                hard.printArr(index,resultArr);
            }
            // 결과값이 null이 아니면, 최종 배열의 각 index값 출력 (배열 값이 null이 되면 컴파일 에러가 호출되므로 예외처리)

        } while (   isTrue   );                                 // while ( true ) 이면 반복, ( false )이면 break;

        //  입력한 인덱스 값이 10을 초과하면 다시 입력하고 아니라면 종료
        System.out.println("프로그램을 종료합니다.");
        System.out.println("======================");
    }
}