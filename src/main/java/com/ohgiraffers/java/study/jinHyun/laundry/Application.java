package com.ohgiraffers.java.study.jinHyun.laundry;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        LaundryMachine laundryMachine1 = new LaundryMachine();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("== 세탁물 돌리기 ==");
            System.out.println("1. 전원을 켠다.");
            System.out.println("2. 빨래감을 넣는다.");
            System.out.println("3. 세제를 넣는다.");
            System.out.println("4. 시간설정을 한다.");
            System.out.println("5. 빨래가 다 되면 탈수를 한다. ");
            System.out.println("9. 세탁을 종료 합니다.");
            System.out.print("번호를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : laundryMachine1.isOn(); break;
                case 2 : laundryMachine1.inPut();break;
                case 3 : laundryMachine1.sj();break;
                case 4 : laundryMachine1.clack();break;
                case 5 : laundryMachine1.ts();break;
                case 9 : System.out.println("프로그램을 종료합니다.");break;
                default: System.out.println("잘못된 번호를 선택하셨습니다.");break;
            }
            if (no == 9) {
                break;
            }




        }
    }
}
