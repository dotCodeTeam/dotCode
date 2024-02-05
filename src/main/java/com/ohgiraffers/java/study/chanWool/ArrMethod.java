package com.ohgiraffers.java.study.chanWool;

import java.util.Scanner;

public class ArrMethod {

    public void arrMethod(){

        int[] iarr = new int[10];
        for( int i = 0; i < iarr.length; i++ )   {
            iarr[i] = i+1;
            System.out.print(iarr[i] + " ");
        }
    }

    public int inputNum()  {
        Scanner sc = new Scanner(System.in);
        System.out.print("인덱스 길이 값 입력 : ");
        return sc.nextInt();
    }

    public int[] indexLength(int[] arr) {       // int[] arr = iarr;
                                                // parameter = argument;
        if( arr.length > 0 && arr.length <= 10 ) {
            for( int i = 0; i < arr.length; i++ ) {
                arr[i] = i+1;
            }
        } else {
            arr = null;
            System.out.println("인덱스 길이 값이 10을 초과하였습니다.");
            System.out.println("===============================");
        }
        return arr;
    }

    public void printResult(int[] arrTemp) {        // arrTemp = {1,2,3,4,5};
        System.out.println("======================"); System.out.print(" ");

        for (int i = 0; i < arrTemp.length; i++ ) {
            System.out.print(arrTemp[i]+ " ");
        }
        System.out.println(); System.out.println(); System.out.print(" ");
    }

}
