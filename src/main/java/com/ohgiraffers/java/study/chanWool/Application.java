package com.ohgiraffers.java.study.chanWool;
public class Application {
    public static void main(String[] args) {

        /*  Basic
            길이가 10인 배열을 선언하고 1부터 10까지의 값을
            반복문을 이용하여 순서대로 배열 인덱스에 넣은 후
            그 값을 출력하세요.

            예) 1 2 3 4 5 6 7 8 9 10
         */
        System.out.println("====== Basic =======");
        int iarr[] = new int[10];

        for (int i = 0; i < iarr.length; i++ )  {
            iarr[i] = i+1;
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        System.out.println("====== Normal ======");


/*===================================================================*/

        /*  Normal
            길이가 10인 배열을 선언하고 1부터 10까지의 값을
            반복문을 이용하여 순서대로 배열 인덱스에 넣은 후
            그 값을 출력하세요.

            (단, 다른 클래스 파일을 생성해 해당 기능을 하는
            메소드를 만들어 그 객체를 불러와 결과를 출력하세요.)

            예) 1 2 3 4 5 6 7 8 9 10
         */

        Method normal = new Method();
        normal.arrMethod1();
        System.out.println();
        System.out.println("======= Hard =======");

/*===================================================================*/

        /*  Hard
            길이를 입력받아 배열을 선언하고 1부터 입력받은
            정수까지의 값을 반복문을 이용하여 순서대로 배열
            인덱스에 넣은 후 그 값을 출력하세요.

            (단, 다른 클래스 파일을 생성해 해당 기능을 하는
            메소드를 만들어 그 객체를 불러와 결과를 출력하세요.)

            예) 1 2 3 4 5 6 7 8 9 10
         */

        Method hard = new Method();
        int index = hard.inputNum();
        int iarr2[] = new int[index];
        int receiveArr[] = hard.inputIndexNum(iarr2);
        hard.print(receiveArr);

    }
}