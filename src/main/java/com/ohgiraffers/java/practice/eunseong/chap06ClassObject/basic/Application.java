package com.ohgiraffers.java.practice.eunseong.chap06ClassObject.basic;

public class Application {
    public static void main(String[] args) {
        // User 객체 생성
        MemberVO user = new MemberVO();

        // getter를 사용하여 초기값 확인

        System.out.println("=========초기값 확인==========");
        System.out.println("ID: " + user.getId());
        System.out.println("Password: " + user.getPwd());
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Gender: " + user.getGender());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("Email: " + user.getEmail());

        // Setter를 사용하여 속성 설정

        System.out.println("============필드 값 변경===========");
        user.setId("user01");
        user.setPwd("pass01");
        user.setName("홍길동");
        user.setAge(20);
        user.setGender("M");
        user.setPhone("010-1234-5678");
        user.setEmail("hong123@greedy.com");

        // Getter를 사용하여 속성 가져오기
        System.out.println("===========변경된 필드값 확인==========");
        System.out.println("변경후 ID: " + user.getId());
        System.out.println("변경후 Password: " + user.getPwd());
        System.out.println("변경후 Name: " + user.getName());
        System.out.println("변경후 Age: " + user.getAge());
        System.out.println("변경후 Gender: " + user.getGender());
        System.out.println("변경후 Phone: " + user.getPhone());
        System.out.println("변경후 Email: " + user.getEmail());

    }
}
