package com.greedy.level01.basic;
import com.greedy.level01.basic.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.checkMethod();
        calc.checkMaxNumber(10,20);

        int arSeq = calc.sum1to10();
        int sum = calc.sumTwoNumber(10,20);
        int min = calc.minusTwoNumber(10,5);

        System.out.println(arSeq);
        System.out.println(sum);
        System.out.println(min);
    }
}
