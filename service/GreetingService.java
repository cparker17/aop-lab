package platform.codingnomads.co.aspectorientedprogramming.lab.service;

import org.springframework.stereotype.Service;
import platform.codingnomads.co.aspectorientedprogramming.lab.aspect.Printable;

@Service
public class GreetingService {

    public void greeting() {
        System.out.println("This is printing from inside greeting method.");
    }

    @Printable
    public void testMethod() {
        System.out.println("This is printing from inside test method.");
    }
}
