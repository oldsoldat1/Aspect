package org.example;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{


    public void getBook() {
        System.out.println("Я беру книгу из SchoolLibrary");

    }
}
