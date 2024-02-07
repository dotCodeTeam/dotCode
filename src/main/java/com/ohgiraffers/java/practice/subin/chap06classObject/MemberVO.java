package com.ohgiraffers.java.practice.subin.chap06classObject;

public class MemberVO {
    public String id;
    public String pwd;
    public String name;
    public int age;
    public char gender;
    public String phone;
    public String email;

    public void MemberVO(){}

    public void setId(String id){
        this.id = id;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age =age;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getId(){
        return id;
    }
    public String getPwd(){
        return pwd;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }

}
