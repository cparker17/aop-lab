package platform.codingnomads.co.aspectorientedprogramming.lab.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Aspect
@Component
public class GreetingServiceAspect {
    @Before("execution(* platform.codingnomads.co.aspectorientedprogramming.lab.service.GreetingService.greeting())")
    public void printToConsoleBefore(JoinPoint joinPoint) {
        System.out.println("Before");
    }

    @AfterReturning("execution(* platform.codingnomads.co.aspectorientedprogramming.lab.service.GreetingService.greeting())")
    public void printToConsoleAfter(JoinPoint joinPoint) {
        System.out.println("After Returning");
    }

    @Pointcut(value = "execution(* platform.codingnomads.co.aspectorientedprogramming.lab.service.GreetingService.testMethod())")
    private void printCutGreetingServiceTestMethod() {
    }

    @Before("printCutGreetingServiceTestMethod()")
    public void printBeforeAdvice(JoinPoint joinPoint) {
        System.out.println("Printing before the test method is called.");
    }
}
