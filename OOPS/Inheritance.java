public class Inheritance {
    public static void main(String[] args) {
        Fish1 catFish1=new Fish1();
        catFish1.eat();
    }
}
// Base class
class Animal12{  
    String colour;
    void eat(){
        System.out.println("Eats !!!!");
    }
    void breaths(){
        System.out.println("Breaths !!");
    }
}
// Derived Class
class Fish1 extends Animal12{
    int fins;
    void swims(){
        System.out.println("Swims in water");
    }
}

// Derived class

class Mammal extends Animal12{
    int legs;
}

// Derived class (Multilevel Inheritance)

class Dog extends Mammal{
    String breed;
}