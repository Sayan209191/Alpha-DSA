public class Abstraction {
    public static void main(String[] args) {
        Horses h=new Horses();
        h.eat();
        h.walk();
        System.out.println(h.colour);
        Chicken ck=new Chicken();
        ck.eat();
        ck.walk();
    }
}
// By Using Abstract Class -->
abstract class Animal{
    String colour;
    Animal(){
        colour="Brown";
    }
    void eat(){
        System.out.println("Animal Eat");
    }
    abstract void walk();
}
class Horses extends Animal{
    void changeColour(){
        colour="Black";
    }
    void walk(){
        System.out.println("Horses walk in four legs");
    }
}
class Chicken extends Animal{
    void changeColour(){
        colour="White";
    }
    void walk(){
        System.out.println("Walks by two legs with dancing dancing");
    }
}
