import java.util.*;
public class Interfaces {
    public static void main(String[] args) {
        // Queen q=new Queen();
        // q.move();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your age : ");
        int age=(sc.nextInt());
        sc.nextLine();
        System.out.println(age);
        System.out.print("Enter Your name : ");
        String name=sc.nextLine();
        System.out.println(name);


        sc.close();
    }
}

interface ChessPlayer{
    void move();
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("up,down,right,left,diagonal(all 4 dir)");
    }
}

class Rook implements ChessPlayer{
    public void move(){
        System.out.println("up,down,right,left");
    }
}
class King implements ChessPlayer{
    public void move(){
        System.out.println("up,down,right,left,diagonal(by 1 step)");
    }
}