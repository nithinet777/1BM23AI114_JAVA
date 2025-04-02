import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int marks;
    String name;
}

public class Records {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 5;

        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("enter marks:");
            student.marks = scanner.nextInt();
            System.out.println("enter:");
            student.name = scanner.next();
            list.add(student);
        }

        int highestMarks = Integer.MIN_VALUE;
        String highestStudent = "";

        for (Student student : list) {
            if (student.marks > highestMarks) {
                highestMarks = student.marks;
                highestStudent = student.name;
            }
        }

        System.out.println("Student with the highest marks: " + highestStudent + " with marks " + highestMarks);
    }
}
//enter marks:
//56
//enter:
//aqueel
//enter marks:
//59
//enter:
//madhu
//enter marks:
//44
//enter:
//nithin
//enter marks:
//50
//enter:
//gowthi
//enter marks:
//44
//enter:
//karthi
//Student with the highest marks: madhu with marks 59
//
//Process finished with exit code 0