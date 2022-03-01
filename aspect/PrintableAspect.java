package platform.codingnomads.co.aspectorientedprogramming.lab.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintableAspect {
    @Pointcut("@annotation(Printable)")
    public void executePrinting() {

    }

    @After("executePrinting()")
    public void printBeforeAspect() {
        System.out.println("Printing after test method from custom annotation.");
    }
}
