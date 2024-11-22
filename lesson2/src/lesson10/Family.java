package lesson10;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private String[]  children;
    private Pet pet;

    public Family() {
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

    public String[] getChildren() {
        return children;
    }

    public void setChildren(String[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father, String [] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    public Family(String[] children) {
        this.children = children;
    }

    public String[] addChild(String child){

        // Create a new array with one additional element
        String[] newChildren = new String[children.length + 1];

        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }

        newChildren[children.length] = child;

        children = newChildren;
        return children;

    }
//    public void deleteChild(String child) {
//        int indexToDelete = -1;
//        for (int i = 0; i < children.length; i++) {
//            if (children[i] == child) {
//                indexToDelete = i;
//                break;
//            }
//        }
//        if (indexToDelete != -1) {
//            // Create a new array with one less element
//            Human[] newArray = new Human[children.length - 1];
//            int newIndex = 0;
//            // Copy elements from the original array to the new array, skipping the element to delete
//            for (int i = 0; i < children.length; i++) {
//                if (i != indexToDelete) {
//                    newArray[newIndex] = children[i];
//                    newIndex++;
//                }
//            }
//            // Assign the new array to the original array variable
//            children = newArray;
//        }
//    }
}
