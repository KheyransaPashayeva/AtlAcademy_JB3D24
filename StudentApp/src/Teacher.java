public class Teacher extends Academy {
    private String teacherId;
    private String subject;

     public Teacher(){

     }
    public Teacher(String name, String address, String teacherId, String subject) {
        super(name, address); // Parent class constructor-u çağırılır
        this.teacherId = teacherId;
        this.subject = subject;
    }


    // Getter və Setter metodları
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String teacherId, String subject) {
        this.teacherId = teacherId;
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Müəllim ID: " + teacherId + " fənd: " + subject + " tədris edir.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;

        return getSubject().equals(teacher.getSubject());
    }

    @Override
    public int hashCode() {
        int result = getTeacherId().hashCode();
        result = 31 * result + getSubject().hashCode();
        return result;
    }
}