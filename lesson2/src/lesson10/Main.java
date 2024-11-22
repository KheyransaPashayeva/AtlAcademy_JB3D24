package lesson10;

public class Main {
    public static void main(String[] args) {
//        Object[] myNum = {10, "nbh", 2.4, 40};
//        for (int i = 0; i < myNum.length; i++) {
//            System.out.print(" "+myNum[i]);
//        }
//        System.out.println();
//        for (Object i:myNum){
//            System.out.print(" "+i);
//
//        }
//        String s="hello";
//        Integer a= (int) 2.2;
//        System.out.println(myNum.getClass().arrayType());
//        System.out.println(s.getClass().getTypeName());
////        System.out.println(a.getClass().getTypeName());

         Human person=new Human("Almaxanim","Ehmedov");
         Pet pet=new Pet("fdgsfsg","Hester",3,30);
         Human child=new Human("Ali");
         Family child2=new Family();
         child2.setChildren(child2.getChildren());
         Pet pet2=new Pet("dober",4);
         Family adam=new Family(person.getMother(),person.getFather(),pet);
         Human human1=new Human("Ulker","Rzazade",28,pet2, person.getMother(), person.getFather());
        System.out.println(human1);
        System.out.println(person);
        human1.describePet();
        pet.eat();
        pet2.eat();

//        adam.addChild(person.setMother(person.getMother()));
        adam.addChild("Sevil");
        System.out.println(adam);
    }
}
