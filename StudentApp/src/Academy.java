import java.util.Arrays;

public class Academy {
    private String name;
    private String address;
    private Student[] students;
    private int studentCount;
    public Academy() {
    }

    // Constructor
    public Academy(String name, String address) {
        this.name = name;
        this.address = address;
        this.students = new Student[10]; // Maksimum 10 tələbə üçün ilkin array
        this.studentCount = 0;
    }

    public Academy(String name) {
        this.name = name;
    }

    // Getter və Setter metodları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Ümumi metod
    public void displayInfo() {
        System.out.println("Akademiya adı: " + name);
        System.out.println("Ünvan: " + address);
    }

    public void addStudent(Student student) {//Student yaratdigimiz Student klasdir!
        if (studentCount == students.length) {
            // Array-i manual olaraq genişləndirmək
            Student[] newStudents = new Student[students.length + 5];
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            students = newStudents;
        }
        students[studentCount] = student;
        // Yeni tələbə əlavə olunur arr[1]="Ali"
        studentCount++;
        System.out.println(student.getName() + " tələbə olaraq əlavə edildi.");
    }

    // Tələbə silmək metodu
    public void removeStudent(String studentId) {
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].getStudentId() != null
                    && students[i].getStudentId() == studentId) {
                found = true;
                // Elementləri sola sürüşdürmək
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null; // Sonuncu elementi təmizləyirik
                studentCount--;
                System.out.println("Tələbə ID: " + studentId + " silindi.");
                break;
            }
        }
        if (!found) {
            System.out.println("Tələbə ID: " + studentId + " tapılmadı.");
        }
    }

    // Bütün tələbələri göstərmək metodu
    public void displayStudents() {
        if (studentCount == 0) {
            System.out.println("Heç bir tələbə yoxdur.");
        } else {
            System.out.println("Tələbə siyahısı:");
            for (int i = 0; i < studentCount; i++) {
                System.out.println((i + 1) + ". " + students[i].getName() + " (ID: " + students[i].getStudentId() + ")");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Academy academy)) return false;

        if (studentCount != academy.studentCount) return false;
        if (!getName().equals(academy.getName())) return false;
        if (!getAddress().equals(academy.getAddress())) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(students, academy.students);
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + Arrays.hashCode(students);
        result = 31 * result + studentCount;
        return result;
    }
}

