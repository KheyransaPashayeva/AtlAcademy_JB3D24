
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Atl Academy","Baku,Azerbaijan","S234","Java backend");
        student.displayInfo();
        Student student5 =new Student("CodeAcademy","Azerbaijan","S456","Frontend");
        student.study();
        Student student1 = new Student("S123", "Ali Ehmedov");
        Student student2 = new Student("S124", "Leyla");
        Student student3 = new Student("S125", "Nigar");
        Student student4=new Student("S456","Asa");


        System.out.println();
        Academy academy = new Academy("Atl Academy", "Bakı, Azərbaycan");
        Teacher teacher = new Teacher("Atl Academy", "Bakı, Azərbaycan", "T456", "Java");
        teacher.displayInfo();
        teacher.teach();

        academy.addStudent(student1);
        academy.addStudent(student2);
        academy.addStudent(student3);
        academy.addStudent(student4);

        academy.displayStudents();
        academy.removeStudent("S124");

        academy.displayStudents();
    }
}