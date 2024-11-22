package lesson10;

public class Human{
    private String name;
    private String surname;
    private int year;
    private Pet pet;

    private Human mother;
    private Human father;

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String surname, int year, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human(Human mother) {
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void describePet() {
        System.out.println("I have a " + pet.getSpecies() + ",he is " + pet.getAge() + " years old,he is"
                + (pet.getTrickLevel() <= 50 ? "almost not sly" : "very sly"));
    }
}
