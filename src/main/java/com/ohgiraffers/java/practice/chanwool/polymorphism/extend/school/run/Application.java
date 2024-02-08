package com.ohgiraffers.java.practice.chanwool.polymorphism.extend.school.run;

import com.ohgiraffers.java.practice.chanwool.polymorphism.extend.school.Chanwool;
import com.ohgiraffers.java.practice.chanwool.polymorphism.extend.school.Others;
import com.ohgiraffers.java.practice.chanwool.polymorphism.extend.school.Student;

public class Application {
    public static void main(String[] args) {

        Student student = new Student();
        student.work();
        student.learn();
        student.rest();
        student.eat();
        student.learn();
        student.study();
        student.goHome();
        System.out.println("===============================");

        Chanwool chanwool = new Chanwool();
        chanwool.work();
        chanwool.learn();
        chanwool.snack();
        chanwool.rest();
        chanwool.havruta();
        chanwool.eat();
        chanwool.learn();
        chanwool.headache();
        chanwool.snack();
        chanwool.study();
        chanwool.goHome();
        System.out.println("==============================");

        Others others = new Others();
        others.lookAtScreen();
        others.work();
        others.rest();
        others.learn();
        others.eat();
        others.learn();
        others.study();
        others.goHome();
        System.out.println("==============================");

        Student s1 = new Chanwool();
        Student s2 = new Others();

        s1.work();
        s2.work();

        if(s1 instanceof Chanwool){
            s1.learn();
        }
        if(s2 instanceof Others) {
            s2.learn();
        }

        

    }
}
