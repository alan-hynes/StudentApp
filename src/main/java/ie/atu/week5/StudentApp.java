package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        //First instance of StudentDetails
        System.out.println("Please enter the student name : ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        StudentDetails student1 = new StudentDetails();
        student1.setName(name);
        System.out.println("You Entered : " + student1.getName());

        System.out.println("Please enter the student email : ");
        String email = input.next();
        student1.setEmail(email);
        System.out.println("You Entered : " + student1.getEmail());

        System.out.println("Please enter the student course : ");
        String course = input.next();
        student1.setCourse(course);
        System.out.println("You Entered : " + student1.getCourse());


        //Second instance of StudentDetails
        System.out.println("Please enter the student name : ");
        name = input.next();
        StudentDetails student2 = new StudentDetails(name);
        System.out.println("You Entered : " + student2.getName());

        System.out.println("Please enter the student email : ");
        email = input.next();
        student2.setEmail(email);
        System.out.println("You Entered : " + student2.getEmail());

        System.out.println("Please enter the student course : ");
        course = input.next();
        student2.setCourse(course);
        System.out.println("You Entered : " + student2.getCourse());


        //Third instance of StudentDetails
        System.out.println("Please enter the student name : ");
        name = input.next();
        System.out.println("You Entered : " + name);

        System.out.println("Please enter the student email : ");
        email = input.next();
        System.out.println("You Entered : " + email);

        System.out.println("Please enter the student course : ");
        course = input.next();
        System.out.println("You Entered : " + course);
        StudentDetails student3 = new StudentDetails(name, email, course);
    }
}
