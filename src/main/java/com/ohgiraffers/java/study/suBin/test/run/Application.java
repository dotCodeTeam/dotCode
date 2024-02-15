package com.ohgiraffers.java.study.suBin.test.run;

import com.ohgiraffers.java.study.suBin.test.controller.BookManager;
import com.ohgiraffers.java.study.suBin.test.view.BookMenu;

public class Application {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        BookMenu menu = new BookMenu();
        menu.menu();



    }
}
