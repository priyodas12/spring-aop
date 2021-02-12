package io.springlab;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class Human {


    // Fully Quallified Class Name
    @Before("execution(public void io.springlab.Student.doStudy())")
    public void wakeUp(){
        System.out.println("Wake up");
    }

    @After("execution(public void io.springlab.Student.doStudy())")
    public void doSleep(){
        System.out.println("Time to Bed");
    }
}
