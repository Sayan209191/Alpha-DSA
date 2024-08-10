public class OOPS {
    public static void main(String[] args) {
        // Create Object of Pen Class
        Pen p1=new Pen(); // Create a pen object nammed p1
        p1.setColour("Blue");
        System.out.println(p1.getColour());
        p1.setTip(5);
        System.out.println(p1.getTip());
        // change colour 
        p1.setColour("Red");
        System.out.println(p1.getColour());

        // //  
        // BankAccount myAccount=new BankAccount();
        // myAccount.UserName="Sayan Ghorui";
        // myAccount.setPassWord("Sayan@123");
    }
}

// class BankAccount{
//     public String UserName;
//     private String Pass;
//     public void setPassWord(String pwd){
//         Pass=pwd;
//     }
// }

class Pen{
    
    private String colour;
    private int tip;
    void setColour(String new_Colour){  //  Setters
        colour=new_Colour;
    }
    String getColour(){    // Getters 
        return this.colour;  // this -> it is a keyword in java , refers to the current object
    }

    void setTip(int new_tip){
        tip=new_tip;
    }
    int getTip(){
        return this.tip;
    }
}
