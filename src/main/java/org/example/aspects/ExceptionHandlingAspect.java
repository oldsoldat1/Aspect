package org.example.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("org.example.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: ловим/обрабатываем исключение при попытке взять книгу");

    }
}
