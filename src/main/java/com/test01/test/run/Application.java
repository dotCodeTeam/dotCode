package com.ohgiraffers.test.run;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;
import com.ohgiraffers.test.view.BookMenu;

public class Application {
    public static void main(String[] args) {

        BookMenu bm = new BookMenu();
        bm.menu();
    }
}
