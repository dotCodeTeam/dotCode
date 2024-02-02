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

    public int[] indexLength(int[] arr) {

        if(arr.length <= 10) {
            for( int i = 0; i < arr.length; i++ ){
                arr[i] = i+1;
            }
        } else {    System.out.println("인덱스 길이 값이 10을 초과하였습니다.");
            arr = null;
        }
        return arr;
    }

    public void printArr(int index, int[] arrTemp2) {
        System.out.println("======================"); System.out.print(" ");

        for (index = 0; index < arrTemp2.length; index++ ) {
            System.out.print(arrTemp2[index] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.print(" ");
    }

}
