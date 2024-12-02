
public class Main {
    public static void main(String[] args) {
//        Student student = new Student("Atl Academy","Baku,Azerbaijan","S234","Java backend");
////        student.displayInfo();
//        Student student5 =new Student("CodeAcademy","Azerbaijan","S456","Frontend");
////        student.study();
//        Student student1 = new Student("S123", "Ali Ehmedov");
//        Student student2 = new Student("S124", "Leyla");
//        Student student3 = new Student("S125", "Nigar");
        Student student4=new Student("S456");
        String s="S456";
        String s2= new String("S456");
        Student student3 = new Student("S456");
        Academy academy=new Academy("S456");

        System.out.println(student4.equals(academy));//false
        System.out.println(s.equals(s2));//true
     //   System.out.println(s2.equals(student4));//false
        System.out.println(student3.equals(student4));







//        Teacher teacher = new Teacher("Atl Academy", "Bakı, Azərbaycan", "T456", "Java");
//        teacher.displayInfo();
//        teacher.teach();
//
//        academy.addStudent(student1);
//        academy.addStudent(student2);
//        academy.addStudent(student3);
//        academy.addStudent(student4);
//
//        academy.displayStudents();
//        academy.removeStudent("S124");
//
//        academy.displayStudents();



    }
}