package com.ohgiraffers.java.study.suBin.LaundryMachine;

import java.util.Scanner;

public class Human {
    public void doLaundry(LaundryMachine laundryMachine) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 빨래감 확인
        System.out.print("빨래감이 있습니까? (있으면 y, 없으면 그 외의 키 입력) : ");
        String answer = sc.nextLine();

        if (answer.equals("y")) {
            laundryMachine.insertLaundry();
        } else {
            System.out.println("빨래감이 없어서 빨래를 할 수 없습니다. 열심히 생활해서 빨래감을 만들어오세요.");
            sc.close();
            return;
        }

        // 세탁기 전원 켜기 여부 확인
        System.out.print("세탁기 전원을 켜시겠습니까? (켜려면 y, 그 외의 키 입력): ");
        answer = sc.nextLine();

        if (answer.equals("y")) {
            laundryMachine.turnOn();
        } else {
            System.out.println("세탁을 할 생각이 없으시군요. 프로그램을 종료합니다.");
            return;
        }

        // 세제 넣는 여부 확인
        do {
            System.out.print("세제를 넣으셨습니까? (넣었으면 y, 그 외의 키 입력): ");
            answer = sc.nextLine();

            if (answer.equals("y")) {
                laundryMachine.addDetergent();
                break; // 세제를 넣었으면 반복문 탈출
            } else {
                System.out.println("세제를 넣지 않으셨습니다. 세제는 넣고 세탁을 하셔야죠.");
            }
        } while (true);

        //세탁 시간 입력 받기
        int time;
        do {
            System.out.println("세탁 시간을 10분 단위로 입력해주세요.(10, 20, 30, 40 중 하나): ");
            time = sc.nextInt();
            if (time != 10 && time != 20 && time != 30 && time != 40) {
                System.out.println("유효하지 않은 세탁 시간입니다. 다시 입력해주세요.");
            }
        } while (time != 10 && time != 20 && time != 30 && time != 40);

        laundryMachine.setTime(time);

        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        laundryMachine.spinDry();

        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        laundryMachine.turnOff();

        sc.close();
    }
}
