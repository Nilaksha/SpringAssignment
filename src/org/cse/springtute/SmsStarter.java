package org.cse.springtute;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();

        Student std = (Student) context.getBean("student1");

        StudentManagementSystem sms = (StudentManagementSystem) context.getBean("sms");

        sms.listAllStudents();

        System.out.println("\n#######################################\n");
        
        std = (Student) context.getBean("student4");
        sms.registerStudent(std);
        std = (Student) context.getBean("student5");
        sms.registerStudent(std);
        std = (Student) context.getBean("student6");
        sms.registerStudent(std);
        
        sms.listAllStudents();
    }
}
