import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Sort students by CGPA");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student ID: ");
                int id = sc.nextInt();

                sc.nextLine(); // clear buffer

                System.out.print("Enter student name: ");
                String name = sc.nextLine();

                System.out.print("Enter CGPA: ");
                double cgpa = sc.nextDouble();

                Student s = new Student(id, name, cgpa);
                students.add(s);

                System.out.println("Student added successfully!");
            } 
            else if (choice == 2) {
                System.out.println("\n--- Student List ---");
                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    for (Student s : students) {
                        System.out.println(s);
                    }
                }
            } 
            else if (choice == 3) {
                if (students.isEmpty()) {
                System.out.println("No students to sort.");
                } else {
                students.sort((s1, s2) -> Double.compare(s2.getCgpa(), s1.getCgpa()));
                System.out.println("Students sorted by CGPA (High to Low).");
                }
            }
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }            
        }

        sc.close();
    }
}
