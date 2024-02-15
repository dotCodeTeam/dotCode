package com.ohgiraffers.java.study.chanWool.library.test.run;

import com.ohgiraffers.java.study.chanWool.library.test.controller.BookManager;
import com.ohgiraffers.java.study.chanWool.library.test.model.dto.BookDTO;
import com.ohgiraffers.java.study.chanWool.library.test.view.BookMenu;

public class Application {
    public static void main(String[] args) {

        BookMenu bm = new BookMenu();
        bm.menu();
    }
}
