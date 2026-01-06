package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

//        Book book = context.getBean("book", Book.class);
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);



        uniLibrary.getBook();
        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();


        context.close();

    }
}
