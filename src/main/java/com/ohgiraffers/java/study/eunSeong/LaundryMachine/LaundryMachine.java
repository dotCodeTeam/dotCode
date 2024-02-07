package com.ohgiraffers.java.study.eunSeong.LaundryMachine;

public class LaundryMachine {
    private boolean isOn;   //초기에는 시동이 꺼진 false 상태이다.
    private boolean laundry;
    private boolean laundrySoap;
    private int laundryTime;
    private boolean laundryStart;


    public void startUp() {
        if (isOn) {
            System.out.println("이미 세탁기 전원이 켜졌습니다.");
        } else {
            this.isOn = true;
            System.out.println("띠리리리링~~!! 세탁기 전원이 켜졌습니다.");
        }
    }

    public void laundryIn() {
        if (isOn) {
            if (laundry) {
                System.out.println("이미 빨래감이 들어있습니다! 세제를 투입해주세요!");
            } else {
                this.laundry = true;
                System.out.println("가져오신 빨래감을 넣었습니다");
            }
        } else {
            System.out.println("세탁기 전원이 켜져 있지 않습니다. 전원을 먼저 켜주세요.");
        }

    }

    public void laundrySoapIn() {
        if (isOn) {
            if (laundry) {
                if (laundrySoap) {
                    System.out.println("이미 세제를 투입하였습니다! 시간을 설정해주세요!");
                } else {
                    this.laundrySoap = true;
                    System.out.println("세탁 세제를 투입하였습니다.");
                    System.out.println("이제 세탁시간을 설정해주세요. 한번 누를때마다 10분씩 늘어납니다.");
                }
            } else {
                System.out.println("아직 빨래감을 넣지 않으셨습니다. 빨래감 먼저 넣어주세요.");
            }
        } else {
            System.out.println("세탁기 전원이 켜져 있지 않습니다. 전원을 먼저 켜주세요.");
        }

    }

    public void laundryTimeIn() {
        if (isOn) {
            if (laundry) {
                if (laundrySoap) {
                    this.laundryTime += 10;
                    System.out.println("현재 설정하신 세탁시간은 " + this.laundryTime + "분 입니다.");
                } else {
                    System.out.println("아직 세제를 넣지 않으셨습니다. 세제를 넣어주세요.");
            }
        } else {
                System.out.println("아직 빨래감을 넣지 않으셨습니다. 빨래감 먼저 넣어주세요.");
            }
    } else {
            System.out.println("세탁기 전원이 켜져 있지 않습니다. 다시 전원을 켜주세요.");
    }
}


    public void laundryStart() {

        if (isOn) {
            if (laundry) {
                if (laundrySoap) {
                    if (this.laundryTime > 0) {
                        System.out.println("빨래를 시작합니다.");
                        for (int i = this.laundryTime; i >= 1; i--) {
                            System.out.println("남은 시간: " + i + "분");
                            try {
                                Thread.sleep(1000); // 1초 대기
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        this.isOn = false;
                        System.out.println("세탁이 완료되었습니다.");
                        System.out.println("빨래를 종료합니다.");
                        System.out.println("새로운 세탁을 원하시면 전원을 켜주시기 바랍니다.");

                    } else {
                        System.out.println("세탁시간이 설정되어있지 않습니다. 세탁시간을 설정해주세요.");
                    }
                } else {
                    System.out.println("아직 세탁시간을 설정하지 않으셨습니다. 시간을 설정해주세요.");
                }
            } else {
                System.out.println("아직 빨래감을 넣지 않으셨습니다. 빨래감 먼저 넣어주세요.");
            }
        } else {
            System.out.println("세탁기 전원이 켜져 있지 않습니다. 전원을 먼저 켜주세요.");
        }
    }
}
