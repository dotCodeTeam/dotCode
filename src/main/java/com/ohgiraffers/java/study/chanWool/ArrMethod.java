package com.ohgiraffers.java.study.chanWool;

import java.util.Scanner;

public class ArrMethod {

    public void arrMethod1(){

        int iarr[] = new int[10];
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

    public int[] inputIndexNum(int[] arrTemp) {
        int[] arr = arrTemp;
        for( int i = 0; i < arr.length; i++ ){
            arr[i] = i+1;
        }
        return arr;
    }

    public void print(int[] arrTemp2) {
        int[] result = arrTemp2;
        int index;
        for (index = 0; index < result.length; index++ ) {
            System.out.print(result[index] + " ");
        }
        System.out.println();
        System.out.println("=====================");
        System.out.print(" ");
    }

}
