public class MethodOverriding {
    public static void main(String[] args) {
        Animal1 d1 = new Deer();
        Animal1 d2 = new Animal1();
        d.eat();
        d1.eat();
        d2.eat();
    }

}

class Animal1 {
    void eat() {
        System.out.println("Eat Anythings !!");
    }
}

class Deer extends Animal1 {
    void eat() {
        System.out.println("Deer Eats Grashes !!!");
    }
}

  
