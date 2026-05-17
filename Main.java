package school;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        try {

            System.out.print("Enter student name: ");
            String sName = input.nextLine();

            System.out.print("Enter student age: ");
            int sAge = input.nextInt();

            System.out.print("Enter grade level: ");
            int grade = input.nextInt();
            input.nextLine();

            people.add(new Student(sName, sAge, grade));

            System.out.print("Enter teacher name: ");
            String tName = input.nextLine();

            System.out.print("Enter teacher age: ");
            int tAge = input.nextInt();
            input.nextLine();

            System.out.print("Enter subject: ");
            String subject = input.nextLine();

            people.add(new Teacher(tName, tAge, subject));

            for(Person p : people){
                p.displayInfo();
                System.out.println();
            }

        }

        catch(Exception e){
            System.out.println("Invalid input.");
        }

        input.close();
    }
}
