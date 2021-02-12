package io.springlab;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public void doStudy(){
        //tight coupling way
        //new Human().wakeUp();
        System.out.println("Study Mood On!");
    }
}
