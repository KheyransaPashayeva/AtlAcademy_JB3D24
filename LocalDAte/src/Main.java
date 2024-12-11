import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tələbələrin məlumatlarını təyin edin
        Student[] students = {
                new Student("Hüseyn", LocalDate.of(2005, 3, 15)),
                new Student("Aydın", LocalDate.of(2010, 7, 20)),
                new Student("Tural", LocalDate.of(1995, 11, 5))
        };

        // Original array-i clone edin
        Student[] clonedStudents = students.clone();
       Arrays.stream(clonedStudents).sorted();
        // Original array-i manual copy edin
        Student[] copiedStudents = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            copiedStudents[i] = students[i];
        }

        // 18 yaşından kiçik tələbələri seçin
        int count = 0;
        for (Student student : students) {
            if (student.calculateAge() < 18) {
                count++;
            }
        }

        Student[] under18 = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student.calculateAge() < 18) {
                under18[index++] = student;
            }
        }

        // Nəticələri çap edin
        System.out.println("\nOriginal tələbələr:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nClone edilmiş tələbələr:");
        for (Student student : clonedStudents) {
            System.out.println(student);
        }

        System.out.println("\nManual copy edilmiş tələbələr:");
        for (Student student : copiedStudents) {
            System.out.println(student);
        }

        System.out.println("\n18 yaşından kiçik tələbələr:");
        for (Student student : under18) {
            System.out.println(student.getName());
        }
    }



}
