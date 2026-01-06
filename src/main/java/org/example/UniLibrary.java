package org.example;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{


    public void getBook(){
        System.out.println("Я беру книгу из UniLibrary");

    }

    public void returnBook(){
        System.out.println("Я возвращаю книгу в UniLibrary");

    }
    public void getMagazine(){
        System.out.println("Я беру журнал из UniLibrary");

    }

    public void returnMagazine(){
        System.out.println("Я возвращаем журнал из UniLibrary");

    }

    public void addBook(){
        System.out.println("Я добавляю книгу в UniLibrary");

    }

    public void addMagazine(){
        System.out.println("Я добавляю журнал в UniLibrary");

    }

}
