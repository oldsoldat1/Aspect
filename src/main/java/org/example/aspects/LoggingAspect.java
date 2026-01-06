package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.aspectj.lang.reflect.MethodSignature;
import org.example.Book;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static org.springframework.cglib.core.ReflectUtils.getSignature;

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


    @Before("org.example.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        System.out.println("beforeAddLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("----------------------------------------------");

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj:arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - "
                            + myBook.getName() + ", автор - "
                            + myBook.getAuthor() + ", год издания - "
                            + myBook.getYearOfPublication());

                }
                else if(obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет - " + obj);
                }
            }

        }
    }




}
