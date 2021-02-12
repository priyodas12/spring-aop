package io.springlab;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);

        Student student=con.getBean("student",Student.class);
        student.doStudy();

    }
}
