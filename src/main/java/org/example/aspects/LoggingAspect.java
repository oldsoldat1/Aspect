package org.example.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {


//    @Pointcut("execution(* org.example.UniLibrary.*(..)")
//    private void allMethodsUniLibrary(){
//    }
//    @Pointcut("execution(public void org.example.UniLibrary.returnMagazine()")
//    private void returnMagazineFromUniLibrary(){
//    }
//
//    @Pointcut("allMethodsUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
//    }
//
//    @Pointcut("execution(* org.example.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//
//    }
//    @Pointcut("execution(* org.example.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//
//    }
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){
//
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }
//






    @Before("org.example.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
    }




}
