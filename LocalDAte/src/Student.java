import java.time.LocalDate;
import java.time.Period;

class Student {
    private final String name;
    private final LocalDate birthDate;

    // Constructor
    public Student(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int calculateAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Ad: " + name + ", Doğum tarixi: " + birthDate + ", Yaş: " + calculateAge();
    }
}
