package com.ohgiraffers.java.practice.subin.chap06classObject;

public class Application {

    public static void main(String[] args) {
        //getter를 이용해서 필드의 초기값 확인
        //setter를 이용해서 필드 값 변경
        //getter를 이용해서 변경된 필드값 확인

        MemberVO mv = new MemberVO();
        System.out.println("id : " + mv.getId());
        System.out.println("pwd : " + mv.getPwd());
        System.out.println("name : " + mv.getName());
        System.out.println("age : " + mv.getAge());
        System.out.println("gender : " + mv.getGender());
        System.out.println("phone : " + mv.getPhone());
        System.out.println("email : " + mv.getEmail());

        mv.setId("user01");
        mv.setPwd("pass01");
        mv.setName("홍길동");
        mv.setAge(20);
        mv.setGender('M');
        mv.setPhone("010-1234-5678");
        mv.setEmail("hong123@greedy.com");

        System.out.println("변경 후 id : " + mv.getId());
        System.out.println("변경 후 pwd : " + mv.getPwd());
        System.out.println("변경 후 name : " + mv.getName());
        System.out.println("변경 후 age : " + mv.getAge());
        System.out.println("변경 후 gender : " + mv.getGender());
        System.out.println("변경 후 phone : " + mv.getPhone());
        System.out.println("변경 후 email : " + mv.getEmail());
    }
}
