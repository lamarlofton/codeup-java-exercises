package grades;

import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication {


    public static void CommandLineGame(HashMap <String, Student> students) {
        int total = 0;
        System.out.println("Welcome to the grading application!");
        System.out.println("Here are our students GitHub usernames");
        do {
            System.out.println(students.keySet());
            System.out.println("What student would you like to see more information on? \n" +
                    "You can also type 'all' to see all the students and their grades, or 'overall' to see the classes overall grade average");
            Scanner scan = new Scanner(System.in);
            String userChoice = scan.nextLine();
            if(userChoice.equalsIgnoreCase("all")) {
                for (String student : students.keySet()) {
                    System.out.println(students.get(student).getName() + students.get(student).getGrades());
                }
            }
            if(userChoice.equalsIgnoreCase("Overall")) {
                for (String student : students.keySet()) {
                    total += students.get(student).getGradeAverage();
                }
                System.out.println("The classes overall grade average is " + total/students.size());
                System.out.println("Would you like to see another student? [y/n]");
                String keepGoing = scan.next();
                if (keepGoing.equalsIgnoreCase("n")){
                    System.out.println("Thanks for using the grading application!");
                    return;
                }
            }else if (students.containsKey(userChoice)) {
                System.out.println("That students name is " + students.get(userChoice).getName());
                System.out.println("Here are the students grades " + students.get(userChoice).getGrades());
                System.out.println("Their average grade is " + students.get(userChoice).getGradeAverage());
                System.out.println("Would you like to see another student? [y/n]");
                String keepGoing = scan.next();
                if (keepGoing.equalsIgnoreCase("n")){
                    System.out.println("Thanks for using the grading application!");
                    return;
                }

            } else {
                System.out.println("Sorry, that student doesn't exist!");
                System.out.println("Would you like to see another student? [y/n]");
                String keepGoing = scan.next();
                if (keepGoing.equalsIgnoreCase("n")){
                    System.out.println("Thanks for using the grading application!");
                    return;
                }
            }
        } while(true);
    }

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("LaMar");
        Student s2 = new Student("Linda");
        Student s3 = new Student("David");
        Student s4 = new Student("Matt");

        s1.addGrade(92);
        s1.addGrade(88);
        s1.addGrade(96);
        s2.addGrade(99);
        s2.addGrade(100);
        s2.addGrade(89);
        s3.addGrade(82);
        s3.addGrade(90);
        s3.addGrade(98);
        s4.addGrade(90);
        s4.addGrade(80);
        s4.addGrade(72);
        students.put("lamarlofton", s1);
        students.put("linda.zk", s2);
        students.put("david.g.90", s3);
        students.put("matt_GinGrass", s4);

        CommandLineGame(students);

    }

}