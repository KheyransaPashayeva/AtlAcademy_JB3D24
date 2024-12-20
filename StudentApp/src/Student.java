public class Student extends Academy {
    private String studentId; // Student-ə məxsus özəl field
    private String course;
    private String name;
    public Student(){

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address, String studentId, String course) {
        super(name, address); // Parent class constructor-u çağırılır
        this.studentId = studentId;
        this.course = course;
    }
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public Student(String studentId, String course, String name) {
        this.studentId = studentId;
        this.course = course;
        this.name = name;
    }

    // Getter və Setter metodları
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Student üçün əlavə metod
    public void study() {
        System.out.println("Tələbə ID: " + studentId + " kursda: " + course + " oxuyur.");
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student student)) return false;
//
//        if (!getStudentId().equals(student.getStudentId())) return false;
//        if (!getCourse().equals(student.getCourse())) return false;
//        return getName().equals(student.getName());
//    }
//
//    @Override
//    public int hashCode() {
//        int result = getStudentId().hashCode();
//        result = 31 * result + getCourse().hashCode();
//        result = 31 * result + getName().hashCode();
//        return result;
//    }
}
