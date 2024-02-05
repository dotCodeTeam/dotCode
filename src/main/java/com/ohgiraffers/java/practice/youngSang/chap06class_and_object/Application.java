package com.ohgiraffers.java.practice.youngSang.chap06class_and_object;

public class Application {
    public static void main(String[] args) {

        MemberVO member = new MemberVO();

        member.setId("user01");
        member.setPwd("password123");
        member.setName("kys");
        member.setAge(30);
        member.setGender('M');
        member.setPnum("010-0000-0000");
        member.setEmail("abc@example.com");


        System.out.println("ID: " + member.getId());
        System.out.println("Password: " + member.getPwd());
        System.out.println("Name: " + member.getName());
        System.out.println("Age: " + member.getAge());
        System.out.println("Gender: " + member.getGender());
        System.out.println("Phone: " + member.getPhone());
        System.out.println("Email: " + member.getEmail());


    }
}
